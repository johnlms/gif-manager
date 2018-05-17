package com.company.gifmanager.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

import com.company.gifmanager.giphy.model.GetRequest;
import com.company.gifmanager.giphy.model.GetResponse;
import com.company.gifmanager.giphy.model.Meta;
import com.company.gifmanager.giphy.model.TrendingRequest;
import com.company.gifmanager.giphy.model.TrendingResponse;
import com.company.gifmanager.giphy.service.GiphyAccess;

/**
 * Provides accessibility to GIF files and related information.
 * @author johnl
 */
public class GifManager {
	private final Logger log = LoggerFactory.getLogger(getClass());

	@Autowired GiphyAccess giphyAccess;
	
	
	// Get Random GIF files from Giphy.
	public void getRandomGifsFromGiphy() {
		log.debug("get random gifs from giphy");
	}
	
	// Search Giphy for GIF files.
	public void searchGiphyForGifs(List<String> giphyIds) {
		log.debug("search giphy for gifs, giphyIds[{}]", giphyIds);
	}
	
	// Get GIF by Id.
	public GetResponse getGiphyGif(String giphyId) {
		log.debug("get giphy gif, id[{}]", giphyId);
		GetResponse response = new GetResponse();
		GetRequest request = new GetRequest();
		
		try {
			request.setGifId(giphyId);
			ResponseEntity<GetResponse> resp =  giphyAccess.get(request);
			response = resp.getBody();
			
		} catch (Exception e) {
			log.error("error getting gif data!", e);
			Meta meta = new Meta();
			meta.setMessage("error retrieving gif information!");
			meta.setStatus(HttpStatus.FAILED_DEPENDENCY.value());
			response.setMeta(meta);
		}
		
		return response;
	}
	
	// Upload a GIF file.
	public void uploadGif(MultipartFile file) {
		log.debug("upload gif to giphy");
	}
	
	// Save a GIF to profile.
	public void saveGifToProfile(String giphyId) {
		log.debug("save gif to profile[{}]", giphyId);
	}
	
	// Categorize a GIF.
	public void categorizeGif(String category) {
		log.debug("categorize gif[{}]", category);
	}
	
	// Uncategorize a GIF.
	public void uncategorizeGif(String category) {
		log.debug("uncategorize gif[{}]", category);
	}
	
	// Mark a GIF as a favorite.
	public void addFavorite(Integer id) {
		log.debug("add favorite[{}]", id);
	}
	
	// Remove a GIF as a favorite.
	public void removeFavorite(Integer id) {
		log.debug("remove favorite[{}]", id);
	}
	
	// Create GIF categories.
	public void createCategories(List<String> categories) {
		log.debug("create categories[{}]", categories);
	}
	
	// Read GIF categories.
	public void getCategories(Integer userId) {
		log.debug("get categories for userId[{}]", userId);
	}
	
	// Update GIF categories.
	public void updateCategory(Integer categoryId, String category) {
		log.debug("update category[{}][{}]", categoryId, category);
	}
	
	// Delete GIF categories.
	public void removeCategories(List<Integer> categoryIds) {
		log.debug("remove categories[{}]", categoryIds);
	}

	// Get trending GIFS from Giphy.
	public TrendingResponse getTrendingGifs() {
		log.debug("get trending gifs");
		TrendingResponse response = new TrendingResponse();
		TrendingRequest request = new TrendingRequest();
		
		try {
			ResponseEntity<TrendingResponse> resp =  giphyAccess.trending(request);
			response = resp.getBody();
			
		} catch (Exception e) {
			log.error("error getting trending data!", e);
			Meta meta = new Meta();
			meta.setMessage("error retrieving trending gifs!");
			meta.setStatus(HttpStatus.FAILED_DEPENDENCY.value());
			response.setMeta(meta);
		}
		
		return response;
	}
	
	
}
