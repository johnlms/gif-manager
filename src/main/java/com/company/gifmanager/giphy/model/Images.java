package com.company.gifmanager.giphy.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("images")
@JsonIgnoreProperties(ignoreUnknown=true)
public class Images {
	private Image fixedHeight;
	private Image fixedHeightStill;
	private Image fixedHeightDownSampled;
	private Image fixedWidth;
	private Image fixedWidthStill;
	private Image fixedWidthDownSampled;
	private Image fixedHeightSmall;
	private Image fixedHeightSmallStill;
	private Image fixedWidthSmall;
	private Image fixedWidthSmallStill;
	private Image downsized;
	private Image downsizedStill;
	private Image downsizedLarge;
	private Image downsizedMedium;
	private Image downsizedSmall;
	private Image original;
	private Image originalStill;
	private Image looping;
	private Image preview;
	private Image previewGif;
	
	
	@JsonProperty("fixed_height")
	public Image getFixedHeight() {
		return fixedHeight;
	}
	public void setFixedHeight(Image fixedHeight) {
		this.fixedHeight = fixedHeight;
	}
	
	@JsonProperty("fixed_height_still")
	public Image getFixedHeightStill() {
		return fixedHeightStill;
	}
	public void setFixedHeightStill(Image fixedHeightStill) {
		this.fixedHeightStill = fixedHeightStill;
	}
	
	@JsonProperty("fixed_height_downsampled")
	public Image getFixedHeightDownSampled() {
		return fixedHeightDownSampled;
	}
	public void setFixedHeightDownSampled(Image fixedHeightDownSampled) {
		this.fixedHeightDownSampled = fixedHeightDownSampled;
	}
	
	@JsonProperty("fixed_width")
	public Image getFixedWidth() {
		return fixedWidth;
	}
	public void setFixedWidth(Image fixedWidth) {
		this.fixedWidth = fixedWidth;
	}
	
	@JsonProperty("fixed_width_still")
	public Image getFixedWidthStill() {
		return fixedWidthStill;
	}
	public void setFixedWidthStill(Image fixedWidthStill) {
		this.fixedWidthStill = fixedWidthStill;
	}
	
	@JsonProperty("fixed_width_downsampled")
	public Image getFixedWidthDownSampled() {
		return fixedWidthDownSampled;
	}
	public void setFixedWidthDownSampled(Image fixedWidthDownSampled) {
		this.fixedWidthDownSampled = fixedWidthDownSampled;
	}
	
	@JsonProperty("fixed_height_small")
	public Image getFixedHeightSmall() {
		return fixedHeightSmall;
	}
	public void setFixedHeightSmall(Image fixedHeightSmall) {
		this.fixedHeightSmall = fixedHeightSmall;
	}
	
	@JsonProperty("fixed_height_small_still")
	public Image getFixedHeightSmallStill() {
		return fixedHeightSmallStill;
	}
	public void setFixedHeightSmallStill(Image fixedHeightSmallStill) {
		this.fixedHeightSmallStill = fixedHeightSmallStill;
	}
	
	@JsonProperty("fixed_width_small")
	public Image getFixedWidthSmall() {
		return fixedWidthSmall;
	}
	public void setFixedWidthSmall(Image fixedWidthSmall) {
		this.fixedWidthSmall = fixedWidthSmall;
	}
	
	@JsonProperty("fixed_width_small_still")
	public Image getFixedWidthSmallStill() {
		return fixedWidthSmallStill;
	}
	public void setFixedWidthSmallStill(Image fixedWidthSmallStill) {
		this.fixedWidthSmallStill = fixedWidthSmallStill;
	}
	
	@JsonProperty("downsized")
	public Image getDownsized() {
		return downsized;
	}
	public void setDownsized(Image downsized) {
		this.downsized = downsized;
	}
	
	@JsonProperty("downsized_still")
	public Image getDownsizedStill() {
		return downsizedStill;
	}
	public void setDownsizedStill(Image downsizedStill) {
		this.downsizedStill = downsizedStill;
	}
	
	@JsonProperty("downsized_large")
	public Image getDownsizedLarge() {
		return downsizedLarge;
	}
	public void setDownsizedLarge(Image downsizedLarge) {
		this.downsizedLarge = downsizedLarge;
	}
	
	@JsonProperty("downsized_medium")
	public Image getDownsizedMedium() {
		return downsizedMedium;
	}
	public void setDownsizedMedium(Image downsizedMedium) {
		this.downsizedMedium = downsizedMedium;
	}
	
	@JsonProperty("downsized_small")
	public Image getDownsizedSmall() {
		return downsizedSmall;
	}
	public void setDownsizedSmall(Image downsizedSmall) {
		this.downsizedSmall = downsizedSmall;
	}
	
	@JsonProperty("original")
	public Image getOriginal() {
		return original;
	}
	public void setOriginal(Image original) {
		this.original = original;
	}
	
	@JsonProperty("original_still")
	public Image getOriginalStill() {
		return originalStill;
	}
	public void setOriginalStill(Image originalStill) {
		this.originalStill = originalStill;
	}
	
	@JsonProperty("looping")
	public Image getLooping() {
		return looping;
	}
	public void setLooping(Image looping) {
		this.looping = looping;
	}
	
	@JsonProperty("preview")
	public Image getPreview() {
		return preview;
	}
	public void setPreview(Image preview) {
		this.preview = preview;
	}
	
	@JsonProperty("preview_gif")
	public Image getPreviewGif() {
		return previewGif;
	}
	public void setPreviewGif(Image previewGif) {
		this.previewGif = previewGif;
	}
	
	
}
