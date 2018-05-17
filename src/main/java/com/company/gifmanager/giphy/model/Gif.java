package com.company.gifmanager.giphy.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("gif")
@JsonIgnoreProperties(ignoreUnknown=true)
public class Gif {
	private String id;
	private String type;
	private String slug;
	private String url;
	private String bitlyUrl;
	private String embedUrl;
	private String userName;
	private String source;
	private String rating;
	private String contentUrl;
	private GifUser user;
	private String sourceTld;
	private String sourcePostUrl;
	private String updateDateTime;
	private String createDateTime;
	private String importDateTime;
	private String trendingDateTime;
	private Images images;
	private String title;
	
	
	@JsonProperty("id")
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	@JsonProperty("type")
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	@JsonProperty("slug")
	public String getSlug() {
		return slug;
	}
	public void setSlug(String slug) {
		this.slug = slug;
	}
	
	@JsonProperty("url")
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	@JsonProperty("bitly_url")
	public String getBitlyUrl() {
		return bitlyUrl;
	}
	public void setBitlyUrl(String bitlyUrl) {
		this.bitlyUrl = bitlyUrl;
	}
	
	@JsonProperty("embed_url")
	public String getEmbedUrl() {
		return embedUrl;
	}
	public void setEmbedUrl(String embedUrl) {
		this.embedUrl = embedUrl;
	}
	
	@JsonProperty("username")
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	@JsonProperty("source")
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	
	@JsonProperty("rating")
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	
	@JsonProperty("content_url")
	public String getContentUrl() {
		return contentUrl;
	}
	public void setContentUrl(String contentUrl) {
		this.contentUrl = contentUrl;
	}
	
	@JsonProperty("user")
	public GifUser getUser() {
		return user;
	}
	public void setUser(GifUser user) {
		this.user = user;
	}
	
	@JsonProperty("source_tld")
	public String getSourceTld() {
		return sourceTld;
	}
	public void setSourceTld(String sourceTld) {
		this.sourceTld = sourceTld;
	}
	
	@JsonProperty("source_post_url")
	public String getSourcePostUrl() {
		return sourcePostUrl;
	}
	public void setSourcePostUrl(String sourcePostUrl) {
		this.sourcePostUrl = sourcePostUrl;
	}
	
	@JsonProperty("update_datetime")
	public String getUpdateDateTime() {
		return updateDateTime;
	}
	public void setUpdateDateTime(String updateDateTime) {
		this.updateDateTime = updateDateTime;
	}
	
	@JsonProperty("create_datetime")
	public String getCreateDateTime() {
		return createDateTime;
	}
	public void setCreateDateTime(String createDateTime) {
		this.createDateTime = createDateTime;
	}
	
	@JsonProperty("import_datetime")
	public String getImportDateTime() {
		return importDateTime;
	}
	public void setImportDateTime(String importDateTime) {
		this.importDateTime = importDateTime;
	}
	
	@JsonProperty("trending_datetime")
	public String getTrendingDateTime() {
		return trendingDateTime;
	}
	public void setTrendingDateTime(String trendingDateTime) {
		this.trendingDateTime = trendingDateTime;
	}
	
	@JsonProperty("images")
	public Images getImages() {
		return images;
	}
	public void setImages(Images images) {
		this.images = images;
	}
	
	@JsonProperty("title")
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	
}
