import org.hamcrest.core.Is;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertThat;

public class CarTest {
    private Car car;

    @Before
    public void setUp() throws Exception {
        car = new Car();
    }

    @Test
    public void shouldPrintDownWhenCarIsStop() {
        assertThat(car.display(), Is.is("The car is down"));
    }

    @Test
    public void shouldPrintDownWhenCarIsStopAndFire(){
        car.fire();
        assertThat(car.display(),Is.is("The car is down"));
    }

    @Test
    public void shouldPrintDownWhenCarIsStopAndGear () {
        car.gear();
        assertThat(car.display(), Is.is("The car is down"));
    }


    @Test
    public void shouldPrintStartedWhenCarIsStarted() throws Exception {
        car.start();
        assertThat(car.display(), Is.is("The car is started"));
    }

    @Test
    public void shouldPrintGearedWhenCarIsStartedAndGeared() throws Exception {
        car.start();
        car.gear();
        assertThat(car.display(), Is.is("The car is geared"));
    }

    @Test
    public void shouldPrintFiredWhenCarIsStartedAndFired() throws Exception {
        car.start();
        car.fire();
        assertThat(car.display(), Is.is("The car is fired"));
    }

    @Test
    public void shouldPrintMovingWhenCarIsStartedAndGearedAndFired() throws Exception {
        car.start();
        car.fire();
        car.gear();
        assertThat(car.display(), Is.is("The car is moving"));
    }
}
