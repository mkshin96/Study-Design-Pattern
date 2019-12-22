package step4;

public class Cook extends IAction {

    public Cook(IRobot iRobot) {
        super(iRobot);
    }

    public void doCook() {
        System.out.println("do cook");
    }
}
