package com.exchange.producer.app.resource;

import java.nio.charset.Charset;
import java.util.Random;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.exchange.producer.app.model.PaymentDetails;

@RestController
public class SendPaymentDetailsResource {
	
	@PostMapping("/producer/v2/paymentDetails")
	public PaymentDetails sendPaymentDetails(@RequestParam String instrId) {
		
		
		PaymentDetails pymntDet = new PaymentDetails();
		pymntDet.setPaymentInstructionId(instrId);
		pymntDet.setPaymentEndtoEndId(getRandomString());
		pymntDet.setNetworkId(getRandomString());
		
		return pymntDet;
	}
	
	private String getRandomString() {
		 String candidateChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		StringBuilder sb = new StringBuilder ();
        Random random = new Random ();
        for (int i = 0; i < 20; i ++) {
            sb.append (candidateChars.charAt (random.nextInt (candidateChars
                    .length ())));
        }

        return sb.toString ();

	}
	
}
