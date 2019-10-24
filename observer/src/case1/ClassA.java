package case1;

import java.util.Observable;
import java.util.Observer;

public class ClassA implements Observer {

    private Observable observable;
    private boolean aPlay;

    public ClassA(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof PlayController) {
            PlayController controller = (PlayController) o;
            this.aPlay = controller.isPlay();
            myActControl();
        }
    }

    private void myActControl() {
        if (aPlay) {
            System.out.println("ClassA 실행");
        }
        else {
            System.out.println("ClassA 중지");
        }
    }
}
