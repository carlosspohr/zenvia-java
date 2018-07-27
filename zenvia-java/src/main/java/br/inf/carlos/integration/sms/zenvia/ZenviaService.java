package br.inf.carlos.integration.sms.zenvia;

import java.util.List;

import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource.Builder;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.client.filter.HTTPBasicAuthFilter;
import com.sun.jersey.api.client.filter.LoggingFilter;
import com.sun.jersey.api.json.JSONConfiguration;
import com.sun.jersey.json.impl.provider.entity.JSONArrayProvider;

import br.inf.carlos.integration.sms.zenvia.beans.ZenviaRequest;
import br.inf.carlos.integration.sms.zenvia.communication.SendSmsMultiResponse;
import br.inf.carlos.integration.sms.zenvia.communication.SendSmsMultipleRequest;
import br.inf.carlos.integration.sms.zenvia.communication.SendSmsResponse;
import br.inf.carlos.integration.sms.zenvia.communication.SendSmsSingleRequest;
import br.inf.carlos.integration.sms.zenvia.communication.SendSmsSingleResponse;


public class ZenviaService {

	private static ZenviaService instance;
	private static final String BASE_URI = "https://api-rest.zenvia.com/services/";
	
	private static final String SEND_SINGLE_SMS="send-sms";
	private static final String SEND_MULTIPLE_SMS="send-sms-multiple";
	
	private ZenviaService(){
		
	}
	
	public static ZenviaService getInstance(){
		if(instance == null){
			instance = new ZenviaService();
		}
		
		return instance;
	}
	
	public SendSmsResponse send(String code, String password, ZenviaRequest sms){
		
		Builder builder = this.getBuilder(
				this.getDefaultConfig(code, password), 
				ZenviaService.SEND_SINGLE_SMS
		);
		
		SendSmsSingleRequest ssr= new SendSmsSingleRequest();
		ssr.setSendSmsRequest(sms);
		
		ClientResponse response = builder.post(ClientResponse.class, ssr);
		
		SendSmsSingleResponse res = response.getEntity(SendSmsSingleResponse.class);
		
		return res.getSendSmsResponse();
	}
	
	public List<SendSmsResponse> sendMultiple(String code, String password, ZenviaRequest... sms){
		
		Builder builder = this.getBuilder(
				this.getDefaultConfig(code, password), 
				ZenviaService.SEND_MULTIPLE_SMS
		);
		
		SendSmsMultipleRequest multi = new SendSmsMultipleRequest();
		
		for (ZenviaRequest zr : sms) {
			multi.getSendSmsRequestList().getSendSmsRequestList().add(zr);
		}
		
		ClientResponse response = builder.post(ClientResponse.class, multi);
		
		SendSmsMultiResponse res = response.getEntity(SendSmsMultiResponse.class);
		
		List<SendSmsResponse> retornos = res.getSendSmsMultiResponse().getSendSmsResponseList();
		
		return retornos;
	}
	
	private Builder getBuilder(Client client, String endpoint) {
		return client
				.resource(ZenviaService.BASE_URI+endpoint)
				.header("Accept", "application/json")
				.type(MediaType.APPLICATION_JSON)
				.accept(MediaType.APPLICATION_JSON);
	}

	private Client getDefaultConfig(String code, String password){
		
		ClientConfig clientConfig = new DefaultClientConfig();
		clientConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, true);
		clientConfig.getClasses().add(JSONArrayProvider.App.class);
		
		Client client = Client.create(clientConfig);
		client.addFilter(new HTTPBasicAuthFilter(code, password));
		client.addFilter(new LoggingFilter());
		
		
		return client;
	}
	
	public static void main(String[] args) {
		
		final String code = "user-code";
		final String password = "some-password";
		
		ZenviaRequest sms = new ZenviaRequest();
		sms.setFrom("Carlos Spohr Test");
		sms.setTo("5545000009999");
		sms.setMsg("Teste de envio de mensagens SMS");
		
		ZenviaService.getInstance().send(code, password, sms);
	}
}
