package br.inf.carlos.integration.sms.zenvia.communication;

import org.codehaus.jackson.annotate.JsonProperty;

public class SendSmsResponse {

	@JsonProperty("statusCode")
	private String statusCode;
	@JsonProperty("statusDescription")
	private String statusDescription;
	@JsonProperty("detailCode")
	private String detailCode;
	@JsonProperty("detailDescription")
	private String detailDescription;

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getStatusDescription() {
		return statusDescription;
	}

	public void setStatusDescription(String statusDescription) {
		this.statusDescription = statusDescription;
	}

	public String getDetailCode() {
		return detailCode;
	}

	public void setDetailCode(String detailCode) {
		this.detailCode = detailCode;
	}

	public String getDetailDescription() {
		return detailDescription;
	}

	public void setDetailDescription(String detailDescription) {
		this.detailDescription = detailDescription;
	}

	@Override
	public String toString() {
		return "SendSmsResponse [statusCode=" + statusCode + ", statusDescription=" + statusDescription
				+ ", detailCode=" + detailCode + ", detailDescription=" + detailDescription + "]";
	}
}