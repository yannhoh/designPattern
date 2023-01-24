package ch.yannickhohler.depa.command.example.third_party_classes;

public class CeilingFan {

    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    String location;    // State
    int speed;          // State

    public CeilingFan(String location) {
        this.location = location;
        speed = OFF;
    }

    public void high() {
        speed = HIGH;
        System.out.println("FAN is HIGH");
    }

    public void medium() {
        speed = MEDIUM;
        System.out.println("FAN is MEDIUM");
    }

    public void low() {
        speed = LOW;
        System.out.println("FAN is LOW");
    }

    public void off() {
        speed = OFF;
        System.out.println("FAN is OFF");
    }

    public int getSpeed() {
        return speed;
    }
}
