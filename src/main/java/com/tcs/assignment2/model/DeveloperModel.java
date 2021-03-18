package com.tcs.assignment2.model;

import lombok.Data;

@Data
public class DeveloperModel {
	private Long id;
	private String name;
	private String email;
	private String skills;

	public DeveloperModel() {    }

}
