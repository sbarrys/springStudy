package com.steveleejava.model;

import lombok.Getter;
import lombok.Setter;

public class JsonTest {
	
	@Getter@Setter
		private String senttype;
	@Getter@Setter
		private String sentcont;
	@Getter@Setter
		private Long sentno;
	public JsonTest(String senttype,String sentcont,Long sentno){
		this.sentcont=sentcont;
		this.sentno=sentno;
		this.senttype=senttype;
	}
}
