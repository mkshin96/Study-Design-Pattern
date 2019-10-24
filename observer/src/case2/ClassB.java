package case2;

public class ClassB implements Observer {
    private Publisher publisher;
    private boolean bPlay;

    public ClassB(Publisher publisher) {
        this.publisher = publisher;
        publisher.addObserver(this);
    }

    @Override
    public void update(boolean play) {
        this.bPlay = play;
        myActControl();
    }

    private void myActControl() {
        if (this.bPlay) {
            System.out.println("ClassB 실행");
        }
        else {
            System.out.println("ClassB 중지");
        }
    }
}
