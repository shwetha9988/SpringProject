package com.example.demo.actuator;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id="my-custom-endpoint")
public class CustomEndPoints {
	Map<String,String> customMap=new HashMap<String,String>();
    @ReadOperation
	public Map customEndPoint() {
		customMap.put("v0.1","Spring boot actuator integred");
		customMap.put("v0.2", "Spring security integrated");
		customMap.put("v0.3", "swagger tool integrated");
		return customMap;
}
}
