package behavioral_patterns.observer.WeatherStation.display;

import behavioral_patterns.observer.WeatherStation.observer.Observer;
import behavioral_patterns.observer.WeatherStation.observer.Subject;

public class CurrentConditionsDisplay implements Observer, Displayable {
	private double temperature;
	private double humidity;
	private final Subject weatherData;
	
	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		
		weatherData.registerObserver(this);
	}
	
	@Override
	public void update(double temperature, double humidity, double pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		display();
	}
	
	@Override
	public void display() {
		System.out.println("Current conditions: " + temperature + "F degrees " +
				                   "and " + humidity + "% humidity.");
	}
}
