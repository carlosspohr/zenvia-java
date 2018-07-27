package br.inf.carlos.integration.sms.zenvia.communication;

import org.codehaus.jackson.annotate.JsonProperty;

public class SendSmsMultipleRequest {

    @JsonProperty("sendSmsMultiRequest")
    private SendSmsMultipleRequestList sendSmsRequestList = new SendSmsMultipleRequestList();

	public SendSmsMultipleRequestList getSendSmsRequestList() {
		return sendSmsRequestList;
	}

	public void setSendSmsRequestList(SendSmsMultipleRequestList sendSmsRequestList) {
		this.sendSmsRequestList = sendSmsRequestList;
	}
}