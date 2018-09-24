package com.simplelenz.championsboard.models;

import org.springframework.data.annotation.Id;

public class Score<T> {
	
	@Id
	private String _id;
	//Use a suitable data type which can hold a desired number
	//Example Integer, Float, etc	
	private T value;
	
	public Score() {
		
	}

	public Score(String _id, String userId, T value) {
		super();
		this._id = _id;
		this.value = value;
	}

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	
}
