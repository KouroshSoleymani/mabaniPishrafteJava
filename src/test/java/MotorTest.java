import khodro.Khodro;
import khodro.Motor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MotorTest {
    @Test
    void moveWhenItsOn() {
        Khodro motor = new Motor();

        motor.roshan();

        boolean isMoving = motor.IsMoving();

        Assertions.assertTrue(isMoving);
    }
}
