package step2;

public class RobotModel1 implements IRobot {

    @Override
    public void powerOn() {
        System.out.println("type1 : power on");
    }

    @Override
    public void powerOff() {
        System.out.println("type1 : power off");
    }

    //행동 추가
    @Override
    public void doCook() {
        System.out.println("do cook");
    }
}
