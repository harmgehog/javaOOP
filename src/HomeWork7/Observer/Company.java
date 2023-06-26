package HomeWork7.Observer;

import java.util.Random;

public class Company implements OfferBuilder {
    private static Random random = new Random();
    private String companyName;
    private double maxSalary;



    private Publisher jobAgency;

    public Company(String companyName, double maxSalary, Publisher jobAgency) {
        this.companyName = companyName;
        this.maxSalary = maxSalary;
        this.jobAgency = jobAgency;
    }

    @Override
    public Vacancy generateOffer(String description,VacancyType type) {
        double salary = random.nextDouble(3000,maxSalary);
        return new Vacancy(this, salary,type, description);

    }

    @Override
    public void sendOffer(Vacancy vacancy) {
        jobAgency.sendOffer(vacancy);
    }

    @Override
    public String getName() {
        return companyName;
    }

}