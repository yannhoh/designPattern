package ch.yannickhohler.depa.observer.example.display;

public interface Observer {
    void update(float temp, float humidity, float pressure);
}
