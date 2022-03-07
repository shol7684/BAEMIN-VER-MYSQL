package com.baemin;

import org.junit.jupiter.api.Test;

import com.baemin.dto.OrderList;
import com.google.gson.Gson;

public class GsonTest {

	@Test
	public void gson() {
		String s = "{\"foodId\":5,\"foodName\":\"불고기피자\",\"foodPrice\":5000,\"amount\":1,\"totalPrice\":5500,\"optionName\":[\"치즈추가\"],\"optionPrice\":[500],\"optionId\":[6]}/,{\"foodId\":5,\"foodName\":\"불고기피자\",\"foodPrice\":5000,\"amount\":1,\"totalPrice\":5000}";
		
		
		System.out.println(s);
		
		String[] arr=  s.split("/");
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		
		
		Gson gson = new Gson();
		
		gson.fromJson(arr[1], OrderList.class);
		
	}
}
