package step4;

public class Clean extends IAction {

    public Clean(IRobot iRobot) {
        super(iRobot);
    }

    public void doClean() {
        System.out.println("do clean");
    }
}
