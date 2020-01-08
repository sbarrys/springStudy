package com.steveleejava.assembly;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.steveleejava.model.Restt1Model;
import com.steveleejava.service.Restt1Service;

@RestController
@RequestMapping("/TestApi")
public class ApiController {
	
	private final Restt1Service  rest_t1_service;
	
	public ApiController(Restt1Service rest_t1_service) {
		this.rest_t1_service= rest_t1_service;
	}
	
	@GetMapping("/t1")
    public ResponseEntity<Restt1Model> getTest(@RequestParam(value="testno") int testno){
		return rest_t1_service.Re();
	}

}
