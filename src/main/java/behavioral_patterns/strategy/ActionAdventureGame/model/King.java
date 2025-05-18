package behavioral_patterns.strategy.ActionAdventureGame.model;

import behavioral_patterns.strategy.ActionAdventureGame.behaviors.KnifeBehavior;

public class King extends Character {
	public King() {
		setWeaponBehavior(new KnifeBehavior());
	}
	
	@Override
	public void display() {
		System.out.println("I am a King!");
	}
}
