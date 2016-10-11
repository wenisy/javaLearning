package helloWorldTest;

import com.thoughtworks.helloWorld.CalculateLength;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class CalculateLengthTest {
    CalculateLength cl = new CalculateLength();

    @Test
    public void convertMeterToMillimeter() {
        assertTrue(1000.0 == cl.convertUnit("1m"));
    }

    @Test
    public void convertCMToMillimeter() {
        assertTrue(56.0 == cl.convertUnit("5.6cm"));
    }

    @Test
    public void convertMMToMillimeter() {
        assertTrue(37.3 == cl.convertUnit("37.3mm"));
    }
}
