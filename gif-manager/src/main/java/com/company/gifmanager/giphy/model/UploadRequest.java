package com.company.gifmanager.giphy.model;

import java.util.stream.Collectors;

import org.springframework.util.StringUtils;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.web.util.UriTemplate;

public class UploadRequest extends BaseRequest {
	
	@Override
	public UriTemplate buildUri(String baseUrl) {
		
		StringBuilder sb = new StringBuilder(baseUrl)
								.append('/')
								.append(getVersion())
								.append('/')
								.append(getUriPath());
		
		UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(sb.toString());
		if (!StringUtils.isEmpty(getApiKey())) builder.queryParam(PARAM_API_KEY, getApiKey());
		if (!StringUtils.isEmpty(getUserName())) builder.queryParam(PARAM_USER_NAME, getUserName());
		if (!StringUtils.isEmpty(getSourceImageUrl())) builder.queryParam(PARAM_SOURCE_IMAGE_URL, getSourceImageUrl());
		if (!StringUtils.isEmpty(getTags())) builder.queryParam(PARAM_TAGS,	getTags().stream().map(s->s.toString()).collect(Collectors.joining(",")));
		if (!StringUtils.isEmpty(getSourcePostUrl())) builder.queryParam(PARAM_SOURCE_POST_URL, getSourcePostUrl());
//		if (!StringUtils.isEmpty(getFile())) builder.queryParam(PARAM_FILE, getFile());
		builder.build();
		
		return new UriTemplate(builder.toUriString());
	}
	
}
