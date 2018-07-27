package br.inf.carlos.integration.sms.zenvia.communication;

import org.codehaus.jackson.annotate.JsonProperty;

import br.inf.carlos.integration.sms.zenvia.beans.ZenviaRequest;

public class SendSmsSingleRequest {

    @JsonProperty("sendSmsRequest")
    private ZenviaRequest sendSmsRequest;

	public ZenviaRequest getSendSmsRequest() {
		return sendSmsRequest;
	}

	public void setSendSmsRequest(ZenviaRequest sendSmsRequest) {
		this.sendSmsRequest = sendSmsRequest;
	}
}