package ru.netology.javaqa.TestRadio.services;

public class Radio {
    private int currentStation;
    private int maxStations;
    private int volume;


    public Radio(int maxStations) {
        int countStations = 10;
        this.maxStations = countStations - 1;
        this.currentStation = 0;
        this.volume = 50;
    }


    public Radio() {
        this(10);
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int station) {
        if (station >= 0 && station <= maxStations) {
            this.currentStation = station;
        } else {
            System.out.println("Недопустимый номер радиостанции");
        }
    }

    public int getMaxStations() {
        return maxStations + 1;
    }

    public int getVolume() {
        return volume;
    }

    public void increaseVolume() {
        if (volume < 100) {
            volume++;
        }
    }

    public void decreaseVolume() {
        if (volume > 0) {
            volume--;
        }
    }

    public void nextStation() {
        if (currentStation == maxStations) {
            currentStation = 0;
        } else {
            currentStation++;
        }
    }

    public void prevStation() {
        if (currentStation == 0) {
            currentStation = maxStations;
        } else {
            currentStation--;
        }
    }

    public void setVolume(int volumeLevel) {
        if (volumeLevel >= 0 && volumeLevel <= 100) {
            this.volume = volumeLevel;
        } else {
            System.out.println("Недопустимое значение громкости");
        }
    }


}




