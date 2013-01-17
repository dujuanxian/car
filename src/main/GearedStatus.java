public class GearedStatus extends Status {
    public GearedStatus() {
        status = DisplayStatus.GEARED;
    }

    public Status fire() {
        return new MovingStatus();
    }

    public Status gear() {
        return this;
    }

    public Status start() {
        return null;
    }
}
