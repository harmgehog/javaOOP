package HomeWork1;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {
        /**
         * Три плитки шоколада для вендинг машины Станислава Байраковского!
         * Пришлось немного подкорректировать файлы машины и бутылок - онли для красивого вывода.
         *
         * Спасибо за вашу работу! C уважением Иван. Надеюсь задание выполнено ни более и не менее заявленного.
         * */

        Product bar1 = new BarOfChoco("Горький", "Бабаевский", 100, 80, 10, "black");
        Product bar2 = new BarOfChoco("Белый", "Нестле", 200, 0, 10, "white");
        Product bar3 = new BarOfChoco("Молочный", "РиттерСпорт", 300, 40, 10, "milk");


        Product bottleOfWater1 = new BottleOfWater("ООО Чистый источник", "Бутылка с водой [1]", 115, 1);
        Product bottleOfMilk1 = new BottleOfMilk("ООО Чистый источник", "Бутылка с молоком", 115, 1.5, 10);

        List<Product> products = new ArrayList<>();
        products.add(bottleOfWater1);
        products.add(bottleOfMilk1);
        products.add(bar1);
        products.add(bar2);
        products.add(bar3);

        VendingMachine vendingMachine = new VendingMachine(products);

        BottleOfMilk milk1 = vendingMachine.sellMilk(1.5, 10);
        vendingMachine.printReceipt(milk1);

        BarOfChoco barOfChoco1 = vendingMachine.sellChoco("milk");
        vendingMachine.printReceipt(barOfChoco1);
    }

}
