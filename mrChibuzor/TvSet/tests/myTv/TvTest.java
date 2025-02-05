package myTv;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TvTest {
    TvSet tv;

    @BeforeEach
    public void setUp() {
        tv = new TvSet();
    }

    @Test
    public void testTvClassExists_checkStatusIsFalse_testTvSet() {
        assertFalse(tv.status());
    }

    @Test
    public void turnOn_checkStatus_testTvSet() {
        tv.turnOn();
        assertTrue(tv.status());
    }

    @Test
    public void turnOn_turnOff_checkStatus_testTvSet() {
        tv.turnOn();
        tv.turnOff();
        assertFalse(tv.status());
    }

    @Test
    public void turnTvOn_checkVolumeStatus_testTvSet() {
        tv.turnOn();
        assertEquals(0, tv.getVolume());
    }

    @Test
    public void testToGetVolume_whenTvIsOff_testTvSet() {
        assertEquals(null, tv.getVolume());
        tv.turnOn();
        assertEquals(0, tv.getVolume());
    }

    @Test
    public void turnOn_increaseVolume_testTvSet() {
        tv.turnOn();
        tv.increaseUp();
        tv.increaseUp();
        assertEquals(2, tv.getVolume());
        tv.increaseUp();
        tv.increaseUp();
        assertEquals(4, tv.getVolume());
    }

    @Test
    public void turnOff_increaseVolume_testTvSet() {
        tv.increaseUp();
        tv.increaseUp();
        tv.turnOn();
        assertEquals(0, tv.getVolume());
    }

    @Test
    public void turnOn_increaseVolume_testToINcreaseOverTen_testTvSet() {
        tv.turnOn();
        tv.increaseUp();
        tv.increaseUp();
        tv.increaseUp();
        tv.increaseUp();
        tv.increaseUp();
        tv.increaseUp();
        tv.increaseUp();
        tv.increaseUp();
        tv.increaseUp();
        tv.increaseUp();
        tv.increaseUp();
        tv.increaseUp();
        assertEquals(10, tv.getVolume());
    }

    @Test
    public void turnOn_decreaseVolume_testTvSet() {
        tv.turnOn();
        tv.increaseUp();
        tv.increaseUp();
        tv.decreaseDown();
        assertEquals(1, tv.getVolume());
    }

    @Test
    public void turnOn_increaseVolume_turnOff_decreaseVolume_testTvSet() {
        tv.turnOn();
        tv.increaseUp();
        tv.increaseUp();
        tv.turnOff();
        tv.decreaseDown();
        tv.turnOn();
        assertEquals(2, tv.getVolume());
    }

    @Test
    public void turnOn_increaseVolumeTwice_decreaseVolumeThrice_testTvSet() {
        tv.turnOn();
        tv.increaseUp();
        tv.increaseUp();
        tv.decreaseDown();
        tv.decreaseDown();
        assertEquals(0, tv.getVolume());
        tv.decreaseDown();
        assertEquals(0, tv.getVolume());
    }

    @Test
    public void turnOn_muteTv_testTvSet() {
        tv.turnOn();
        tv.mute();
        assertEquals(0, tv.getVolume());
    }

    @Test
    public void turnOn_increaseVolumeTwice_muteTv_testTvSetVolumeWillBeZero() {
        tv.turnOn();
        tv.increaseUp();
        tv.increaseUp();
        tv.mute();
        assertEquals(0, tv.getVolume());
    }

    @Test
    public void turnOn_increaseVolumeTwice_muteTv_testVolume_unmute_testVolume() {
        tv.turnOn();
        tv.increaseUp();
        tv.increaseUp();
        tv.mute();
        assertEquals(0, tv.getVolume());
        tv.unmute();
        assertEquals(2, tv.getVolume());
    }

    @Test
    public void turnOn_increaseVolumeTwice_turnOff_tryToMuteTv_testTvSet() {
        tv.turnOn();
        tv.increaseUp();
        tv.increaseUp();
        tv.turnOff();
        tv.mute();
        tv.turnOn();
        assertEquals(2, tv.getVolume());
    }

    @Test
    public void turnOn_changeChannelUp_testTvSet() {
        tv.turnOn();
        tv.changeUp();
        assertEquals(2, tv.getChannel());
    }

    @Test
    public void turnOn_changeChannelTwice_testTvSet() {
        tv.turnOn();
        tv.changeUp();
        tv.changeUp();
        assertEquals(3, tv.getChannel());
    }

    @Test
    public void dontTurnOn_changeChannelTwice_turnOn_testTvSet() {
        tv.changeUp();
        tv.changeUp();
        tv.turnOn();
        assertEquals(1, tv.getChannel());
    }

}