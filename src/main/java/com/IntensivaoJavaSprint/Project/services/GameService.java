package com.IntensivaoJavaSprint.Project.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.IntensivaoJavaSprint.Project.dto.GameDTO;
import com.IntensivaoJavaSprint.Project.entites.Game;
import com.IntensivaoJavaSprint.Project.repositories.GameRepository;

@Service
public class GameService {

	@Autowired
	private GameRepository gameRepository;
	
	public List<GameDTO> findAll(){
		List<Game> result = gameRepository.findAll();
		return result.stream().map(GameDTO::new).toList();
	}
	
}
