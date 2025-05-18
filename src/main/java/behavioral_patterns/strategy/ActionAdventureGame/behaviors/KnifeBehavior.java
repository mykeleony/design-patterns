package behavioral_patterns.strategy.ActionAdventureGame.behaviors;

public class KnifeBehavior implements WeaponBehavior {
	@Override
	public void useWeapon() {
		System.out.println("Cutting with a knife!");
	}
}
