package com.company.gifmanager.giphy.model.test;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileInputStream;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.ResourceUtils;
import org.springframework.util.StreamUtils;
import org.springframework.web.util.UriTemplate;

import com.company.gifmanager.giphy.model.UploadRequest;

public class UploadTest {
	private final Logger log = LoggerFactory.getLogger(getClass());
		
	@Test
	public void testUploadUrlWithAllParameters() throws Exception {
		log.info("testing testUploadUrlWithAllParameters()");
		UploadRequest upload = new UploadRequest();
		upload.setVersion(ModelTestData.uploadVersion);
		upload.setUriPath(ModelTestData.uploadUriPath);
		upload.setApiKey(ModelTestData.apiKey);
		upload.setUserName(ModelTestData.userName);
		upload.setSourceImageUrl(ModelTestData.sourceImageUrl);
		upload.setTags(ModelTestData.tagList);
		upload.setSourcePostUrl(ModelTestData.sourcePostUrl);
		
		File file = new File(ResourceUtils.getURL(ModelTestData.fileName).getFile());
		FileInputStream in = new FileInputStream(file);
		byte[] b = new byte[(int)file.length()];
		b = StreamUtils.copyToByteArray(in);
		upload.setFile(new String(b));
		
		UriTemplate uri = upload.buildUri(ModelTestData.baseUri);

		log.info("comparing uris \n built : \n{}\n expected : \n{}", uri.toString(), ModelTestData.testUploadUrlWithAllParameters());
//		assertTrue("search uri invalid!", ModelTestData.testUploadUrlWithAllParameters().equals(uri.toString()));		
	}
}
