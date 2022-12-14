package ch.yannickhohler.depa.observer.example.display;

import ch.yannickhohler.depa.observer.example.subject.WeatherData;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private final WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
        System.err.println(celsiusToFahrenheit(30));
        System.err.println(fahrenheitToCelsius(86));
    }

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("Current conditions: " + temperature + "°C und " + humidity + "% humidity");
        System.out.println("Feels Like (F): " + computeHeatIndex(celsiusToFahrenheit(temperature), humidity));
        System.out.println("Feels Like (C): " + fahrenheitToCelsius(computeHeatIndex(celsiusToFahrenheit(temperature), humidity)));
    }

    static float celsiusToFahrenheit(float c) {
        return (c * (9f/5f) + 32f);
    }
    static float fahrenheitToCelsius(float f) {
        return (f - 32f) * (5f/9f);
    }

    private float computeHeatIndex(float t, float rh) {
        return  (float)((16.923 + (0.185212 * t) + (5.37941 * rh) - (0.100254 * t * rh) +
                (0.00941695 * (t * t)) + (0.00728898 * (rh * rh)) +
                (0.000345372 * (t * t * rh)) - (0.000814971 * (t * rh * rh)) +
                (0.0000102102 * (t * t * rh * rh)) - (0.000038646 * (t * t * t)) + (0.0000291583 *
                (rh * rh * rh)) + (0.00000142721 * (t * t * t * rh)) +
                (0.000000197483 * (t * rh * rh * rh)) - (0.0000000218429 * (t * t * t * rh * rh)) +
                0.000000000843296 * (t * t * rh * rh * rh)) -
                (0.0000000000481975 * (t * t * t * rh * rh * rh)));
    }
}
