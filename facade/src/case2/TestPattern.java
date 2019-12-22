package case2;

public class TestPattern {
    public static void main(String[] args) {
        Computer computer = new Computer();
        Radio radio = new Radio();
        Light light = new Light();

        //이전 방식
        //집에 들어올 때 동작
        computer.turnOn();
        light.turnOn();
        radio.turnOn();

        //집에서 나갈 때 동작
        computer.turnOff();
        light.turnOff();
        radio.turnOff();

        System.out.println("==============파사드 패턴 적용 후 동작==============");

        //집에 들어올 때 동작
        HomeFacade homeFacade = new HomeFacade(computer, light, radio);
        homeFacade.homeIn();

        //집에서 나갈 때 동작
        homeFacade.homeOut();
    }
}
