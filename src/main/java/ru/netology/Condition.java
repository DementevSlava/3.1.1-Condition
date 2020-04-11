package ru.netology;

public class Condition {
    private int maxTemperature;
    private int minTemperature;
    private int currentTemperature;

    public void increaseCurrentTemperature() {
        if (currentTemperature == getMaxTemperature()) {
            return;
        }
        this.currentTemperature++;

    }

    public void decreaseCurrentTemperature() {
        if (currentTemperature > minTemperature) {
            this.currentTemperature--;
        }
        if (currentTemperature == minTemperature) {
            return;
        }

    }

    public int getMaxTemperature() {
        return maxTemperature;
    }

    public void setMaxTemperature(int maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    public int getMinTemperature() {
        return minTemperature;
    }

    public void setMinTemperature(int minTemperature) {
        this.minTemperature = minTemperature;
    }

    public int getCurrentTemperature() {
        return currentTemperature;
    }

    public void setCurrentTemperature(int currentTemperature) {
        if (currentTemperature > getMaxTemperature()) {
            this.currentTemperature = maxTemperature;
            return;
        }
        if (currentTemperature < getMinTemperature()) {
            this.currentTemperature = minTemperature;
            return;
        }
        this.currentTemperature = currentTemperature;
        // здесь уверены, что все проверки прошли

    }

//    public void setCurrentTemperature(int currentTemperature) {
//        if (currentTemperature <= maxTemperature) {
//            if (currentTemperature >= minTemperature) {
//                this.currentTemperature = currentTemperature;
//            }
//        }
//    }

}


