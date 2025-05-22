package behavioral_patterns.observer.WeatherStation.display;

import behavioral_patterns.observer.WeatherStation.observer.Observer;
import behavioral_patterns.observer.WeatherStation.observer.Subject;

public class StatisticsDisplay implements Observer, Displayable {
	private double maxTemperature = 0;
	private double minTemperature = 200.0;
	private double temperatureSum = 0;
	private int numReadings = 0;
	private final Subject weatherData;
	
	public StatisticsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		
		weatherData.registerObserver(this);
	}
	
	@Override
	public void update(double temperature, double humidity, double pressure) {
		temperatureSum += temperature;
		numReadings++;
		
		maxTemperature = Math.max(maxTemperature, temperature);
		minTemperature = Math.min(minTemperature, temperature);
		
		display();
	}
	
	@Override
	public void display() {
		System.out.println("Average/Max/Min temperature = " + (temperatureSum / numReadings)
				                   + "/" + maxTemperature + "/" + minTemperature);
	}
}
