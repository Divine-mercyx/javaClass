package myBike;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BikeTest {
    private Bike bike;

    @BeforeEach
    public void setUp() {
        bike = new Bike();
    }

    @Test
    public void onBike_offBike_checkStatus_testBike() {
        bike.turnOn();
        assertTrue(bike.onStatus());
        bike.turnOff();
        assertFalse(bike.onStatus());
    }


    @Test
    public void offBike_onBike_accelerateBike_testBike() {
        bike.accelerate();
        assertEquals("bike is off", bike.getSpeed());
        bike.turnOn();
        assertEquals("0", bike.getSpeed());
        bike.turnOff();
        assertEquals("bike is off", bike.getSpeed());
        bike.turnOn();
        bike.accelerate();
        bike.accelerate();
        assertEquals("2", bike.getSpeed());
    }


    @Test
    public void onBike_accelerate_useGearOne_useGearTwo_testBike() {
        bike.turnOn();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        assertEquals("4", bike.getSpeed());
        bike.accelerate();
        assertEquals("7", bike.getSpeed());
        bike.accelerate();
        assertEquals("9", bike.getSpeed());
        bike.accelerate();
        assertEquals("12", bike.getSpeed());
    }


    @Test
    public void onBike_accelerate_deccelerate_testBike() {
        bike.turnOn();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.deccelerate();
        assertEquals("8", bike.getSpeed());
        bike.deccelerate();
        bike.deccelerate();
        assertEquals("3", bike.getSpeed());
    }
}