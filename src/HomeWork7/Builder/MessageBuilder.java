package HomeWork7.Builder;

public class MessageBuilder {

    private Message message;

    public MessageBuilder() {
        this.message = new Message();
    }
    public Message build(){
        //Проверка при создании

        return message;
    }
    public MessageBuilder setParam1(String param1) {
        message.setParam1(param1);
        return this;
    }

    public MessageBuilder setParam2(String param2) {
        message.setParam2(param2);
        return this;
    }

    public MessageBuilder setParam3(String param3) {
        message.setParam3(param3);
        return this;
    }
}