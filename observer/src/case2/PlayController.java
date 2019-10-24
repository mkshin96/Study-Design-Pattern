package case2;

import java.util.ArrayList;
import java.util.List;

public class PlayController implements Publisher {
    List<Observer> observers = new ArrayList<>();
    boolean play;

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer obs : observers) {
            obs.update(play);
        }
    }

    public boolean isPlay() {
        return play;
    }

    public void setPlay(boolean play) {
        this.play = play;
        notifyObservers();
    }
}
