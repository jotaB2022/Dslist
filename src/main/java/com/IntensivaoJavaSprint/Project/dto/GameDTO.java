package com.IntensivaoJavaSprint.Project.dto;

import com.IntensivaoJavaSprint.Project.entites.Game;
import com.IntensivaoJavaSprint.Project.projections.GameMinProjection;

public class GameDTO {

	private Long id;
	private String title;
	private Integer year;
	private String imgUrl;
	private String shortDescription;
	
	public GameDTO() {
		
	}
	
	public GameDTO(Game entity) {
		id = entity.getId();
		title = entity.getTitle();
		year = entity.getYear();
		imgUrl = entity.getImgUrl();
		shortDescription = entity.getShortDescription();
	}
	
	public GameDTO(GameMinProjection project) {
		id = project.getId();
		title = project.getTitle();
		year = project.getYear();
		imgUrl = project.getImgUrl();
		shortDescription = project.getShortDescription();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}
	
	
	
}
