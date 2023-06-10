package HomeWork4;

import java.util.ArrayList;

public class Box<T extends Fruit> {

    private static int count = 0;

    private final int id = ++count;

    private final ArrayList<T> fruits = new ArrayList<>();

    public void addFruit(T fruit) { fruits.add(fruit); }

    public double getWeight() {
        double sum = 0;
        for (T fruit : fruits) sum += fruit.getWeight();
        return sum;
    }

    public void compare(Box<? extends Fruit> box) {
        if (this.getWeight() == box.getWeight()) System.out.println("Вес коробок равен");
        else if (this.getWeight() > box.getWeight()) System.out.printf("%s тяжелее чем %s\n", this, box);
        else System.out.printf("%s тяжелее чем %s\n", box, this);
    }

    public void transferFruits(Box<T> box) {
        this.fruits.addAll(box.fruits);
        System.out.println("Фрукты из " + box + " пересыпаем в " + this);
        box.fruits.clear();
    }

    public void showBox() {
        System.out.println("В " + this + " " + fruits.size() + " шт. весом " + this.getWeight() + " кг.");
    }

    @Override
    public String toString() {
        return fruits.size() > 0 ? "Коробка " + id + " " + fruits.get(0).getName() : "Коробка " + id + " пуста."; }
}