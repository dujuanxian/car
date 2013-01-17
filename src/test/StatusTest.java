import org.hamcrest.core.Is;
import org.junit.Test;

import static org.junit.Assert.assertThat;

public class StatusTest {
    private Status status;

    @Test
    public void shouldReturnStoppedStatusAfterGearForStoppedStatus () {
        status = new StoppedStatus();
        status = status.gear();
        assertThat(status.getStatus(), Is.is(DisplayStatus.STOPPED));
    }

    @Test
    public void shouldReturnStartedStatusAfterStartForStoppedStatus () {
        status = new StoppedStatus();
        status = status.start();
        assertThat(status.getStatus(), Is.is(DisplayStatus.STARTED));
    }

    @Test
    public void shouldReturnGearedStatusAfterGearForStartedStatus () {
        status = new StartedStatus();
        status = status.gear();
        assertThat(status.getStatus(), Is.is(DisplayStatus.GEARED));
    }

    @Test
    public void shouldReturnMovingStatusAfterGearForFiredStatus () {
        status = new FiredStatus();
        status = status.gear();
        assertThat(status.getStatus(), Is.is(DisplayStatus.MOVING));
    }


}
