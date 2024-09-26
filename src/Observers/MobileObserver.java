package Observers;

import Observables.TemperatureObservables;

public class MobileObserver implements Observer{
    String mob;
    TemperatureObservables observables;
    public MobileObserver(TemperatureObservables observables,String mobile) {
        this.observables = observables;
        this.mob = mobile;
    }

    @Override
    public void update() {
        notifyUser(mob);
    }

    private void notifyUser(String mobile){
        System.out.println("Mobile: "+this.mob+"--- Notified->" + observables.getTemperature());
    }
}
