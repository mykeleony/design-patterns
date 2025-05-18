package behavioral_patterns.strategy.SimUDuck.model;

import behavioral_patterns.strategy.SimUDuck.behaviors.fly.FlyNoWay;
import behavioral_patterns.strategy.SimUDuck.behaviors.quack.Quack;

public class ModelDuck extends Duck {
	public ModelDuck() {
		setFlyBehavior(new FlyNoWay());
		setQuackBehavior(new Quack());
	}
	
	@Override
	public void display() {
		System.out.println("I am nothing but a model duck!");
	}
}
