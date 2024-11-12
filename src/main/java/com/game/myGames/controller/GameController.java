package com.game.myGames.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.game.myGames.entity.Game;
import com.game.myGames.service.GameService;

@RequestMapping("/api/game")
@RestController
public class GameController {
	
	@Autowired
	GameService gameService;
	
	@PostMapping("/post")
		public Game save(@RequestBody Game game) {
		gameService.save(game);
		return game;	
	}
	@PostMapping("/postAll")
		public Game saveAll(@RequestBody Game game) {
		gameService.saveAll(game);
		return game;
	}
	@GetMapping("/get")
		 public Optional<Game> get(@RequestParam int id) {
		return gameService.get(id);
	}
	@GetMapping("/getall")
		public List<Game> getall() {
		return gameService.getall();
	}
	@PutMapping("/update")
		public Game update(@RequestBody Game game) {
		return gameService.update(game);
		
	}
		}
	

 