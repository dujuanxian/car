public class StartedStatus extends Status {
    public StartedStatus() {
        status = DisplayStatus.STARTED;
    }

    public Status fire() {
        return new FiredStatus();
    }

    public Status gear() {
        return new GearedStatus();
    }

    public Status start() {
        return this;
    }
}
