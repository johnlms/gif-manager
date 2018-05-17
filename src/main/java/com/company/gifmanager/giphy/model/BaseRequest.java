package com.company.gifmanager.giphy.model;

import java.util.List;

import org.springframework.web.util.UriTemplate;

abstract class BaseRequest {
	private String apiKey;
	private String query;
	private Integer limit;
	private Integer offset;
	private String rating;
	private String language;
	private String format;
	private String searchTerm;
	private String tag;
	private String gifId;
	private List<String> gifIds;
	private String userName;
	private String sourceImageUrl;
	private List<String> tags;
	private String sourcePostUrl;
	private String file;
	
	private String version;
	private String uriPath;
	
	public final String PARAM_API_KEY = "api_key";
	public final String PARAM_QUERY = "q";
	public final String PARAM_LIMIT = "limit";
	public final String PARAM_OFFSET = "offset";
	public final String PARAM_RATING = "rating";
	public final String PARAM_LANGUAGE = "lang";
	public final String PARAM_FORMAT = "fmt";
	public final String PARAM_SEARCHTERM = "s";
	public final String PARAM_TAG = "tag";
	public final String PARAM_GIF_ID = "gif_id";
	public final String PARAM_GIF_IDS = "ids";
	public final String PARAM_USER_NAME = "username";
	public final String PARAM_SOURCE_IMAGE_URL = "source_image_url";
	public final String PARAM_TAGS = "tags";
	public final String PARAM_SOURCE_POST_URL = "source_post_url";
	public final String PARAM_FILE = "file";
	
	public abstract UriTemplate buildUri(String baseUrl);	
	
	public String getApiKey() {
		return apiKey;
	}
	public void setApiKey(String apiKey) {
		this.apiKey = apiKey;
	}
	public String getQuery() {
		return query;
	}
	public void setQuery(String query) {
		this.query = query;
	}
	public Integer getLimit() {
		return limit;
	}
	public void setLimit(Integer limit) {
		this.limit = limit;
	}
	public Integer getOffset() {
		return offset;
	}
	public void setOffset(Integer offset) {
		this.offset = offset;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getFormat() {
		return format;
	}
	public void setFormat(String format) {
		this.format = format;
	}
	public String getSearchTerm() {
		return searchTerm;
	}
	public void setSearchTerm(String searchTerm) {
		this.searchTerm = searchTerm;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public String getGifId() {
		return gifId;
	}
	public void setGifId(String gifId) {
		this.gifId = gifId;
	}
	public List<String> getGifIds() {
		return gifIds;
	}
	public void setGifIds(List<String> gifIds) {
		this.gifIds = gifIds;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getSourceImageUrl() {
		return sourceImageUrl;
	}
	public void setSourceImageUrl(String sourceImageUrl) {
		this.sourceImageUrl = sourceImageUrl;
	}
	public List<String> getTags() {
		return tags;
	}
	public void setTags(List<String> tags) {
		this.tags = tags;
	}
	public String getSourcePostUrl() {
		return sourcePostUrl;
	}
	public void setSourcePostUrl(String sourcePostUrl) {
		this.sourcePostUrl = sourcePostUrl;
	}
	public String getFile() {
		return file;
	}
	public void setFile(String file) {
		this.file = file;
	}


	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}

	public String getUriPath() {
		return uriPath;
	}
	public void setUriPath(String uriPath) {
		this.uriPath = uriPath;
	}
	
}
