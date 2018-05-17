package com.company.gifmanager.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.company.gifmanager.giphy.model.ListRequest;
import com.company.gifmanager.giphy.model.ListResponse;
import com.company.gifmanager.giphy.model.UploadRequest;
import com.company.gifmanager.giphy.model.UploadResponse;
import com.company.gifmanager.giphy.service.GiphyAccess;

@RestController
public class ServiceController {
	private final Logger log = LoggerFactory.getLogger(getClass());
	
	@Autowired
	public GiphyAccess giphyAccess;

	
//	@PostMapping(path="/upload", consumes="multipart/form-data", produces="application/json")
//	@ResponseBody 
//	public ResponseEntity<?> upload(@RequestParam("file") MultipartFile file,
//			RedirectAttributes redirectAttributes) {
//		log.debug("enter upload, file[{}]", file);
//		ResponseEntity<UploadResponse> response = null;
//		UploadRequest request = new UploadRequest();
//		
//		try {
//			response = giphyAccess.upload(request, file);
//			log.info("upload response, status code[{}], statusCodeValue[{}]", response.getStatusCode(), response.getStatusCodeValue());
//			redirectAttributes.addFlashAttribute("message",
//					"You successfully uploaded ["+file.getOriginalFilename()+']');
//		}
//		catch(Exception e) {
//			log.warn("upload error :", e);
//		}
//			
//		log.debug("exit upload");
//		return response;
//	}
//
//	@GetMapping("/list")
//	@ResponseBody
//	public ResponseEntity<?> list(RedirectAttributes redirectAttributes) {
//		log.debug("enter list");
//		ResponseEntity<ListResponse> response = null;
//		ListRequest request = new ListRequest();
//		
//		try {
//			List<String> gifIds = Arrays.asList("xT4uQulxzV39haRFjG","3og0IPxMM0erATueVW");
//			request.setGifIds(gifIds);
//			response = giphyAccess.list(request);
//			log.info("upload response, status code[{}], statusCodeValue[{}]", response.getStatusCode(), response.getStatusCodeValue());
//			redirectAttributes.addFlashAttribute("message",	"list success");
//		}
//		catch(Exception e) {
//			log.warn("list error :", e);
//		}
//		
//		log.info("response {}", response);
//		return response;
//	}
	
	
	
	
}
