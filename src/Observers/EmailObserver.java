package Observers;

import Observables.TemperatureObservables;

public class EmailObserver implements Observer{
    String email;
    TemperatureObservables observables;
    public EmailObserver(TemperatureObservables observables, String email) {
        this.observables = observables;
        this.email = email;
    }

    @Override
    public void update() {
        notifyUser(email);
    }

    private void notifyUser(String email){
        System.out.println("Email: "+this.email+"--- Notified->" + observables.getTemperature());
    }
}
