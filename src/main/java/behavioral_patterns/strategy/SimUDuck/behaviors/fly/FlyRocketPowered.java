package behavioral_patterns.strategy.SimUDuck.behaviors.fly;

public class FlyRocketPowered implements FlyBehavior {
	@Override
	public void fly() {
		System.out.println("I'm flying with a rocket!");
	}
}
