package com.company.gifmanager.giphy.model;

import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.web.util.UriTemplate;

public class ListRequest extends BaseRequest {
	private final Logger log = LoggerFactory.getLogger(getClass());
	
	@Override
	public UriTemplate buildUri(String baseUrl) {
		
		StringBuilder sb = new StringBuilder(baseUrl)
								.append('/')
								.append(getVersion())
								.append('/')
								.append(getUriPath());
		
		UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(sb.toString());
		if (!StringUtils.isEmpty(getApiKey())) builder.queryParam(PARAM_API_KEY, getApiKey());
		if (null != getGifIds()) builder.queryParam(PARAM_GIF_IDS,	getGifIds().stream().map(s->s.toString()).collect(Collectors.joining(",")));
		builder.build();
		
		return new UriTemplate(builder.toUriString());
	}
}
