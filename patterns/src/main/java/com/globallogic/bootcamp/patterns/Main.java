package com.globallogic.bootcamp.patterns;

public class Main {
	
	public static void main(String[] args) {
		Playstation playstation = new Playstation(new Game("Resident Evil"));
		
		System.out.println(playstation.askMyGame());
		
		playstation.setVideoGame(new Game("Brawlhalla"));
		
		System.out.println(playstation.askMyGame());
		
		playstation.setVideoGame(null);
		
		System.out.println(playstation.askMyGame());
	}

}
