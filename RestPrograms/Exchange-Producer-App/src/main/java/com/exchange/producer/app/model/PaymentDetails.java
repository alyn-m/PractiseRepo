package com.exchange.producer.app.model;

public class PaymentDetails {
	
	private String networkId;
	
	public String getNetworkId() {
		return networkId;
	}
	public void setNetworkId(String networkId) {
		this.networkId = networkId;
	}
	
	private String paymentInstructionId;
	private String paymentEndtoEndId;
	
	
	public String getPaymentInstructionId() {
		return paymentInstructionId;
	}
	public void setPaymentInstructionId(String paymentInstructionId) {
		this.paymentInstructionId = paymentInstructionId;
	}
	public String getPaymentEndtoEndId() {
		return paymentEndtoEndId;
	}
	public void setPaymentEndtoEndId(String paymentEndtoEndId) {
		this.paymentEndtoEndId = paymentEndtoEndId;
	}
	@Override
	public String toString() {
		return "PaymentDetails [networkId=" + networkId + ", paymentInstructionId=" + paymentInstructionId
				+ ", paymentEndtoEndId=" + paymentEndtoEndId + "]";
	}	
}
