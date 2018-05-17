package com.company.gifmanager.giphy.model;

import org.springframework.util.StringUtils;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.web.util.UriTemplate;

public class TranslateRequest extends BaseRequest {
	
	@Override
	public UriTemplate buildUri(String baseUrl) {
		
		StringBuilder sb = new StringBuilder(baseUrl)
								.append('/')
								.append(getVersion())
								.append('/')
								.append(getUriPath());
		
		UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(sb.toString());
		if (!StringUtils.isEmpty(getApiKey())) builder.queryParam(PARAM_API_KEY, getApiKey());
		if (!StringUtils.isEmpty(getLimit())) builder.queryParam(PARAM_SEARCHTERM, getSearchTerm());
		builder.build();
		
		return new UriTemplate(builder.toUriString());
	}
	
}
