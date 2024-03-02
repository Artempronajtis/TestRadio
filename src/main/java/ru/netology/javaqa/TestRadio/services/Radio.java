package ru.netology.javaqa.TestRadio.services;

public class Radio {
    private int maxStations;
    private int currentStation;
    private int volume;


    public Radio() {
        this(10);
    }

    public Radio(int maxStations) {
        this.maxStations = maxStations;
        this.currentStation = 0;
        this.volume = 50;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int station) {
        if (station >= 0 && station < maxStations) {
            this.currentStation = station;
        } else {
            System.out.println("Недопустимый номер радиостанции");
        }
    }

    public int getMaxStations() {
        return maxStations;
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
        if (currentStation == 9) {
            currentStation = 0;
        } else {
            currentStation++;
        }
    }

    public void prevStation() {
        if (currentStation == 0) {
            currentStation = 9;
        } else {
            currentStation--;
        }
    }

    public void setVolume(int volume) {
        if (volume >= 0 && volume <= 100) {
            this.volume = volume;
        } else {
            System.out.println("Недопустимое значение громкости");
        }
    }


}

