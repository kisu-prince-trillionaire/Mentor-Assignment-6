package com.player.statelevel;

import com.playable.Playable;
import com.player.Player;

public class TennisPlayer extends Player implements Playable {

	@Override
	public void play() {
		System.out.print("With a tennis ball");
	}
	
	public void shot() {
		System.out.println("Shot of a tennis");
	}

}
