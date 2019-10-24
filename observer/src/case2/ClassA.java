package case2;

public class ClassA implements Observer {
    private Publisher publisher;
    private boolean aPlay;

    public ClassA(Publisher publisher) {
        this.publisher = publisher;
        publisher.addObserver(this);
    }

    @Override
    public void update(boolean play) {
        this.aPlay = play;
        myActControl();
    }

    private void myActControl() {
        if (this.aPlay) {
            System.out.println("ClassA 실행");
        }
        else {
            System.out.println("ClassA 중지");
        }
    }
}
