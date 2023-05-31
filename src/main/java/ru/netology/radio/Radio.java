package ru.netology.radio;

public class Radio {

    private int maxStation;
    private int minStation = 0;
    private int currentStation = minStation;
    private int defaultSize = 10;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume = minVolume;

    public int getDefaultSize() {
        return maxStation = defaultSize - 1;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public Radio() {
    }

    public Radio(int size) {
       maxStation = minStation + size - 1;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation >= maxStation) {
            currentStation = minStation;
        } else if (newCurrentStation < minStation) {
            currentStation = maxStation;
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
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            newCurrentVolume = maxVolume;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume () {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }
}