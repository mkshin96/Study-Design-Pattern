package step3;

public class TestPattern {
    public static void main(String[] args) {
        IRobot iRobot = new RobotModel1();
        Cook work = new Cook(iRobot);
        work.powerOn();
        work.doCook();
        work.powerOff();

        System.out.println("==============");

        iRobot = new RobotModel2();
        work = new Cook(iRobot);
        work.powerOn();
        work.doCook();
        work.powerOff();
    }
}
