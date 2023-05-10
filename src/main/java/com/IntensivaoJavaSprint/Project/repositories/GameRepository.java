package com.IntensivaoJavaSprint.Project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.IntensivaoJavaSprint.Project.entites.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
