package com.company.gifmanager.giphy.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("getResponse")
@JsonIgnoreProperties(ignoreUnknown=true)
public class GetResponse {
	private Gif gif;
	private Meta meta;
	
	@JsonProperty("meta")
	public Meta getMeta() {
		return meta;
	}
	public void setMeta(Meta meta) {
		this.meta = meta;
	}
	
	@JsonProperty("data")
	public Gif getGif() {
		return gif;
	}
	public void setGif(Gif gif) {
		this.gif = gif;
	}
	
}
