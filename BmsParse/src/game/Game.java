package game;

import model.Bms;


public class Game {
	
	public static Bms bms;

	public static void main(String[] args) {

		bms = BmsLoader.load("bmsFiles/test.bms");
		
	}
	
}
