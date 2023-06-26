package HomeWork7.Observer;

public interface OfferBuilder {

    Vacancy generateOffer(String description,VacancyType type);

    void sendOffer(Vacancy vacancy);

    String getName();

}