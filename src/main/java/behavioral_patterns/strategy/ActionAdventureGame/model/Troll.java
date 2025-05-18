package behavioral_patterns.strategy.ActionAdventureGame.model;

import behavioral_patterns.strategy.ActionAdventureGame.behaviors.AxeBehavior;

public class Troll extends Character {
	public Troll() {
		setWeaponBehavior(new AxeBehavior());
	}
	
	@Override
	public void display() {
		System.out.println("I am a Troll!");
	}
}
