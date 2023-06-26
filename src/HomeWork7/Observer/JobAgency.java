package HomeWork7.Observer;

import java.util.ArrayList;
import java.util.List;

public class JobAgency implements Publisher {

    List<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer obsever) {
        observers.add(obsever);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void sendOffer(Vacancy vacancy) {
        for (Observer observer:observers) {
            if (observer.getNeedJob()) {observer.receiveOffer(vacancy);}
        }
    }
}