public class FiredStatus extends Status {
    public FiredStatus() {
        status = DisplayStatus.FIRED;
    }

    public Status fire() {
        return this;
    }

    public Status gear() {
        return new MovingStatus();
    }

    public Status start() {
        return null;
    }
}
