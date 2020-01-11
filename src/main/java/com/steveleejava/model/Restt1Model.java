package com.steveleejava.model;

import java.util.List;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class Restt1Model {
    
	@Getter @Setter
	private List<restt1ApiDocument> items;
    
	@Data
	public static class restt1ApiDocument{
		String senttype;
		String sentcont;
		String sentno;
		public restt1ApiDocument(String a,String b,String c) {
			this.senttype=a;
			this.sentcont=b;
			this.sentno= c;
			
		}
		
	}
}
