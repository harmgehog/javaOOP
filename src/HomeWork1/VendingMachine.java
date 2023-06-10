package HomeWork1;

import java.util.List;

public class VendingMachine {
    private final List<Product> products;

    public VendingMachine(List<Product> products) {
        this.products = products;
    }

    public BottleOfMilk sellMilk(double volume, double fatContent) {
        for (Product product : products) {
            if (product instanceof BottleOfMilk) {
                if (((BottleOfMilk) product).getVolume() >= volume && ((BottleOfMilk) product).getFat() == fatContent) {
                    return (BottleOfMilk) product;
                }
            }
        }
        return null;
    }

    public BarOfChoco sellChoco(String chocolateType) {
        for (Product product : products) {
            if (product instanceof BarOfChoco) {
                if (((BarOfChoco) product).getChocoType().equalsIgnoreCase(chocolateType)) {
                    return (BarOfChoco) product;
                }
            }
        }
        return null;
    }


    public void printReceipt(Product product) {
        if (product != null) {
            System.out.println("Вы купили: ");
            System.out.println(product);
        } else {
            System.out.println("Товар не найден.");
        }
    }
}