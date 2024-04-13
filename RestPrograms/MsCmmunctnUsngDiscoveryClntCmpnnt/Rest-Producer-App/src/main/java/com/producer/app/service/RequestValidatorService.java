package com.producer.app.service;

import java.time.LocalDateTime;

import com.producer.app.model.Request;

public class RequestValidatorService {
	
	public String validatePacs008Request(Request req){
		
		if(!validateInstrId(req.getInstrId())) return req.getInstrId();
		if(!validateEndtoEndId(req.getEndToEndId())) return "Invalid Endtoend id";
		if(!validateDateTime(req.getDateTime())) return "Invalid Datetime";
		
		return "Success";
	}
	
	boolean validateInstrId(String instrId){
		if(instrId == null) return false;
		if(instrId.length()>=20) return false;
		if(instrId.contains("~")) return false;
		
		return true;
	}
	boolean validateEndtoEndId(String endToEndId){
		if(endToEndId == null || endToEndId.length() >= 20 || endToEndId.contains("~"))
			return false;
		return true;
	}
	boolean validateDateTime(String dateTime){
		
		LocalDateTime localDateTime = LocalDateTime.now();
		LocalDateTime reqDateTime = LocalDateTime.parse(dateTime);
		
		if(reqDateTime.isAfter(localDateTime) ) return false;
		return true;
	}
}
