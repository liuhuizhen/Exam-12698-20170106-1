package com.hand.dto;

public class Page <T>{
	private Integer page;
	private Integer pageSize;
	private T entity;
	public Integer getPage() {
		return page;
	}
	public Page setPage(Integer page) {
		this.page = page;
		return this;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public Page setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		return this;
	}
	public T getEntity() {
		return entity;
	}
	public Page setEntity(T entity) {
		this.entity = entity;
		return this;
	}
	public int getOffset() {
	        return (page - 1) * pageSize;
	    }

}
