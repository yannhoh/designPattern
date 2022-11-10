package ch.yannickhohler.depa.observer.example;

import ch.yannickhohler.depa.observer.example.display.CurrentConditionsDisplay;
import ch.yannickhohler.depa.observer.example.display.ForecastDisplay;
import ch.yannickhohler.depa.observer.example.display.StatisticsDisplay;
import ch.yannickhohler.depa.observer.example.subject.WeatherData;

public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay =       // Creating Oberservers with the subject weatherData
                new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(27, 65, 30.4f);
        weatherData.setMeasurements(28, 70, 29.2f);
        weatherData.setMeasurements(26, 90, 29.2f);

        weatherData.removeObserver(forecastDisplay);
        weatherData.setMeasurements(22, 90, 25f);
    }


}
