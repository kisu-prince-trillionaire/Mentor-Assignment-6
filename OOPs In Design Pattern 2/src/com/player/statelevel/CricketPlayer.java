package com.player.statelevel;

import com.playable.Playable;
import com.player.Player;

public class CricketPlayer extends Player implements Playable {

	@Override
	public void play() {
		System.out.print("With a cricket ball");
	}
	
	public void batting(Player p) {
		System.out.print("Ganguly is Batting with ");
	}
	
	public void bowling() {
		System.out.println("Bowling of Cricket player");
	}

}
