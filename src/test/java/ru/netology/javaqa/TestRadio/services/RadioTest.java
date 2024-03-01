package ru.netology.javaqa.TestRadio.services;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {
    @Test
    public void testDefaultConstructor() {
        Radio radio = new Radio();
        assertEquals(10, radio.getMaxStations());
    }

    @Test
    public void testCustomConstructor() {
        Radio radio = new Radio(20);
        assertEquals(20, radio.getMaxStations());
    }

    @Test
    public void testSetValidStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        assertEquals(5, radio.getCurrentStation());
    }

    @Test
    public void testSetInvalidStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(15);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void testNextStation() {
        Radio radio = new Radio();
        radio.nextStation();
        assertEquals(1, radio.getCurrentStation());
    }

    @Test
    public void testNextStationWrapAround() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.nextStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void testPrevStation() {
        Radio radio = new Radio();
        radio.prevStation();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void testPrevStationWrapAround() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prevStation();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void testIncreaseVolume() {
        Radio radio = new Radio();
        radio.increaseVolume();
        assertEquals(51, radio.getVolume());
    }

    @Test
    public void testDecreaseVolume() {
        Radio radio = new Radio();
        radio.decreaseVolume();
        assertEquals(49, radio.getVolume());
    }

    @Test
    public void testVolumeMax() {
        Radio radio = new Radio();
        for (int i = 0; i < 60; i++) {
            radio.increaseVolume();
        }
        assertEquals(100, radio.getVolume());
    }

    @Test
    public void testVolumeMin() {
        Radio radio = new Radio();
        for (int i = 0; i < 60; i++) {
            radio.decreaseVolume();
        }
        assertEquals(0, radio.getVolume());
    }

    @Test
    public void testPrevStationFromNonZero() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.prevStation();
        assertEquals(4, radio.getCurrentStation());
    }

    @Test
    public void testPrevStationFromOne() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        radio.prevStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void testSetInvalidStationBelowRange() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        assertEquals(0, radio.getCurrentStation());
    }
}
