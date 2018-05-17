package com.company.gifmanager.controller;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.company.gifmanager.db.model.User;
import com.company.gifmanager.giphy.model.GetResponse;
import com.company.gifmanager.giphy.model.Gif;
import com.company.gifmanager.giphy.model.TrendingResponse;
import com.company.gifmanager.service.GifManager;
import com.company.gifmanager.service.UserManager;


@Controller
public class ManagerController {
	private final Logger log = LoggerFactory.getLogger(getClass());

	@Autowired UserManager userManager;
	@Autowired GifManager gifManager;
	
	
	@RequestMapping("*")
	public String main(Model model) {
		log.info("main model");
		
		// Retain persistent attributes
		retainAttributes(model);
			
		// Load Trending Gifs
		TrendingResponse tr = gifManager.getTrendingGifs();
		log.debug("trending response received[{}]", tr);
		model.addAttribute("gifList", tr.getGifList());		
		
		// Debugging
		for (Gif gif : tr.getGifList()) {
			log.debug("trending gif[{}]", gif.getId());
			log.debug("gif info : {}", gif);
		}
		
		return "main";
	}

	@RequestMapping("/main/{id}")
	public String mainWithGiphyId(Model model,
			@PathVariable(name="id") String id) {
		log.info("main model with id[{}]", id);
		retainAttributes(model);
		
		GetResponse gr = gifManager.getGiphyGif(id);			
		model.addAttribute("gifInfo", gr.getGif());
			
		return "main";
	}
	
	// Login an existing user
	@GetMapping("/login")
	public String loginUser(Model model) {
		log.debug("enter login");
		retainAttributes(model);
		model.addAttribute("id", 0);
		return "loggedin";
	}
	
	// Register a user
	@GetMapping("/register")
	public String registerUser(Model model) {
		log.debug("enter register");
		model.addAttribute("user", new User());
		model.addAttribute("gmProfile", "true");
		model.addAttribute("submitAction", "Register");
		
		return "main";
	}
	
	@PostMapping("/updateUser")
	public String updateUser(Model model,
			User user) {
		log.debug("update user[{}]", user);
		retainAttributes(model);
		
		log.debug("user name[{}]", user.getName());
		log.debug("user userName[{}]", user.getUserName());		
		
		model.addAttribute("user", user);
		return "main";
	}
	
	// Search for GIFS
	@GetMapping("/search")
	public String searchGifs(Model model) {
		log.debug("enter search");
		retainAttributes(model);
		model.addAttribute("id", 0);
		return "searchresults";
	}
	
	// List Favorite GIFS
	
	// Register favorite GIF
	
	// Categorize GIF
	
	// Add categories
	
	// Remove categories
	
		
	@GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		log.debug("enter greeting, name[{}]", name);
		retainAttributes(model);
        model.addAttribute("name", name);
        return "greeting";
    }

	// Upload GIF
	@GetMapping("/upload")
	public String upload(Model model) {
		log.debug("enter get upload");
		retainAttributes(model);
		return "uploadForm";
	}
	

	
	private Model retainAttributes(Model model){
		if (!model.containsAttribute("user")) {
			model.addAttribute("user", new User());
		}
		return model;
	}
	
}
