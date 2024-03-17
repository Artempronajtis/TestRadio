package ru.netology.javaqa.TestRadio.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void setCurrentStationRegularFlow() {
        Radio radio = new Radio();

        radio.setCurrentStation(8);
        radio.setCurrentStation(15);
        int actual = radio.getCurrentStation();
        int expected = 15;


        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void setCurrentStationUnderMinimum() {
        Radio radio = new Radio();

        radio.setCurrentStation(8);
        radio.setCurrentStation(-15);
        int actual = radio.getCurrentStation();
        int expected = 8;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStation() {
        Radio radio = new Radio();


        radio.setCurrentStation(8);
        radio.nextStation();
        int actual = radio.getCurrentStation();
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStation2() {
        Radio radio = new Radio(20);


        radio.setCurrentStation(19);
        radio.nextStation();
        int actual = radio.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void PrevStation() {
        Radio radio = new Radio();


        radio.setCurrentStation(8);
        radio.prevStation();
        int actual = radio.getCurrentStation();
        int expected = 7;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void PrevStation2() {
        Radio radio = new Radio(20);


        radio.setCurrentStation(0);
        radio.prevStation();
        int actual = radio.getCurrentStation();
        int expected = 19;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void IncreaseVolume1() {
        Radio radio = new Radio();

        for (int i = 0; i < 3; i++) {
            radio.IncreaseVolume();

        }
        int actual = radio.getCurrentVolume();
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void IncreaseVolume2() {
        Radio radio = new Radio();

        for (int i = 0; i < 300; i++) {
            radio.IncreaseVolume();

        }
        int actual = radio.getCurrentVolume();
        int expected = 100;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void DecreaseVolume1() {
        Radio radio = new Radio();

        for (int i = 0; i < 3; i++) {
            radio.DecreaseVolume();

        }
        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void DecreaseVolume2() {
        Radio radio = new Radio();

        for (int i = 0; i < 50; i++) {
            radio.IncreaseVolume();

        }
        for (int i = 0; i < 10; i++) {
            radio.DecreaseVolume();

        }
        int actual = radio.getCurrentVolume();
        int expected = 40;

        Assertions.assertEquals(expected, actual);
    }


}




