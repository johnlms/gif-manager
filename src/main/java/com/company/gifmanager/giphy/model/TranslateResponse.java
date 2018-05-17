package com.company.gifmanager.giphy.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("translateResponse")
@JsonIgnoreProperties(ignoreUnknown=true)
public class TranslateResponse {
	private List<Gif> gifList;
	private Meta meta;
	
	
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
