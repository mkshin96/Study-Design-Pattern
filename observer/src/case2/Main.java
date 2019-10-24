package case2;

public class Main {
    public static void main(String[] args) {
        PlayController controller = new PlayController();
        Observer classA = new ClassA(controller);
        Observer classB = new ClassB(controller);

        controller.setPlay(true);
        System.out.println("=======");

        controller.setPlay(false);
        System.out.println("=======");

        controller.deleteObserver(classA);
        controller.setPlay(true);
    }
}
