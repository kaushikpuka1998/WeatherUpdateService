import Observables.TemperatureObservables;
import Observers.EmailObserver;
import Observers.MobileObserver;

public class Main {
    public static void main(String[] args) {
        TemperatureObservables observables = new TemperatureObservables();
        EmailObserver emailObserver = new EmailObserver(observables, "kgstrivers@gmail.com");
        EmailObserver emailObserver2 = new EmailObserver(observables, "abc@gmail.com");
        observables.addObserver(emailObserver);
        observables.addObserver(emailObserver2);
        observables.updateTemperature(25.0);

        MobileObserver mobileObserver = new MobileObserver(observables, "1234567890");
        observables.addObserver(mobileObserver);
        observables.updateTemperature(30.0);
    }
}