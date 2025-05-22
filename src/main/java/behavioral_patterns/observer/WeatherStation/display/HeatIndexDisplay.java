package behavioral_patterns.observer.WeatherStation.display;

import behavioral_patterns.observer.WeatherStation.model.Subject;
import behavioral_patterns.observer.WeatherStation.observer.Observer;

public class HeatIndexDisplay implements Observer, Displayable {
	double heatIndex = 0;
	private final Subject weatherData;
	
	public HeatIndexDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		
		weatherData.registerObserver(this);
	}
	
	@Override
	public void update(double temperature, double humidity, double pressure) {
		heatIndex = computeHeatIndex(temperature, humidity);
		
		display();
	}
	
	private double computeHeatIndex(double t, double rh) {
		return ((16.923 + (0.185212 * t) + (5.37941 * rh) - (0.100254 * t * rh)
				                       + (0.00941695 * (t * t)) + (0.00728898 * (rh * rh))
				                       + (0.000345372 * (t * t * rh)) - (0.000814971 * (t * rh * rh)) +
				                       (0.0000102102 * (t * t * rh * rh)) - (0.000038646 * (t * t * t)) + (0.0000291583 *
						                                                                                           (rh * rh * rh)) + (0.00000142721 * (t * t * t * rh)) +
				                       (0.000000197483 * (t * rh * rh * rh)) - (0.0000000218429 * (t * t * t * rh * rh)) +
				                       0.000000000843296 * (t * t * rh * rh * rh)) -
				                      (0.0000000000481975 * (t * t * t * rh * rh * rh)));

	}
	
	public void display() {
		System.out.println("Heat index is " + heatIndex);
	}
}
