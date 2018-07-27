package br.inf.carlos.integration.sms.zenvia.communication;

import org.codehaus.jackson.annotate.JsonProperty;

public class SendSmsMultiResponse {

    @JsonProperty("sendSmsMultiResponse")
    private SendSmsMultiResponseList sendSmsMultiResponse;

	public SendSmsMultiResponseList getSendSmsMultiResponse() {
		return sendSmsMultiResponse;
	}

	public void setSendSmsMultiResponse(SendSmsMultiResponseList sendSmsMultiResponse) {
		this.sendSmsMultiResponse = sendSmsMultiResponse;
	}
}