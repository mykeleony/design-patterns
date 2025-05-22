package behavioral_patterns.observer.WeatherStation.observer;

public interface Observer {
	void update(double temperature, double humidity, double pressure);
}
