package com.player.statelevel;

import com.playable.Playable;
import com.player.Player;

public class FootBallPlayerr extends Player implements Playable{

	@Override
	public void play() {
		System.out.print("With a foot Ball");
	}
	
	public void kick() {
		System.out.println("Kicking");
	}
	
	public void corner() {
		System.out.println("Its corner!");
	}

	public void batting() {
		// TODO Auto-generated method stub
		
	}

}
