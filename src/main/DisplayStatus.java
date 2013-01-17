public enum DisplayStatus {
    STOPPED("The car is down"),
    STARTED("The car is started"),
    GEARED("The car is geared"),
    MOVING("The car is moving"),
    FIRED("The car is fired");

    private final String displayStatus;

    DisplayStatus(String displayStatus) {
        this.displayStatus = displayStatus;
    }

    @Override
    public String toString() {
        return displayStatus;
    }
}
