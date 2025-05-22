package behavioral_patterns.observer.WeatherStation.app;

import behavioral_patterns.observer.WeatherStation.model.Subject;
import behavioral_patterns.observer.WeatherStation.display.CurrentConditionsDisplay;
import behavioral_patterns.observer.WeatherStation.display.ForecastDisplay;
import behavioral_patterns.observer.WeatherStation.display.HeatIndexDisplay;
import behavioral_patterns.observer.WeatherStation.display.StatisticsDisplay;

public class WeatherStation {
	public static void main(String[] args) {
		Subject weatherData = new Subject();
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);
		
		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
	}
}
