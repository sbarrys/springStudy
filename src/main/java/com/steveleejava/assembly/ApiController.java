package com.steveleejava.assembly;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.steveleejava.model.JsonTest;
import com.steveleejava.model.Restt1Model;
import com.steveleejava.service.Restt1Service;

//@RestController
@Controller
@RequestMapping("/TestApi")
public class ApiController {
	
//	private final Restt1Service  rest_t1_service;
//	
//	public ApiController(Restt1Service rest_t1_service) {
//		this.rest_t1_service= rest_t1_service;
//	}
	private String url="http://27.35.71.110/TestApi?testno=6" ;
	private String original;
	RestTemplate resttemplate= new RestTemplate();
	
	@GetMapping("/t1")
    public String getT1(HttpServletRequest request, HttpServletResponse response,Model model) throws ParseException {
		JSONParser jsonParse= new JSONParser();
		JSONObject jsonObject=new JSONObject();
		JSONArray jsonArray = new JSONArray();
		ArrayList<JsonTest> list = new ArrayList<JsonTest>();
		original=resttemplate.getForObject(url, String.class);
		jsonArray= (JSONArray)jsonParse.parse(original);
	
		

		for(int i= 0; i<jsonArray.size();i++) {
			jsonObject=(JSONObject) jsonArray.get(i);
			String senttype=(String) jsonObject.get("senttype");
			String sentcont=(String) jsonObject.get("sentcont");
			Long sentno=(Long) jsonObject.get("sentno");

			list.add(new JsonTest(senttype,sentcont,sentno));
			
		}
		model.addAttribute("restRES_arraylist",list);
		return "tiles.layout";

	}

}
