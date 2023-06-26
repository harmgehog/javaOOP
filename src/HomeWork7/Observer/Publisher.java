package HomeWork7.Observer;

public interface Publisher {
    void registerObserver (Observer obsever);

    void removeObserver (Observer observer);

    void sendOffer(Vacancy vacancy);

}