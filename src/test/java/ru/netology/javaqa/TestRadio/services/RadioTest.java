package ru.netology.javaqa.TestRadio.services;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
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
    public void testSetCurrentStation_ValidStation() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(5);
        assertEquals(5, radio.getCurrentStation());
    }

    @Test
    public void testSetCurrentStation_LowerBoundary() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(0);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void testSetCurrentStation_UpperBoundary() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(9);
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void testSetCurrentStation_OutOfBounds() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(10);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void testSetCurrentStation_NegativeStation() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(-5);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void testIncreaseVolume_UpperBoundary() {
        Radio radio = new Radio(10);
        radio.setVolume(100);
        radio.increaseVolume();
        assertEquals(100, radio.getVolume());
    }

    @Test
    public void testDecreaseVolume_LowerBoundary() {
        Radio radio = new Radio(10);
        radio.setVolume(0);
        radio.decreaseVolume();
        assertEquals(0, radio.getVolume());
    }

    @Test
    public void testIncreaseVolume_OutOfBounds() {
        Radio radio = new Radio(10);
        radio.setVolume(110);
        assertEquals(50, radio.getVolume());
    }

    @Test
    public void testDecreaseVolume_OutOfBounds() {
        Radio radio = new Radio(10);
        radio.setVolume(-10);
        assertEquals(50, radio.getVolume());
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
    public void testDecreaseVolume_MinVolume() {
        Radio radio = new Radio();
        radio.setVolume(0);
        radio.decreaseVolume();
        assertEquals(0, radio.getVolume());
    }

    @Test
    public void testNextStation() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(7);
        radio.nextStation();
        assertEquals(8, radio.getCurrentStation());
    }

    @Test
    public void testNextStation_Rollover() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(9);
        radio.nextStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void testPrevStation() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(3);
        radio.prevStation();
        assertEquals(2, radio.getCurrentStation());
    }

    @Test
    public void testPrevStation_Rollover() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(0);
        radio.prevStation();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void testSetStationWithTwentyStations() {
        Radio radio = new Radio(20);
        radio.setCurrentStation(15);

        assertEquals(0, radio.getCurrentStation());
    }
}




