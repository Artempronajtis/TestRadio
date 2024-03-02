package ru.netology.javaqa.TestRadio.services;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    @Test
    public void testDefaultConstructor() {
        Radio radio = new Radio();
        assertEquals(10, radio.getMaxStations());
        assertEquals(0, radio.getCurrentStation());
        assertEquals(50, radio.getVolume());
    }

    @Test
    public void testCustomConstructor() {
        Radio radio = new Radio(20);
        assertEquals(20, radio.getMaxStations());
        assertEquals(0, radio.getCurrentStation());
        assertEquals(50, radio.getVolume());
    }

    @Test
    public void testSetCurrentStationInRange() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        assertEquals(5, radio.getCurrentStation());
    }

    @Test
    public void testSetCurrentStationAboveRange() {
        Radio radio = new Radio();
        radio.setCurrentStation(15);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void testSetCurrentStationBelowRange() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void testNextStationFromMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.nextStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void testPrevStationFromZero() {
        Radio radio = new Radio();
        radio.prevStation();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void testPrevStationFromMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.prevStation();
        assertEquals(8, radio.getCurrentStation());
    }

    @Test
    public void testNextStationFromZero() {
        Radio radio = new Radio();
        radio.nextStation();
        assertEquals(1, radio.getCurrentStation());
    }

    @Test
    public void testVolumeIncrease() {
        Radio radio = new Radio();
        for (int i = 0; i < 60; i++) {
            radio.increaseVolume();
        }
        assertEquals(100, radio.getVolume());
    }

    @Test
    public void testVolumeDecrease() {
        Radio radio = new Radio();
        for (int i = 0; i < 60; i++) {
            radio.decreaseVolume();
        }
        assertEquals(0, radio.getVolume());
    }

    @Test
    public void testVolumeIncreaseToMax() {
        Radio radio = new Radio();
        radio.setVolume(100);
        radio.increaseVolume();
        assertEquals(100, radio.getVolume());
    }

    @Test
    public void testVolumeDecreaseToMin() {
        Radio radio = new Radio();
        radio.setVolume(0);
        radio.decreaseVolume();
        assertEquals(0, radio.getVolume());
    }

    @Test
    public void testSetVolumeInRange() {
        Radio radio = new Radio();
        radio.setVolume(50);
        assertEquals(50, radio.getVolume());
    }

    @Test
    public void testSetVolumeBelowRange() {
        Radio radio = new Radio();
        radio.setVolume(-10);
        assertEquals(50, radio.getVolume());
    }

    @Test
    public void testSetVolumeAboveRange() {
        Radio radio = new Radio();
        radio.setVolume(110);
        assertEquals(50, radio.getVolume());
    }
}