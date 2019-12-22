package step3;

public class Cook extends IAction{

    public Cook(IRobot iRobot) {
        super(iRobot);
    }

    //행동 추가
    public void doCook() {
        System.out.println("do cook");
    }
}
