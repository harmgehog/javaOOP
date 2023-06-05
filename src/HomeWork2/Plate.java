package HomeWork2;

public class Plate {
    private int food;
    public Plate(int food) { this.food = food; }

    public int getFood() { return food; }

    public void setFood(int appetite) {
        if (food >= appetite) this.food = food - appetite;
        else this.food = 0;
    }

    public void info() { System.out.println("На тарелке еды: " + food); }

    void addFood(int foood) { this.food += foood; }
}