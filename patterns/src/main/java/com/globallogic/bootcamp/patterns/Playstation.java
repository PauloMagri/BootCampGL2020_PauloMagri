package com.globallogic.bootcamp.patterns;

import java.util.Objects;

public class Playstation {

	private Game videoGame;
	
	public Playstation(Game game) {
		this.videoGame = game;
	}
	
	public void setVideoGame(Game videoGame) {
		this.videoGame = videoGame;
	}
	
	public String askMyGame() {
		if(Objects.isNull(videoGame)) {
			return "¡Estoy vacío!";
		} else {
			return "El videojuego que estoy corriendo es: " + videoGame.getTitle();
		}
	}
}
