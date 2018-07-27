package br.inf.carlos.integration.sms.zenvia.communication;

import org.codehaus.jackson.annotate.JsonProperty;

public class SendSmsSingleResponse {

    @JsonProperty("sendSmsResponse")
    private SendSmsResponse sendSmsResponse;

	public SendSmsResponse getSendSmsResponse() {
		return sendSmsResponse;
	}

	public void setSendSmsResponse(SendSmsResponse sendSmsResponse) {
		this.sendSmsResponse = sendSmsResponse;
	}

	@Override
	public String toString() {
		return "SendSmsSingleResponse [sendSmsResponse=" + sendSmsResponse + "]";
	}
}