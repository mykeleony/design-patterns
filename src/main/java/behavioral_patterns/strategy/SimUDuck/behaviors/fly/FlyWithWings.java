package behavioral_patterns.strategy.SimUDuck.behaviors.fly;

public class FlyWithWings implements FlyBehavior {
	@Override
	public void fly() {
		System.out.println("Flying with wings!");
	}
}
