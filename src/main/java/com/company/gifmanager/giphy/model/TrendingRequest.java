package com.company.gifmanager.giphy.model;

import org.springframework.util.StringUtils;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.web.util.UriTemplate;

public class TrendingRequest extends BaseRequest {

	@Override
	public UriTemplate buildUri(String baseUrl) {
		
		StringBuilder sb = new StringBuilder(baseUrl)
								.append('/')
								.append(getVersion())
								.append('/')
								.append(getUriPath());
		
		UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(sb.toString());
		if (!StringUtils.isEmpty(getApiKey())) builder.queryParam(PARAM_API_KEY, getApiKey());
		if (!StringUtils.isEmpty(getLimit())) builder.queryParam(PARAM_LIMIT, getLimit());
		if (!StringUtils.isEmpty(getOffset())) builder.queryParam(PARAM_OFFSET, getOffset());
		if (!StringUtils.isEmpty(getRating())) builder.queryParam(PARAM_RATING, getRating());
		if (!StringUtils.isEmpty(getFormat())) builder.queryParam(PARAM_FORMAT, getFormat());
		builder.build();
		
		return new UriTemplate(builder.toUriString());
	}
	
}
