package behavioral_patterns.strategy.SimUDuck.model;

import behavioral_patterns.strategy.SimUDuck.behaviors.quack.Quack;
import behavioral_patterns.strategy.SimUDuck.behaviors.fly.FlyWithWings;

public class MallardDuck extends Duck {
	public MallardDuck() {
		setFlyBehavior(new FlyWithWings());
		setQuackBehavior(new Quack());
	}
	
	@Override
	public void display() {
		System.out.println("I am a Mallard duck!");
	}
}
