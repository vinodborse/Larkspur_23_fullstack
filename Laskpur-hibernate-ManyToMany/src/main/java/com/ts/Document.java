package com.ts;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Document {

	@Id
	private int id;
	private String type;
	private String number;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public Document() {}
	public Document(int id, String type, String number) {
		
		this.id = id;
		this.type = type;
		this.number = number;
	}
	
	
}
