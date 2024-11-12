package com.game.myGames.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.game.myGames.entity.Game;
import com.game.myGames.repository.GameRepository;

@Service
public class GameService {
	@Autowired
	GameRepository gameRepository;

	public void save(Game game) {
		gameRepository.save(game);
	}

	public void saveAll(Game game) {
		gameRepository.save(game);
	}

	public Optional<Game> get(int id) {
		return gameRepository.findById(id);
	}

	public List<Game> getall() {
		return gameRepository.findAll();
	}

	public Game update(Game game) {
		Optional<Game> optional = gameRepository.findById(game.getGameId());
		Game game2 = optional.get();
		game2.setAngerBird(game.getAngerBird());
		game2.setAspalt(game.getAspalt());
		game2.setClashOfClans(game.getClashOfClans());
		return gameRepository.save(game2);
	}

}
