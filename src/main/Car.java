public class Car {
    private Status status;

    public Car(Status status) {
        this.status = status;
    }

    public String displayStatus() {
        return status.getStatus().toString();
    }

    public void fire() {
        status = status.fire();
    }

    public void gear() {
        status = status.gear();
    }

    public void start() {
        status = status.start();
    }
}

