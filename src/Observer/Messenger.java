package Observer;

import java.util.ArrayList;
import java.util.List;

class Messenger {
    private List<Observer> observers = new ArrayList<>();

    // Додавання спостерігача до системи
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    // Видалення спостерігача з системи
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    // Надсилання повідомлення всім спостерігачам
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    // Відправлення повідомлення всім користувачам
    public void sendMessageToAll(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    // Відправлення спеціального повідомлення
    public void sendSpecialMessage(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    // Метод для отримання списку спостерігачів
    public List<Observer> getObservers() {
        return observers;
    }
}
