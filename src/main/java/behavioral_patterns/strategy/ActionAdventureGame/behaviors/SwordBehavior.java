package behavioral_patterns.strategy.ActionAdventureGame.behaviors;

public class SwordBehavior implements WeaponBehavior {
	@Override
	public void useWeapon() {
		System.out.println("Swinging a sword!");
	}
}
