package HomeWork4;

public abstract class Fruit {

    private final String name;
    private final float weight;

    public float getWeight() { return weight; }

    public String getName() { return name; }

    public Fruit(float weight, String name) {
        this.weight = weight;
        this.name = name;
    }
}