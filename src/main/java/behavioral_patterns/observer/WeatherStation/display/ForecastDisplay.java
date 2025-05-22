package behavioral_patterns.observer.WeatherStation.display;

import behavioral_patterns.observer.WeatherStation.observer.Observer;
import behavioral_patterns.observer.WeatherStation.observer.Subject;

public class ForecastDisplay implements Observer, Displayable {
	private double currentPressure = 29.92;
	private double lastPressure;
	private final Subject weatherData;
	
	public ForecastDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		
		weatherData.registerObserver(this);
	}
	
	@Override
	public void update(double temperature, double humidity, double pressure) {
		lastPressure = currentPressure;
		currentPressure = pressure;
		
		display();
	}
	
	public void display() {
		System.out.print("Forecast: ");
		
		if (currentPressure > lastPressure) {
			System.out.println("Improving weather on the way!");
		} else if (currentPressure == lastPressure) {
			System.out.println("More of the same");
		} else {
			System.out.println("Watch out for cooler, rainy weather");
		}
	}
}
