package com.hand.dto;

public class Language {
	// select language_id,name from language;
	private int language_id;
	private String name;
	
	public Language() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Language(int language_id, String name) {
		super();
		this.language_id = language_id;
		this.name = name;
	}
	public int getLanguage_id() {
		return language_id;
	}
	public void setLanguage_id(int language_id) {
		this.language_id = language_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
