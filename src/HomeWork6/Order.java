package HomeWork6;

public class Order {

    private String client;
    private String product;
    private int qnt;
    private int price;

    public String getClient() {
        return client;
    }

    public String getProduct() {
        return product;
    }

    public int getQnt() {
        return qnt;
    }

    public int getPrice() {
        return price;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public void setQnt(int qnt) {
        this.qnt = qnt;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Order(){
    }

    public Order(String client, String product, int qnt, int price) {
        this.client = client;
        this.product = product;
        this.qnt = qnt;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Order{" +
                "client=" + client +
                ", product=" + product +
                ", qnt=" + qnt +
                ", price=" + price +
                '}';
    }
}