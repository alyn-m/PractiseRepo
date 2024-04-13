package com.producer.app.model;

public class Request {
	
	private String instrId;
	private String endToEndId;
	private String dateTime;
	private String msgType;
	
	public String getInstrId() {
		return instrId;
	}
	public void setInstrId(String instrId) {
		this.instrId = instrId;
	}
	public String getEndToEndId() {
		return endToEndId;
	}
	public void setEndToEndId(String endToEndId) {
		this.endToEndId = endToEndId;
	}
	public String getDateTime() {
		return dateTime;
	}
	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}
	public String getMsgType() {
		return msgType;
	}
	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}	
}
