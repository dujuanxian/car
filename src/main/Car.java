public class Car {
    public static String MOVING = "The car is moving";
    private static String GEARED = "The car is geared";
    private static String STARTED = "The car is started";
    private static String DOWN = "The car is down";
    private static String FIRED = "The car is fired";
    private String status;

    public Car() {
        status = DOWN;
    }

    public String display() {
        return status;
    }

    public void fire() {
        if (status.equals(STARTED)){
            status = FIRED;
        }
    }

    public void gear() {
        if (status.equals(STARTED)) {
            status = GEARED;
        } else if (status.equals(FIRED)) {
            status = MOVING;
        }
    }

    public void start() {
        status = STARTED;
    }
}
