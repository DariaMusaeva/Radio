package ru.netology.radio;

public class Radio {

    public int maxStation;
    public int minStation = 0;
    public int currentStation = minStation;
    public int defaultSize = 10;

    public Radio() {
    }

    public Radio(int size) {
       maxStation = minStation + size - 1;
    }

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

    public int maxVolume = 100;
    public int minVolume = 0;
    public int currentVolume = minVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
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