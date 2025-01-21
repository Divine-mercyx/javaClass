package dsa;

public class AirCondition {
    private boolean isOn;
    private int temperature = 16;

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    public boolean isOn() {
        return isOn;
    }

    public void increase(int number) {
        if (isOn) {
            if (number > 0) {
                temperature += number;
            }
            if (temperature > 30) temperature = 30;
        }
    }

    public int getTemperature() {
        return temperature;
    }

    public void decrease(int i) {
        if (isOn) {
            if (i > 0) {
                temperature -= i;
            }
            if (temperature < 16) temperature = 16;
        }
    }
}