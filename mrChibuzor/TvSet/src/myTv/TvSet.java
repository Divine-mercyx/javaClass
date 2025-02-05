package myTv;

public class TvSet {
    private boolean isOn;
    private int volume;
    private int previousVolume;
    private int channel = 1;

    public boolean status() {
        return isOn;
    }

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    public Object getVolume() {
        if (isOn) return volume;
        return null;
    }

    public void increaseUp() {
        if (volume >= 0 && volume < 10 && isOn) volume++;
    }

    public void decreaseDown() {
        if (volume > 0 && volume <= 10 && isOn) volume--;
    }

    public void mute() {
        if (isOn) {
            previousVolume = volume;
            volume = 0;
        }
    }

    public void unmute() {
        if (isOn) volume = previousVolume;
    }


    public void changeUp() {
        if (channel >= 1 && channel < 50 && isOn) channel++;
    }

    public void changeDown() {
        if (channel > 1 && channel <= 50 && isOn) channel++;
    }

    public int getChannel() {
        return channel;
    }
}
