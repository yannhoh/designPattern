package ch.yannickhohler.depa.observer.example.display;

import ch.yannickhohler.depa.observer.example.WeatherData;

public class ForecastDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private final WeatherData weatherData;

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }

    @Override public void display() {
        System.out.println("forecastDisplay: " + temperature + " " + humidity);
    }
}
