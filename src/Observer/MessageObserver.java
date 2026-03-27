package Observer;

import java.util.ArrayList;
import java.util.List;

class MessageObserver implements Observer {
    private String name;
    private List<String> messagesReceived;

    public MessageObserver(String name) {
        this.name = name;
        this.messagesReceived = new ArrayList<>();
    }

    @Override
    public void update(String message) {
        System.out.println(name + " отримав(ла) нове повідомлення: " + message);
        messagesReceived.add(message);
    }

    public List<String> getMessageReceived() {
        return messagesReceived;
    }
}
