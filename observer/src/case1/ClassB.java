package case1;

import java.util.Observable;
import java.util.Observer;

public class ClassB implements Observer {

    private Observable observable;
    private boolean bPlay;

    public ClassB(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof PlayController) {
            PlayController controller = (PlayController) o;
            this.bPlay = controller.isPlay();
            myActControl();
        }
    }

    private void myActControl() {
        if (bPlay) {
            System.out.println("ClassB 실행");
        }
        else {
            System.out.println("ClassB 중지");
        }
    }
}
