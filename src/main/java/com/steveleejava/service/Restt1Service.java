package com.steveleejava.service;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.HttpHeaders;
import com.steveleejava.model.Restt1Model;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpEntity;
@Service
@Component
public class Restt1Service {

	private String restt1_api_url ="http://27.35.71.110/TestApi?testno=6";
	
	
    public ResponseEntity<Restt1Model> Re(){
    //response 는 응답resource 에 대한	representation 을 반환해준다.
    
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders httpHeaders = new HttpHeaders();



        return restTemplate.exchange(restt1_api_url, HttpMethod.GET, new HttpEntity(httpHeaders),Restt1Model.class);

    }

	
	
	
}
