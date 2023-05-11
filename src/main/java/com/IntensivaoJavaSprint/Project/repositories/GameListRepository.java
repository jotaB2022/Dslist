package com.IntensivaoJavaSprint.Project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.IntensivaoJavaSprint.Project.entites.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
