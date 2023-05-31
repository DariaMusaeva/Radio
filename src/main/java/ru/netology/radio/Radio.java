package ru.netology.radio;

public class Radio {
    private int currentStation;
    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > 9) {
            currentStation = 0;
        } else if (newCurrentStation < 0) {
            currentStation = 9;
        } else {
            currentStation = newCurrentStation;
        }
    }

    public void nextStation() {
        currentStation = currentStation + 1;
        setCurrentStation(currentStation);
    }

    public void prevStation() {
        currentStation = currentStation - 1;
        setCurrentStation(currentStation);
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume () {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}

