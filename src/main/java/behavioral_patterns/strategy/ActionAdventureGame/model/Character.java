package behavioral_patterns.strategy.ActionAdventureGame.model;

import behavioral_patterns.strategy.ActionAdventureGame.behaviors.WeaponBehavior;

public abstract class Character {
	private WeaponBehavior weaponBehavior;
	
	protected Character() {}
	
	public abstract void display();
	
	public void fight() {
		weaponBehavior.useWeapon();
	}
	
	public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
		this.weaponBehavior = weaponBehavior;
	}
}
