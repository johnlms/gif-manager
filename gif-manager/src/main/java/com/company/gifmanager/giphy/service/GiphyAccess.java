package com.company.gifmanager.giphy.service;

import java.io.File;
import java.io.FileOutputStream;
import java.net.URI;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.util.UriTemplate;

import com.company.gifmanager.giphy.model.GetRequest;
import com.company.gifmanager.giphy.model.GetResponse;
import com.company.gifmanager.giphy.model.ListRequest;
import com.company.gifmanager.giphy.model.ListResponse;
import com.company.gifmanager.giphy.model.RandomRequest;
import com.company.gifmanager.giphy.model.RandomResponse;
import com.company.gifmanager.giphy.model.SearchRequest;
import com.company.gifmanager.giphy.model.SearchResponse;
import com.company.gifmanager.giphy.model.TranslateRequest;
import com.company.gifmanager.giphy.model.TranslateResponse;
import com.company.gifmanager.giphy.model.TrendingRequest;
import com.company.gifmanager.giphy.model.TrendingResponse;
import com.company.gifmanager.giphy.model.UploadRequest;
import com.company.gifmanager.giphy.model.UploadResponse;

public class GiphyAccess {
	private final Logger log = LoggerFactory.getLogger(getClass());
	
	private String baseUrl;	
	private String uploadUrl;
	private String version;
	private String uploadVersion;
	private String apiKey;

	public static final String API_SEARCH = "gifs/search";
	public static final String API_TRENDING = "gifs/trending";
	public static final String API_TRANSLATE = "gifs/translate";
	public static final String API_RANDOM = "gifs/random";
	public static final String API_GET = "gifs";
	public static final String API_LIST = "gifs";
	public static final String API_UPLOAD = "gifs";

	public static final String VALUE_OVERRIDE_RATING = "g";
	
	
	@Autowired
	private RestTemplate restTemplate;
	
	public ResponseEntity<SearchResponse> search(SearchRequest s) throws Exception {
		s.setApiKey(getApiKey());
		s.setVersion(getVersion());
		s.setUriPath(API_SEARCH);
		
		RequestEntity<Void> request = RequestEntity
			     .get(new URI(s.buildUri(getBaseUri()).toString()))
			     .accept(MediaType.APPLICATION_JSON)
			     .build();

		return restTemplate.exchange(request, SearchResponse.class);
	}

	
	public ResponseEntity<TrendingResponse> trending(TrendingRequest t) throws Exception {		
		t.setApiKey(getApiKey());
		t.setVersion(getVersion());
		t.setUriPath(API_TRENDING);
		t.setRating(VALUE_OVERRIDE_RATING);
		
		RequestEntity<Void> request = RequestEntity
			     .get(new URI(t.buildUri(getBaseUri()).toString()))
			     .accept(MediaType.APPLICATION_JSON)
			     .build();

		return restTemplate.exchange(request, TrendingResponse.class);
	}

	
	public ResponseEntity<TranslateResponse> translate(TranslateRequest t) throws Exception {		
		t.setApiKey(getApiKey());
		t.setVersion(getVersion());
		t.setUriPath(API_TRANSLATE);
		
		RequestEntity<Void> request = RequestEntity
			     .get(new URI(t.buildUri(getBaseUri()).toString()))
			     .accept(MediaType.APPLICATION_JSON)
			     .build();

		return restTemplate.exchange(request, TranslateResponse.class);
	}
	
	
	public ResponseEntity<RandomResponse> random(RandomRequest r) throws Exception {		
		r.setApiKey(getApiKey());
		r.setVersion(getVersion());
		r.setUriPath(API_RANDOM);
		
		RequestEntity<Void> request = RequestEntity
			     .get(new URI(r.buildUri(getBaseUri()).toString()))
			     .accept(MediaType.APPLICATION_JSON)
			     .build();

		return restTemplate.exchange(request, RandomResponse.class);
	}
	
	public ResponseEntity<GetResponse> get(GetRequest g) throws Exception {		
		g.setApiKey(getApiKey());
		g.setVersion(getVersion());
		g.setUriPath(API_GET);
		
		RequestEntity<Void> request = RequestEntity
			     .get(new URI(g.buildUri(getBaseUri()).toString()))
			     .accept(MediaType.APPLICATION_JSON)
			     .build();

		return restTemplate.exchange(request, GetResponse.class);
	}
	
	public ResponseEntity<ListResponse> list(ListRequest l) throws Exception {		
		l.setApiKey(getApiKey());
		l.setVersion(getVersion());
		l.setUriPath(API_LIST);

		RequestEntity<Void> request = RequestEntity
				.get(new URI(l.buildUri(getBaseUri()).toString()))
				.accept(MediaType.APPLICATION_JSON)
				.build();
				
		return restTemplate.exchange(request, ListResponse.class);
	}
	
	public ResponseEntity<UploadResponse> upload(UploadRequest u, MultipartFile file) throws Exception {		
		u.setApiKey(getApiKey());
		u.setVersion(getUploadVersion());
		u.setUriPath(API_UPLOAD);

		File tmpFile = null;
		try {
		
			final String tmpFileName = System.getProperty("java.io.tmpdir") + file.getOriginalFilename();
			tmpFile = new File(tmpFileName);
			file.transferTo(tmpFile);
			
			MultiValueMap<String, Object> bodyMap = new LinkedMultiValueMap<>();
			bodyMap.add("file", new FileSystemResource(tmpFile));
			
			RequestEntity<MultiValueMap<String, Object>> request = RequestEntity
				     .post(new URI(u.buildUri(getUploadUrl()).toString()))
				     .accept(MediaType.APPLICATION_JSON)
				     .contentType(MediaType.MULTIPART_FORM_DATA)
				     .body(bodyMap);
		
			return restTemplate.exchange(request, UploadResponse.class);
			
		} finally {
			if (null != tmpFile && tmpFile.exists()) {
				tmpFile.delete();
			}
		}
	}
	
	public String getBaseUri() {
		return baseUrl;
	}
	public void setBaseUri(String baseUri) {
		this.baseUrl = baseUri;
	}

	
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}


	public String getApiKey() {
		return apiKey;
	}
	public void setApiKey(String apiKey) {
		this.apiKey = apiKey;
	}


	public String getUploadUrl() {
		return uploadUrl;
	}
	public void setUploadUrl(String uploadUrl) {
		this.uploadUrl = uploadUrl;
	}


	public String getUploadVersion() {
		return uploadVersion;
	}
	public void setUploadVersion(String uploadVersion) {
		this.uploadVersion = uploadVersion;
	}
	
}
