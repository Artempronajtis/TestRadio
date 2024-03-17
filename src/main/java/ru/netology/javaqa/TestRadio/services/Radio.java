package ru.netology.javaqa.TestRadio.services;

public class Radio {

    private int currentStation;
    private int stationLimit;
    private int volume;

    public Radio() {
        this.stationLimit = 20;
    }

    public Radio(int stationLimit) {
        this.stationLimit = stationLimit;
    }


    public int getCurrentStation() {
        return currentStation;
    }

    public int setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < stationLimit) {
            if (newCurrentStation >= 0) {
                this.currentStation = newCurrentStation;
            }
        }
        return this.currentStation;
    }

    public void nextStation() {
        if (currentStation == stationLimit - 1) {
            currentStation = 0;
        } else {
            currentStation++;
        }
    }


    public void prevStation() {
        if (currentStation == 0) {
            currentStation = stationLimit - 1;
        } else {
            currentStation--;
        }
    }

    public int getCurrentVolume() {
        return volume;
    }

    public void IncreaseVolume() {
        if (volume < 100) {
            volume++;
        }
    }

    public void DecreaseVolume() {
        if (volume > 0) {
            volume--;
        }
    }

}








