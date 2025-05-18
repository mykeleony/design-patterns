package behavioral_patterns.strategy.ActionAdventureGame.app;

import behavioral_patterns.strategy.ActionAdventureGame.behaviors.BowAndArrowBehavior;
import behavioral_patterns.strategy.ActionAdventureGame.model.*;
import behavioral_patterns.strategy.ActionAdventureGame.model.Character;

public class Game {
	public static void main(String[] args) {
		Character king = new King();
		king.display();
		king.fight();
		
		Character queen = new Queen();
		queen.display();
		queen.fight();
		
		Character troll = new Troll();
		troll.display();
		troll.fight();
		
		Character knight = new Knight();
		knight.display();
		knight.fight();
		knight.setWeaponBehavior(new BowAndArrowBehavior());
		knight.fight();
	}
}
