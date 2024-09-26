package Observables;

import Observers.Observer;

import java.util.ArrayList;
import java.util.List;

public class TemperatureObservables implements Observables{

    double temperature = 21.0;
    List<Observer> observerList = new ArrayList<>();
    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
    observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer: observerList){
            observer.update();
        }
    }


    @Override
    public double getTemperature() {
        return temperature;
    }

    @Override
    public void updateTemperature(double tmp) {
        temperature = tmp;
        notifyObservers();
    }
}
