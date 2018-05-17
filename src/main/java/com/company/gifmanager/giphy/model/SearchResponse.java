package com.company.gifmanager.giphy.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("searchResponse")
@JsonIgnoreProperties(ignoreUnknown=true)
public class SearchResponse {
	private List<Gif> gifList;
	private Pagination pagination;
	private Meta meta;
	
	
	@JsonProperty("pagination")
	public Pagination getPagination() {
		return pagination;
	}
	public void setPagination(Pagination pagination) {
		this.pagination = pagination;
	}
	
	@JsonProperty("meta")
	public Meta getMeta() {
		return meta;
	}
	public void setMeta(Meta meta) {
		this.meta = meta;
	}
	
	@JsonProperty("data")
	public List<Gif> getGifList() {
		return gifList;
	}
	public void setGifList(List<Gif> gifList) {
		this.gifList = gifList;
	}
	
	
}
