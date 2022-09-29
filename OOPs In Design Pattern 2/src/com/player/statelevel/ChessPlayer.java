package com.player.statelevel;

import com.playable.Playable;
import com.player.Player;

public class ChessPlayer extends Player implements Playable {

	@Override
	public void play() {
		System.out.print("With a chess dot");
	}
	
	public void moveTheDot() {
		System.out.println("Move the dot on the chess board");
	}

}
