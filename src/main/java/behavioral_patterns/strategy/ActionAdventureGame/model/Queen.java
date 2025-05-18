package behavioral_patterns.strategy.ActionAdventureGame.model;

import behavioral_patterns.strategy.ActionAdventureGame.behaviors.BowAndArrowBehavior;

public class Queen extends Character {
	public Queen() {
		setWeaponBehavior(new BowAndArrowBehavior());
	}
	
	@Override
	public void display() {
		System.out.println("I am a Queen!");
	}
}
