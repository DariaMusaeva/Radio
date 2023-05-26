package ru.netology.radio;

public class Radio {
    public int currentStation;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            currentStation = 9;
        }
        else{
            currentStation = newCurrentStation;
        }
        if (newCurrentStation > 9) {
            currentStation = 0;
        }
        else{
            currentStation = newCurrentStation;
        }
    }

    public void nextStation() {
        currentStation = currentStation + 1;
    }

    public void prevStation() {
        currentStation = currentStation - 1;
    }
}
