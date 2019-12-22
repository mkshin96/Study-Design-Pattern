package case2;

public class Light {
    private boolean turnedOn = false;

    public void turnOn() {
        turnedOn = true;
        System.out.println("불을 켬");
    }

    public void turnOff() {
        turnedOn = false;
        System.out.println("불을 끔");
    }

    public boolean isTurnedOn() {
        return turnedOn;
    }
}
