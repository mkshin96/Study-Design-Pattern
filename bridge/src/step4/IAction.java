package step4;

public class IAction {
    private IRobot iRobot;

    public IAction(IRobot iRobot) {
        this.iRobot = iRobot;
    }

    //IRobot의 기능을 전부 똑같이 구현한다.
    void powerOn() {
        iRobot.powerOn();
    }

    void powerOff() {
        iRobot.powerOff();
    }
}
