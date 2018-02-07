package com.kiran;

import org.springframework.web.client.RestTemplate;

public class EmployeeServices {

	public void getAllEmployee1(){
		String  url="http://localhost:8080/springrest1/welcome";
		RestTemplate temp=new RestTemplate();
		 String object = temp.getForObject(url, String.class);
		 System.out.println(object);
	}
	
}
