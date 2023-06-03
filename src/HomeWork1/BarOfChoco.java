package HomeWork1;

public class BarOfChoco extends Product {
    private double cacao;
    private double sugar;
    private String chocoType;

    public BarOfChoco(String name, String brand, double price, double cacao, double sugar, String chocoType) {
        super(name, brand, price);
        this.cacao = cacao;
        this.sugar = sugar;
        checkChocoType(chocoType);
    }

    public double getCacao() {return cacao;}

    public void setCacao(double cacao) {this.cacao = cacao;}

    public double getSugar() {return sugar;}

    public void setSugar(double sugar) {this.sugar = sugar;}

    public String getChocoType() {return chocoType;}

    public void setChocoType(String chocoType) {checkChocoType(chocoType);}

    protected void checkChocoType(String chocolateType) {
        if (chocolateType.equalsIgnoreCase("white") ||
                chocolateType.equalsIgnoreCase("black") ||
                chocolateType.equalsIgnoreCase("milk")) {
            this.chocoType = chocolateType.toLowerCase();
        } else this.chocoType = "undefined";
    }

    @Override
    public String toString() {
        return String.format("{Шоколад} %s - %s - %f - %s - Какао: %f - Сахар: %f", name, brand, price, chocoType, cacao, sugar);
    }

    @Override
    public int hashCode() {
        return super.hashCode() + chocoType.hashCode() * 7 + (int) cacao * 11 + (int) sugar * 13;
    }
}