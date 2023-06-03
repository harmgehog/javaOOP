package HomeWork1;

public class BottleOfMilk extends Product{
    private double volume;

    private double fat;

    public BottleOfMilk(String name, String brand, double price, double volume, double fat) {
        super(name, brand, price);
        this.volume = volume;
        this.fat = fat;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getFat() {
        return fat;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }

    @Override
    public String toString() {
        return String.format("{Бутылка} %s - %s - %f - %f - %f", name, brand, price, volume, fat);
    }
}