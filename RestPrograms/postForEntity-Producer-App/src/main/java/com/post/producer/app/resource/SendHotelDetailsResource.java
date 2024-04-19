package com.post.producer.app.resource;

import java.util.ArrayList;
import java.util.Random;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.post.producer.app.model.HotelDetails;

@RestController
public class SendHotelDetailsResource {
	
	@PostMapping("/oyo/v2/getdetails")
	public HotelDetails shareHotelDetails(@RequestParam String HotalName) {
		
		Random random = new Random();
		
		HotelDetails hotel = new HotelDetails();
		hotel.setName(HotalName);
		hotel.setEmptyRooms(random.nextInt(20));
		hotel.setLocation(getLocation());
		hotel.setPrice(random.nextFloat(1000f, 10000f));
		
		return hotel;
	}
	
	private String getLocation() {
		ArrayList<String> hotelList = new ArrayList<String>();
		hotelList.add("Hyderabad");
		hotelList.add("Banglore");
		hotelList.add("Pune");
		hotelList.add("Delhi");
		hotelList.add("Mumbai");
		hotelList.add("London");
		hotelList.add("Paris");
		hotelList.add("New York");
		hotelList.add("Mascow");
		hotelList.add("Dubai");
		
		Random randomInt = new Random();
		return hotelList.get(randomInt.nextInt(0, 10));
	}
}
