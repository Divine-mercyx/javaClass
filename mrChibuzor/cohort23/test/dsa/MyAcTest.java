package dsa;


import org.junit.Test;

import static org.junit.Assert.*;


public class MyAcTest {

    @Test
    public void testThatAcExists() {
        AirCondition ac = new AirCondition();
        ac.turnOn();
        assertTrue(ac.isOn());
    }


    @Test
    public void testAirConditionIfItsOff() {
        AirCondition ac = new AirCondition();
        ac.turnOff();
        assertFalse(ac.isOn());
    }


    @Test
    public void increaseTEmperatureOfAcTest() {
        AirCondition ac = new AirCondition();
        ac.turnOn();
        ac.increase(2);
        int temp = ac.getTemperature();
        int expected = 18;
        assertEquals(temp, expected);
        ac.increase(0);
        int temp2 = ac.getTemperature();
        int expected2 = 18;
        assertEquals(temp2, expected2);
        ac.increase(-5);
        int temp3 = ac.getTemperature();
        int expected3 = 18;
        assertEquals(temp3, expected3);
    }

    @Test
    public void decreaseTEmperatureOfAcTest() {
        AirCondition ac = new AirCondition();
        ac.turnOn();
        ac.increase(2);
        ac.decrease(1);
        int temp = ac.getTemperature();
        int expected = 17;
        assertEquals(temp, expected);
        ac.decrease(-5);
        int temp2 = ac.getTemperature();
        int expected2 = 17;
        assertEquals(temp2, expected2);
    }


    @Test
    public void increaseAcBeyond30Test() {
        AirCondition ac = new AirCondition();
        ac.turnOn();
        ac.increase(15);
        int temp = ac.getTemperature();
        int expected = 30;
        assertEquals(temp, expected);
    }

    @Test
    public void decreaseAcBeyond30Test() {
        AirCondition ac = new AirCondition();
        ac.turnOn();
        ac.decrease(1);
        int temp = ac.getTemperature();
        int expected = 16;
        assertEquals(temp, expected);
    }




    
}
