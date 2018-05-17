package com.company.gifmanager.giphy.model;

import org.springframework.util.StringUtils;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.web.util.UriTemplate;

public class GetRequest extends BaseRequest {
	
	@Override
	public UriTemplate buildUri(String baseUrl) {
		
		StringBuilder sb = new StringBuilder(baseUrl)
								.append('/')
								.append(getVersion())
								.append('/')
								.append(getUriPath())
								.append('/');
		if (!StringUtils.isEmpty(getGifId())) sb.append(getGifId());
				
		UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(sb.toString());
		if (!StringUtils.isEmpty(getApiKey())) builder.queryParam(PARAM_API_KEY, getApiKey());
		builder.build();
		
		return new UriTemplate(builder.toUriString());
	}
}
