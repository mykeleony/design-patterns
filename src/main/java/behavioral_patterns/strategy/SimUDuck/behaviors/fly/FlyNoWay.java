package behavioral_patterns.strategy.SimUDuck.behaviors.fly;

public class FlyNoWay implements FlyBehavior {
	@Override
	public void fly() {
		System.out.println("I can't fly :(");
	}
}
