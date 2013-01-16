public class Car {
    private boolean isStarted;
    private boolean isGeared;
    private boolean isFired;
    public static  String MOVING = "The car is moving";
    private static String GEARED = "The car is geared";
    private static String STARTED = "The car is started";
    private static String DOWN = "The car is down";
    private static String FIRED = "The car is fired";

    public Car() {
        isStarted = false;
        isGeared = false;
        isFired = false;
    }

    public String display() {
        if(isFired && isGeared) {
            return MOVING;
        }
        if(isGeared){
            return GEARED;
        }
        if (isFired) {
            return FIRED;
        }
        if(isStarted) {
            return STARTED;
        }
        return DOWN;
    }

    public void fire() {
        if(isStarted){
            isFired = true;
        }
    }

    public void gear() {
        if(isStarted){
            isGeared = true;
        }
    }

    public void start() {
        isStarted = true;
    }
}
