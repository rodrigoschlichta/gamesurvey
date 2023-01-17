package com.camfel.gamesurvey.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.camfel.gamesurvey.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
