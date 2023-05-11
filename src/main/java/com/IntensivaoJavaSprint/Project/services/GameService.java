package com.IntensivaoJavaSprint.Project.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.IntensivaoJavaSprint.Project.dto.GameDTO;
import com.IntensivaoJavaSprint.Project.entites.Game;
import com.IntensivaoJavaSprint.Project.projections.GameMinProjection;
import com.IntensivaoJavaSprint.Project.repositories.GameRepository;

@Service
public class GameService {

	@Autowired
	private GameRepository gameRepository;

	@Transactional(readOnly = true)
	public List<GameDTO> findAll() {
		List<Game> result = gameRepository.findAll();
		return result.stream().map(GameDTO::new).toList();
	}

	@Transactional(readOnly = true)
	public GameDTO findById(Long id) {
		Game result = gameRepository.findById(id).get();
		GameDTO rs = new GameDTO(result);
		return rs;
	}
	
	public List<GameDTO> findByList(Long listId) {
		List<GameMinProjection> result = gameRepository.searchByList(listId);
		return result.stream().map(GameDTO::new).toList();
	}
	

}
