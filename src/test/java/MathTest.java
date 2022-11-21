import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MathTest {
    @Test
    void ShouldDoMath() {

        double moteghayer = -1.5;

        double meghdarMotlagh = Math.abs(moteghayer);

        Assertions.assertEquals(1.5,meghdarMotlagh);
    }
}
