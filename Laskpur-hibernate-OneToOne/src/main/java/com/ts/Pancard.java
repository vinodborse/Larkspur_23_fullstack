package com.ts;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Pancard {
	
	@Id
	private int id;

	private String number;
	
	@OneToOne
	@JoinColumn(name = "uid")
	private User user;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Pancard() {}
	
	public Pancard(int id, String number, User user) {
		this.id = id;
		this.number = number;
		this.user = user;
	}
	
	
	
}
