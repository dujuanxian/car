abstract class Status {
    protected DisplayStatus status;

    protected DisplayStatus getStatus() {
        return status;
    }

    public abstract Status fire();

    public abstract Status gear();

    public abstract Status start();
}
