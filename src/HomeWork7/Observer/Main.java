package HomeWork7.Observer;

public class Main {
    public static void main(String[] args) {
        JobAgency jobAgency = new JobAgency();
        Company geekBrain = new Company("GeekBrains", 70000, jobAgency);
        Company google = new Company("Google", 100000, jobAgency);
        Company yandex = new Company("Yandex", 120000, jobAgency);

        Master ivanov = new Master("Ivanov");
        Master petrov = new Master("Petrov");
        Student sidorov = new Student("Sidorov");
        JuniorDev pochkin = new JuniorDev("Pochkin");
        MiddleDev sJobs = new MiddleDev("Stive Jobs");

        jobAgency.registerObserver(ivanov);
        jobAgency.registerObserver(petrov);
        jobAgency.registerObserver(sidorov);
        jobAgency.registerObserver(pochkin);
        jobAgency.registerObserver(sJobs);

        Vacancy vacancy1 = geekBrain.generateOffer("Описание", VacancyType.Cleaner);
        Vacancy vacancy2 = google.generateOffer("Описание", VacancyType.FrontEndDev);
        Vacancy vacancy3 = yandex.generateOffer("Описание", VacancyType.BackEndDev);
        Vacancy vacancy4 = yandex.generateOffer("Описание", VacancyType.BackEndDev);

        for (int i = 0; i < 1; i++) {
            geekBrain.sendOffer(vacancy1);
            google.sendOffer(vacancy2);
            yandex.sendOffer(vacancy3);
            yandex.sendOffer(vacancy4);
        }
    }
}