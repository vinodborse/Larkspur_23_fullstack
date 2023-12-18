package com.ts;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class User {
	
	@Id
	private int id;
	private String name;
	
	@OneToMany
	@JoinTable( name = "ud", 
				joinColumns = {@JoinColumn(name ="uid")}, 
				inverseJoinColumns = {@JoinColumn(name ="did")})
	private List<Document> documents;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

	public List<Document> getDocuments() {
		return documents;
	}
	public void setDocuments(List<Document> documents) {
		this.documents = documents;
	}
	
	public User() {}
	
	public User(int id, String name, List<Document> documents) {
		this.id = id;
		this.name = name;
		this.documents = documents;
	}
	
		
	
}
