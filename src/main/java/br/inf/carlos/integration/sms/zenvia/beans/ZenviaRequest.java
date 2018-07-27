package br.inf.carlos.integration.sms.zenvia.beans;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ZenviaRequest {

	@JsonProperty("id")
	private String id;
	
	@JsonProperty("from")
	private String from;
	
	@JsonProperty("to")
	private String to;
	
	@JsonProperty("msg")
	private String msg;
	
	@JsonProperty("schedule")
	private String schedule;
	
	@JsonProperty("callbackOption")
	private String callbackOption="NONE";
	
	@JsonProperty("aggregateId")
	private String aggregateId; // código de campanha.
	
	@JsonProperty("flashSms")
	private boolean flashSms = false;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getSchedule() {
		return schedule;
	}

	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}

	public String getCallbackOption() {
		return callbackOption;
	}

	public void setCallbackOption(String callbackOption) {
		this.callbackOption = callbackOption;
	}

	public String getAggregateId() {
		return aggregateId;
	}

	public void setAggregateId(String aggregateId) {
		this.aggregateId = aggregateId;
	}

	public boolean isFlashSms() {
		return flashSms;
	}

	public void setFlashSms(boolean flashSms) {
		this.flashSms = flashSms;
	}
}