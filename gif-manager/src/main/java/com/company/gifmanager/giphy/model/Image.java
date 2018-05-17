package com.company.gifmanager.giphy.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("image")
@JsonIgnoreProperties(ignoreUnknown=true)
public class Image {
	private String url;
	private String width;
	private String height;
	private String size;
	private String mp4;
	private String mp4Size;
	private String webp;
	private String webpSize;
	private String frames;
	
	@JsonProperty("url")
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	@JsonProperty("width")
	public String getWidth() {
		return width;
	}
	public void setWidth(String width) {
		this.width = width;
	}
	
	@JsonProperty("height")
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	
	@JsonProperty("size")
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	
	@JsonProperty("mp4")
	public String getMp4() {
		return mp4;
	}
	public void setMp4(String mp4) {
		this.mp4 = mp4;
	}
	
	@JsonProperty("mp4_size")
	public String getMp4Size() {
		return mp4Size;
	}
	public void setMp4Size(String mp4Size) {
		this.mp4Size = mp4Size;
	}
	
	@JsonProperty("webp")
	public String getWebp() {
		return webp;
	}
	public void setWebp(String webp) {
		this.webp = webp;
	}
	
	@JsonProperty("webp_size")
	public String getWebpSize() {
		return webpSize;
	}
	public void setWebpSize(String webpSize) {
		this.webpSize = webpSize;
	}

	@JsonProperty("frames")
	public String getFrames() {
		return frames;
	}
	public void setFrames(String frames) {
		this.frames = frames;
	}
}
