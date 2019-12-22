package case2;

public class HomeFacade {
    private Computer computer;
    private Light light;
    private Radio radio;

    public HomeFacade(Computer computer, Light light, Radio radio) {
        this.computer = computer;
        this.light = light;
        this.radio = radio;
    }

    public void homeIn() {
        System.out.println("집에 오면 컴퓨터, 라디오, 불을 켜기");
        if (!computer.isTurnedOn()) {
            computer.turnOn();
        }

        if (!light.isTurnedOn()) {
            light.turnOn();
        }

        if (!radio.isTurnedOn()) {
            radio.turnOn();
        }
    }

    public void homeOut() {
        System.out.println("외출하면 컴퓨터, 라디오, 불을 끄기");
        if (computer.isTurnedOn()) {
            computer.turnOff();
        }

        if (light.isTurnedOn()) {
            light.turnOff();
        }

        if (radio.isTurnedOn()) {
            radio.turnOff();
        }
    }
}
