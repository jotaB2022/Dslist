package com.IntensivaoJavaSprint.Project.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.IntensivaoJavaSprint.Project.dto.GameDTO;
import com.IntensivaoJavaSprint.Project.dto.GameListDTO;
import com.IntensivaoJavaSprint.Project.services.GameListService;
import com.IntensivaoJavaSprint.Project.services.GameService;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

	@Autowired
	private GameListService gameListService;
	
	@Autowired
	private GameService gameService;

	@GetMapping(value = "/{listId}/games")
	public List<GameDTO> findByList(@PathVariable Long listId) {
		List<GameDTO> result = gameService.findByList(listId);
		return result;
	}

	@GetMapping
	public List<GameListDTO> findAll() {
		List<GameListDTO> result = gameListService.findAll();

		return result;
	}
}
