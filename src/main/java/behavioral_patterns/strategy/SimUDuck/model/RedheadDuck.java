package behavioral_patterns.strategy.SimUDuck.model;

import behavioral_patterns.strategy.SimUDuck.behaviors.fly.FlyWithWings;
import behavioral_patterns.strategy.SimUDuck.behaviors.quack.Quack;

public class RedheadDuck extends Duck {
	public RedheadDuck() {
		setFlyBehavior(new FlyWithWings());
		setQuackBehavior(new Quack());
	}
	
	@Override
	public void display() {
		System.out.println("I am a Readhead duck!");
	}
}
