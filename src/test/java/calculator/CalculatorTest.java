package calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    @Test
    void mustُُSumimingUpTwoNumbers() {
        Calculator calculator = new Calculator();

        String haselJamDoAdadad = Calculator.add("5.3" , "-2");

        assertEquals("3.3",haselJamDoAdadad);
    }
}
