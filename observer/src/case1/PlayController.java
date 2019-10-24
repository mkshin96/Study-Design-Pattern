package case1;

import java.util.Observable;

public class PlayController extends Observable {

    private boolean play;

    public boolean isPlay() {
        return play;
    }

    public void setPlay(boolean play) {
        this.play = play;
        setChanged();
        notifyObservers();
    }
}
