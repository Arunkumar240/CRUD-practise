package com.game.myGames.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.game.myGames.entity.Game;

@Repository
public interface GameRepository extends JpaRepository<Game, Integer> {

}
