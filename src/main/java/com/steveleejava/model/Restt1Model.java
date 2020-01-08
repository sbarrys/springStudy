package com.steveleejava.model;

import java.util.List;

import lombok.Data;

@Data
public class Restt1Model {
    private List<restt1ApiDocument> items;

	@Data
	private static class restt1ApiDocument{
		String senttype;
		String sentcont;
		String sentno;
	}
}
