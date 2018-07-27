package br.inf.carlos.integration.sms.zenvia.communication;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

public class SendSmsMultiResponseList {

    @JsonProperty("sendSmsResponseList")
    private List<SendSmsResponse> sendSmsResponseList;

	public List<SendSmsResponse> getSendSmsResponseList() {
		return sendSmsResponseList;
	}

	public void setSendSmsResponseList(List<SendSmsResponse> sendSmsResponseList) {
		this.sendSmsResponseList = sendSmsResponseList;
	}
}