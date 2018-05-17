package com.company.gifmanager.db.model;

import java.util.List;

public class GMGif {
	private Integer id;
	private Integer userId;
	private String giphyId;
	private List<String> categories;
	private Boolean favorite;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getGiphyId() {
		return giphyId;
	}
	public void setGiphyId(String giphyId) {
		this.giphyId = giphyId;
	}
	public List<String> getCategories() {
		return categories;
	}
	public void setCategories(List<String> categories) {
		this.categories = categories;
	}
	public Boolean getFavorite() {
		return favorite;
	}
	public void setFavorite(Boolean favorite) {
		this.favorite = favorite;
	}
	
}
