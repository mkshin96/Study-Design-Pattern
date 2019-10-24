package case2;

public interface Publisher {
    void addObserver(Observer observer);
    void deleteObserver(Observer observer);
    void notifyObservers();
}
