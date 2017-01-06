package com.hand.dto;

public class Film {
	//select film_id,title,description,release_year,language_id,
	//original_language_id,rental_duration,rental_rate,length,
	//replacement_cost,rating,special_features,last_update from film;
	private Integer film_id;
	private String title;
	private String description;
	private String release_year;
	private Integer language_id;
	private Integer original_language_id;
	private Integer rental_duration;
	private double rental_rate;
	private Integer length;
	private double replacement_cost;
	private String rating;
	private String special_features;
	private String last_update;
	private String name;
	public Film() {
		super();
	}
	public Film(Integer film_id, String title, String description,
			String release_year, Integer language_id,
			Integer original_language_id, Integer rental_duration,
			double rental_rate, Integer length, double replacement_cost,
			String rating, String special_features, String last_update,String name) {
		super();
		this.film_id = film_id;
		this.title = title;
		this.description = description;
		this.release_year = release_year;
		this.language_id = language_id;
		this.original_language_id = original_language_id;
		this.rental_duration = rental_duration;
		this.rental_rate = rental_rate;
		this.length = length;
		this.replacement_cost = replacement_cost;
		this.rating = rating;
		this.special_features = special_features;
		this.last_update = last_update;
		this.name=name;
	}
	public Integer getFilm_id() {
		return film_id;
	}
	public Film setFilm_id(Integer film_id) {
		this.film_id = film_id;
		return this;
	}
	public String getTitle() {
		return title;
	}
	public Film setTitle(String title) {
		this.title = title;
		return this;
	}
	public String getDescription() {
		return description;
	}
	public Film setDescription(String description) {
		this.description = description;
		return this;
	}
	public String getRelease_year() {
		return release_year;
	}
	public Film setRelease_year(String release_year) {
		this.release_year = release_year;
		return this;
	}
	public Integer getLanguage_id() {
		return language_id;
	}
	public Film setLanguage_id(Integer language_id) {
		this.language_id = language_id;
		return this;
	}
	public Integer getOriginal_language_id() {
		return original_language_id;
	}
	public Film setOriginal_language_id(Integer original_language_id) {
		this.original_language_id = original_language_id;
		return this;
	}
	public Integer getRental_duration() {
		return rental_duration;
	}
	public Film setRental_duration(Integer rental_duration) {
		this.rental_duration = rental_duration;
		return this;
	}
	public double getRental_rate() {
		return rental_rate;
	}
	public Film setRental_rate(double rental_rate) {
		this.rental_rate = rental_rate;
		return this;
	}
	public Integer getLength() {
		return length;
	}
	public Film setLength(Integer length) {
		this.length = length;
		return this;
	}
	public double getReplacement_cost() {
		return replacement_cost;
	}
	public Film setReplacement_cost(double replacement_cost) {
		this.replacement_cost = replacement_cost;
		return this;
	}
	public String getRating() {
		return rating;
	}
	public Film setRating(String rating) {
		this.rating = rating;
		return this;
	}
	public String getSpecial_features() {
		return special_features;
	}
	public Film setSpecial_features(String special_features) {
		this.special_features = special_features;
		return this;
	}
	public String getLast_update() {
		return last_update;
	}
	public Film setLast_update(String last_update) {
		this.last_update = last_update;
		return this;
	}
	public String getName() {
		return name;
	}
	public Film setName(String name) {
		this.name = name;
		return this;
	}

}
