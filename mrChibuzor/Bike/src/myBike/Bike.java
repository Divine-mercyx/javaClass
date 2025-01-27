package mrChibuzor.Bike.src.myBike;

public class Bike {
    private int speed;
    private boolean isOn;

    public void turnOn() {
        isOn = true;
    }

    public boolean onStatus() {
        return isOn;
    }

    public void turnOff() {
        isOn = false;
    }

    public void accelerate() {
        if (isOn) {
            decideSpeedAdded();
        }
    }

    public String getSpeed() {
        String value = "";
        if (isOn) return value += speed;
        return "bike is off";
    }

    private void decideSpeedAdded() {
        if (speed >= 0 && speed < 4) {
            speed += 1;
        } else if (speed > 4 && speed < 8) {
            speed += 2;
        } else if (speed < 12) {
            speed += 3;
        } else {
            speed += 4;
        }
    }


    public void deccelerate() {
        if (isOn) {
            decideSpeedRemoved();
        }
    }


    private void decideSpeedRemoved() {
        if (speed >= 0 && speed < 4) {
            speed -= 1;
        } else if (speed > 4 && speed < 8) {
            speed -= 2;
        } else if (speed < 12) {
            speed -= 3;
        } else {
            speed -= 4;
        }
    }
}
