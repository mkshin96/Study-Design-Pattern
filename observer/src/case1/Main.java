package case1;

import java.util.Observable;
import java.util.Observer;

public class Main {
    public static void main(String[] args) {
        PlayController playController = new PlayController();

        Observer classA = new ClassA(playController);
        Observer classB = new ClassB(playController);

        playController.setPlay(true);
        System.out.println("=======");

        playController.setPlay(false);
        System.out.println("=======");

        playController.deleteObserver(classA);
        playController.setPlay(true);
    }
}
