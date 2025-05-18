package behavioral_patterns.strategy.SimUDuck.behaviors.quack;

public class Squeak implements QuackBehavior {
	@Override
	public void quack() {
		System.out.println("Squeak!");
	}
}
