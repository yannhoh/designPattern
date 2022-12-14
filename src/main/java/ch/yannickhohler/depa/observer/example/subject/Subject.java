package ch.yannickhohler.depa.observer.example.subject;

import ch.yannickhohler.depa.observer.example.display.Observer;

public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
