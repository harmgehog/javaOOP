package HomeWork7.Builder;

public class Main {
    public static void main(String[] args) {
        Message message = new MessageBuilder()
                .setParam1("par1")
                .setParam2("par2")
                .setParam3("par3")
                .build();
    }
}