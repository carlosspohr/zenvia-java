package br.inf.carlos.integration.sms.zenvia.communication;

import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

import br.inf.carlos.integration.sms.zenvia.beans.ZenviaRequest;

public class SendSmsMultipleRequestList {

    @JsonProperty("sendSmsRequestList")
    private List<ZenviaRequest> sendSmsRequestList = new ArrayList<ZenviaRequest>(0);

	public List<ZenviaRequest> getSendSmsRequestList() {
		return sendSmsRequestList;
	}

	public void setSendSmsRequestList(List<ZenviaRequest> sendSmsRequestList) {
		this.sendSmsRequestList = sendSmsRequestList;
	}

}