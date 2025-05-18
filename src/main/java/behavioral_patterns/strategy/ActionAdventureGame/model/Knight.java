package behavioral_patterns.strategy.ActionAdventureGame.model;

import behavioral_patterns.strategy.ActionAdventureGame.behaviors.SwordBehavior;

public class Knight extends Character {
	public Knight() {
		setWeaponBehavior(new SwordBehavior());
	}
	
	@Override
	public void display() {
		System.out.println("I am a Knight!");
	}
}
