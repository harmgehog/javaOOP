package HomeWork7.Observer;

public class Vacancy {
    private OfferBuilder builder;
    private double salary;
    private VacancyType type;

    public OfferBuilder getBuilder() {
        return builder;
    }

    public VacancyType getType() {
        return type;
    }

    public double getSalary() {
        return salary;
    }

    public String getDescription() {
        return description;
    }

    private String description;



    public Vacancy(OfferBuilder builder, double salary, VacancyType type, String description) {
        this.builder = builder;
        this.salary = salary;
        this.type = type;
        this.description = description;
    }

}