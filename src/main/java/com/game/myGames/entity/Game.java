package com.game.myGames.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
@Getter
@Setter
@Table(name="GamesData")
public class Game {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="GameId")
	private int gameId;
	
	@Column(name="ClashOfClans")
	private String clashOfClans;
	
	@Column(name="Aspalt")
	private int aspalt;
	
	@Column(name="AngryBird")
	private int angerBird;
}  
