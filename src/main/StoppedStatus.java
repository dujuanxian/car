public class StoppedStatus extends Status {
    public StoppedStatus() {
        status = DisplayStatus.STOPPED;
    }

    public Status fire() {
        return new StoppedStatus();
    }

    public Status gear() {
        return new StoppedStatus();
    }

    public Status start() {
        return new StartedStatus();
    }
}
