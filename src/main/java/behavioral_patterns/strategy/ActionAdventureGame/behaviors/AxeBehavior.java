package behavioral_patterns.strategy.ActionAdventureGame.behaviors;

public class AxeBehavior implements WeaponBehavior {
	@Override
	public void useWeapon() {
		System.out.println("Chopping with an axe!");
	}
}
