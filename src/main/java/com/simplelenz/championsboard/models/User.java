package com.simplelenz.championsboard.models;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class User {
	
	@Id
	private String _id;
	private String name;
	private String country;
	@DBRef
	private List<Score> score;
	
	public User() {

	}
	
	public User(String _id, String name, String country) {
		super();
		this._id = _id;
		this.name = name;
		this.country = country;
	}

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	

}
