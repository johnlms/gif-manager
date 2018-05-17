package com.company.gifmanager.giphy.model.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.web.util.UriTemplate;

import com.company.gifmanager.giphy.model.SearchRequest;

public class SearchTest {
	
	@Test
	public void testSearchUrl() {
		
		SearchRequest search = new SearchRequest();
		search.setVersion(ModelTestData.searchVersion);
		search.setUriPath(ModelTestData.searchUriPath);
		UriTemplate uri = search.buildUri(ModelTestData.baseUri);
		
		System.out.println("uri is :: "+uri.toString());
		assertTrue("search uri invalid!", ModelTestData.testSearchUrl().equals(uri.toString()));
	}

	@Test
	public void testSearchUrlWithApiKey() {
		
		SearchRequest search = new SearchRequest();
		search.setVersion(ModelTestData.searchVersion);
		search.setUriPath(ModelTestData.searchUriPath);
		search.setApiKey(ModelTestData.apiKey);
		UriTemplate uri = search.buildUri(ModelTestData.baseUri);
		
		System.out.println("uri is :: "+uri.toString());
		assertTrue("search uri invalid!", ModelTestData.testSearchUrlWithApiKey().equals(uri.toString()));
	}
	
	@Test
	public void testSearchUrlWithApiKeyAndQuery() {
		
		SearchRequest search = new SearchRequest();
		search.setVersion(ModelTestData.searchVersion);
		search.setUriPath(ModelTestData.searchUriPath);
		search.setApiKey(ModelTestData.apiKey);
		search.setQuery(ModelTestData.query);
		UriTemplate uri = search.buildUri(ModelTestData.baseUri);
		
		System.out.println("uri is :: "+uri.toString());
		assertTrue("search uri invalid!", ModelTestData.testSearchUrlWithApiKeyAndQuery().equals(uri.toString()));
	}
	
	@Test
	public void testSearchUrlWithQuery() {
		
		SearchRequest search = new SearchRequest();
		search.setVersion(ModelTestData.searchVersion);
		search.setUriPath(ModelTestData.searchUriPath);
		search.setQuery(ModelTestData.query);
		UriTemplate uri = search.buildUri(ModelTestData.baseUri);
		
		System.out.println("uri is :: "+uri.toString());
		assertTrue("search uri invalid!", ModelTestData.testSearchUrlWithQuery().equals(uri.toString()));
	}
	
	@Test
	public void testSearchUrlWithLimit() {
		
		SearchRequest search = new SearchRequest();
		search.setVersion(ModelTestData.searchVersion);
		search.setUriPath(ModelTestData.searchUriPath);
		search.setLimit(ModelTestData.limit);
		UriTemplate uri = search.buildUri(ModelTestData.baseUri);
		
		System.out.println("uri is :: "+uri.toString());
		assertTrue("search uri invalid!", ModelTestData.testSearchUrlWithLimit().equals(uri.toString()));
	}
	
	@Test
	public void testSearchUrlWithOffset() {
		
		SearchRequest search = new SearchRequest();
		search.setVersion(ModelTestData.searchVersion);
		search.setUriPath(ModelTestData.searchUriPath);
		search.setOffset(ModelTestData.offset);
		UriTemplate uri = search.buildUri(ModelTestData.baseUri);
		
		System.out.println("uri is :: "+uri.toString());
		assertTrue("search uri invalid!", ModelTestData.testSearchUrlWithOffset().equals(uri.toString()));
	}
	
	@Test
	public void testSearchUrlWithRating() {
		
		SearchRequest search = new SearchRequest();
		search.setVersion(ModelTestData.searchVersion);
		search.setUriPath(ModelTestData.searchUriPath);
		search.setRating(ModelTestData.rating);
		UriTemplate uri = search.buildUri(ModelTestData.baseUri);
		
		System.out.println("uri is :: "+uri.toString());
		assertTrue("search uri invalid!", ModelTestData.testSearchUrlWithRating().equals(uri.toString()));
	}
	
	@Test
	public void testSearchUrlWithLanguage() {
		
		SearchRequest search = new SearchRequest();
		search.setVersion(ModelTestData.searchVersion);
		search.setUriPath(ModelTestData.searchUriPath);
		search.setLanguage(ModelTestData.language);
		UriTemplate uri = search.buildUri(ModelTestData.baseUri);
		
		System.out.println("uri is :: "+uri.toString());
		assertTrue("search uri invalid!", ModelTestData.testSearchUrlWithLanguage().equals(uri.toString()));
	}
	
	@Test
	public void testSearchUrlWithFormat() {
		
		SearchRequest search = new SearchRequest();
		search.setVersion(ModelTestData.searchVersion);
		search.setUriPath(ModelTestData.searchUriPath);
		search.setFormat(ModelTestData.format);
		UriTemplate uri = search.buildUri(ModelTestData.baseUri);
		
		System.out.println("uri is :: "+uri.toString());
		assertTrue("search uri invalid!", ModelTestData.testSearchUrlWithFormat().equals(uri.toString()));
	}
	
	@Test
	public void testSearchUrlWithAllParameters() {
		
		SearchRequest search = new SearchRequest();
		search.setVersion(ModelTestData.searchVersion);
		search.setUriPath(ModelTestData.searchUriPath);
		search.setFormat(ModelTestData.format);
		search.setApiKey(ModelTestData.apiKey);
		search.setQuery(ModelTestData.query);
		search.setLimit(ModelTestData.limit);
		search.setOffset(ModelTestData.offset);
		search.setRating(ModelTestData.rating);
		search.setLanguage(ModelTestData.language);
		search.setFormat(ModelTestData.format);
		UriTemplate uri = search.buildUri(ModelTestData.baseUri);

		System.out.println("uri is :: "+uri.toString());
		assertTrue("search uri invalid!", ModelTestData.testSearchUrlWithAllParameters().equals(uri.toString()));
	}
}
