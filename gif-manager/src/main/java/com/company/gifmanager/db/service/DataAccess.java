package com.company.gifmanager.db.service;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.company.gifmanager.db.model.CategoryAssignment;
import com.company.gifmanager.db.model.Category;
import com.company.gifmanager.db.model.Favorite;
import com.company.gifmanager.db.model.GMGif;
import com.company.gifmanager.db.model.User;

@Transactional
public class DataAccess {
	
	@Autowired JdbcTemplate jdbcTemplate;

	
	// Create Category
	public Integer createCategory(Category category) {
		return jdbcTemplate.update("INSERT INTO categories (name, register_id) values(?, ?)", category.getName(), category.getRegisterId());
	}
	
	// Remove Category
	public Integer removeCategory(Integer id) {
		return jdbcTemplate.update("DELETE FROM categories where id = ?", id);
	}
	
	// Assign Category
	public Integer assignCategory(Integer id, CategoryAssignment ca) {
		return jdbcTemplate.update("INSERT INTO gif_categories (category_id, gif_id) values(?, ?)", ca.getId(), ca.getRegisterId());
	}
	
	// List Categories
	public List<Category> readCategories(Integer id) {
		return null;
	}
	
	// Register User
	public Integer registerUser(User user) {
		return jdbcTemplate.update("INSERT INTO register (username, password) values(?, ?)", user.getUserName(), user.getPassword()); 
	}
	
	// Authenticate User
	public Boolean authenticateUser(User user) {
		return false;
	}
	
	// Add Favorite
	public Integer addFavorite(Integer id, Favorite f) {
		return jdbcTemplate.update("INSERT INTO favorites (favorite_id, gif_id) values(?, ?)", f.getId(), f.getRegisterId());
	}
	
	// Remove Favorite
	public Integer removeFavorite(Integer id) {
		return jdbcTemplate.update("DELETE FROM favorites where id = ?", id);
	}
	
	// Save Gif
	public Integer saveGif(Integer userId, String giphyId) {
		return jdbcTemplate.update("INSERT INTO gifs (register_id, giphy_id) values(?, ?)", userId, giphyId);
	}
	
	// Remove Gif
	public Integer removeGif(Integer userId, Integer gifId) {
		return jdbcTemplate.update("DELETE FROM gifs where gifId = ? and userId = ?", gifId, userId);
	}
	
	// List Gifs
	public List<GMGif> readGifs(Integer userId){
		return null;
	}
	
}
