package com.hand.dto;

import java.util.List;

public class ResponseData<T> {
	private Integer total;
	private List<T> rows;
	public Integer getTotal() {
		return total;
	}
	public ResponseData setTotal(Integer total) {
		this.total = total;
		return this;
	}
	public List<T> getRows() {
		return rows;
	}
	public ResponseData setRows(List<T> rows) {
		this.rows = rows;
		return this;
	}

}
