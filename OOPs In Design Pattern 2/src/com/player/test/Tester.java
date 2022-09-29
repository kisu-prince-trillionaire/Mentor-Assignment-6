package com.player.test;

import com.player.Player;
import com.player.statelevel.CricketPlayer;
import com.player.statelevel.FootBallPlayerr;
import com.player.statelevel.TennisPlayer;

public class Tester {

	public static void main(String[] args) {
		Player cp = new CricketPlayer();
		cp.batting(cp);
		cp.play();
//		TennisPlayer  tp = new TennisPlayer();
//		tp.batting(tp);
//		tp.play();
	}

}
