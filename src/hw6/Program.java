package hw6;

import java.io.File;

public class Program {
    /**
     * TODO: Задача 1. Домашняя работа. Оптимизировать работу класса Order в  рамках принципа SRP.
     * @param args
     */
    public static void main(String[] args) {
        Order order = new Order("Superman", "Prius", 3,50);
        Saver saver = new Saver();
        Loader loader = new Loader();
        saver.saveToJson(order);
        saver.saveToXML(order);
        saver.saveToTxt(order);
        Order order1 = new Order();
        loader.loadFromJson(new File("src/hw6/order.json"), order1);
        System.out.println(order1);
    }
}