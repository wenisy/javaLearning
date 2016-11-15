package helloWorldTest;

import com.thoughtworks.helloWorld.Parking;
import org.junit.Test;

import java.util.Objects;

import static junit.framework.TestCase.assertTrue;

public class ParkingTest {
    private Parking pk = new Parking();
    @Test
    public void shouldParkCar(){
        assertTrue(Objects.equals(Parking.carCounts, pk.parkCars()));
        System.out.println(Parking.totalCounts);
    }
}
