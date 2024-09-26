package Observables;

import Observers.Observer;

public interface Observables {
    public void addObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers();
    public double getTemperature();
    public void updateTemperature(double tmp);
}
