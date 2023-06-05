package HomeWork2;

public class Cat {
    private String name;
    private int appetite;
    private boolean fullness;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
// Задание 2. Добавил коту поле сытость зависимое от его аппетита. Задание 2
        this.fullness = appetite <= 0;
    }

    public String getName() { return name; }

    public int getAppetite() { return appetite; }

    public void setAppetite(int appetite) { this.appetite = appetite; }

    public boolean getFullness() { return fullness; }

    public void setFullness(boolean fullness) { this.fullness = fullness; }

    public void eat(int food) {
// Задание 1. еды не достаточно
        if (food > appetite) {
            System.out.println(getName() + " съел еду и теперь сыт!");
            this.appetite = 0;
            this.fullness = true;
        } else {
            System.out.println("Еды оказалось недостаточно для " + getName() + "! кот не наелся!");
            setAppetite(appetite - food);
            System.out.println("Оставшийся аппетит: " + getAppetite());
        }
    }
}