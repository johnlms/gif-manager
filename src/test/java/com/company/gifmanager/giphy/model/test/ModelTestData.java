package com.company.gifmanager.giphy.model.test;

import java.io.File;
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.ResourceUtils;
import org.springframework.util.StreamUtils;

public class ModelTestData {
	private static final Logger log = LoggerFactory.getLogger(ModelTestData.class);
	
	public final static String baseUri = "https://localhost:8080/";
	public final static String apiKey = "YOUR_API_KEY";
	public final static String format = "json";
	public final static String language = "en";
	public final static String query = "cheeseburgers";
	public final static Integer limit = 20;
	public final static Integer offset = 5;
	public final static String rating = "g";
	public final static String searchTerm = "ryan gosling";
	public final static String tag = "burrito";
	public final static String gifId = "xT4uQulxzV39haRFjG";
	public final static String gifIds = "xT4uQulxzV39haRFjG,3og0IPxMM0erATueVW";
	public final static List<String> gifIdList = Arrays.asList("xT4uQulxzV39haRFjG","3og0IPxMM0erATueVW");
	public final static String userName = "JoeCool3000";
	public final static String sourceImageUrl = "http://www.mysite.com/myfile.mp4";
	public final static String tags = "pets,cat,meow";
	public final static List<String> tagList = Arrays.asList("pets","cat","meow");
	public final static String sourcePostUrl = "http://www.mysite.com/my-blog-post/";
	public final static String fileName = "src/test/resources/153k.gif";
	
	public final static String PARAM_API_KEY = "api_key";
	public final static String PARAM_QUERY = "q";
	public final static String PARAM_LIMIT = "limit";
	public final static String PARAM_OFFSET = "offset";
	public final static String PARAM_RATING = "rating";
	public final static String PARAM_LANGUAGE = "lang";
	public final static String PARAM_FORMAT = "fmt";
	public final static String PARAM_SEARCHTERM = "s";
	public final static String PARAM_TAG = "tag";
	public final static String PARAM_GIF_ID = "gif_id";
	public final static String PARAM_GIF_IDS = "ids";
	public final static String PARAM_USER_NAME = "username";
	public final static String PARAM_SOURCE_IMAGE_URL = "source_image_url";
	public final static String PARAM_TAGS = "tags";
	public final static String PARAM_SOURCE_POST_URL = "source_post_url";
	public final static String PARAM_FILE = "file";
	
	
	public final static String searchVersion = "v1";
	public final static String searchUriPath = "gifs/search";
	public final static String uploadVersion = "upload.giphy.com/v1";
	public final static String uploadUriPath = "gifs/upload";
	

	public static String testSearchUrl() {
		return new StringBuilder(baseUri).append(searchVersion).append('/').append(searchUriPath).toString();
	}
	
	public static String testUploadUrlWithAllParameters() throws Exception {
		return new StringBuilder(baseUri).append(uploadVersion).append('/').append(uploadUriPath)
				.append('?').append(PARAM_API_KEY).append('=').append(apiKey)
				.append('&').append(PARAM_USER_NAME).append('=').append(userName)
				.append('&').append(PARAM_SOURCE_IMAGE_URL).append('=').append(sourceImageUrl)
				.append('&').append(PARAM_TAGS).append('=').append(tags)
				.append('&').append(PARAM_SOURCE_POST_URL).append('=').append(sourcePostUrl)
				.append('&').append(PARAM_FILE).append('=').append(testUploadFileData())
				.toString();
	}	

	public static String testUploadFileData() throws Exception {
		File file = new File(ResourceUtils.getURL(ModelTestData.fileName).getFile());
		FileInputStream in = new FileInputStream(file);
		byte[] b = new byte[(int)file.length()];
		b = StreamUtils.copyToByteArray(in);
		return new String(b);
	}
	
	public static String testSearchUrlWithAllParameters() {
		return new StringBuilder(baseUri).append(searchVersion).append('/').append(searchUriPath)
				.append('?').append(PARAM_API_KEY).append('=').append(apiKey)
				.append('&').append(PARAM_QUERY).append('=').append(query)
				.append('&').append(PARAM_LIMIT).append('=').append(limit)
				.append('&').append(PARAM_OFFSET).append('=').append(offset)
				.append('&').append(PARAM_RATING).append('=').append(rating)
				.append('&').append(PARAM_LANGUAGE).append('=').append(language)
				.append('&').append(PARAM_FORMAT).append('=').append(format)
				.toString();
	}	
	
	public static String testSearchUrlWithApiKey() {
		return new StringBuilder(baseUri).append(searchVersion).append('/').append(searchUriPath)
				.append('?').append(PARAM_API_KEY).append('=').append(apiKey)
				.toString();
	}
	
	public static String testSearchUrlWithApiKeyAndQuery() {
		return new StringBuilder(baseUri).append(searchVersion).append('/').append(searchUriPath)
				.append('?').append(PARAM_API_KEY).append('=').append(apiKey)
				.append('&').append(PARAM_QUERY).append('=').append(query)
				.toString();
	}
	
	public static String testSearchUrlWithQuery() {
		return new StringBuilder(baseUri).append(searchVersion).append('/').append(searchUriPath)
				.append('?').append(PARAM_QUERY).append('=').append(query)
				.toString();
	}
	
	public static String testSearchUrlWithLimit() {
		return new StringBuilder(baseUri).append(searchVersion).append('/').append(searchUriPath)
				.append('?').append(PARAM_LIMIT).append('=').append(limit)
				.toString();
	}
	public static String testSearchUrlWithOffset() {
		return new StringBuilder(baseUri).append(searchVersion).append('/').append(searchUriPath)
				.append('?').append(PARAM_OFFSET).append('=').append(offset)
				.toString();
	}
	public static String testSearchUrlWithRating() {
		return new StringBuilder(baseUri).append(searchVersion).append('/').append(searchUriPath)
				.append('?').append(PARAM_RATING).append('=').append(rating)
				.toString();
	}
	public static String testSearchUrlWithLanguage() {
		return new StringBuilder(baseUri).append(searchVersion).append('/').append(searchUriPath)
				.append('?').append(PARAM_LANGUAGE).append('=').append(language)
				.toString();
	}
	public static String testSearchUrlWithFormat() {
		return new StringBuilder(baseUri).append(searchVersion).append('/').append(searchUriPath)
				.append('?').append(PARAM_FORMAT).append('=').append(format)
				.toString();
	}
	
	
}
