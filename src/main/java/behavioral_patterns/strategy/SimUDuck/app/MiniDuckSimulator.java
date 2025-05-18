package behavioral_patterns.strategy.SimUDuck.app;

import behavioral_patterns.strategy.SimUDuck.model.MallardDuck;
import behavioral_patterns.strategy.SimUDuck.model.Duck;
import behavioral_patterns.strategy.SimUDuck.model.ModelDuck;
import behavioral_patterns.strategy.SimUDuck.model.RubberDuck;
import behavioral_patterns.strategy.SimUDuck.behaviors.fly.FlyRocketPowered;

public class MiniDuckSimulator {
	public static void main(String[] args) {
		System.out.println("Testing for Mallard duck: ");
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
		
		System.out.println("Testing for model duck: ");
		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
		
		System.out.println("Testing for sudden Rubber duck: ");
		model = new RubberDuck();
		model.performFly();
		model.performQuack();
	}
}
