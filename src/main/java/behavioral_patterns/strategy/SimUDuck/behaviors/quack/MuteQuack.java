package behavioral_patterns.strategy.SimUDuck.behaviors.quack;

public class MuteQuack implements QuackBehavior {
	@Override
	public void quack() {
		System.out.println("<< Silence >>");
	}
}
