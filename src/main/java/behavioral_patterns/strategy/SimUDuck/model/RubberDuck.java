package behavioral_patterns.strategy.SimUDuck.model;

import behavioral_patterns.strategy.SimUDuck.behaviors.fly.FlyNoWay;
import behavioral_patterns.strategy.SimUDuck.behaviors.quack.Squeak;

public class RubberDuck extends Duck {
	public RubberDuck() {
		setFlyBehavior(new FlyNoWay());
		setQuackBehavior(new Squeak());
	}
	
	@Override
	public void display() {
		System.out.println("I am a rubber duck!");
	}
}
