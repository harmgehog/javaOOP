package HomeWork2;

public class MainClass {
    public static void main(String[] args) {
        Cat cat = new Cat("Барсук", 15);
        System.out.println("Кот " + cat.getName() + " с аппетитом " + cat.getAppetite());
        Plate plate = new Plate(10);
        plate.info();

        int temp = cat.getAppetite();
        cat.eat(plate.getFood());
        plate.setFood(temp);
        plate.info();

// Задание 4. добавить еды в тарелку!
        plate.addFood(999);
        plate.info();

// Задание 3. массив котов которые все едят!!
        Cat[] cats = {
                new Cat("Беня", 10),
                new Cat("Веня", 9),
                new Cat("Сеня",8),
                new Cat("Тучка",7),
                new Cat("Кирка", 6)
        };

        for (Cat item: cats) {
            if (plate.getFood() >= item.getAppetite() && !item.getFullness()){
                temp = item.getAppetite();
                item.eat(plate.getFood());
                plate.setFood(temp);
                plate.info();
            }
        }
    }
}
