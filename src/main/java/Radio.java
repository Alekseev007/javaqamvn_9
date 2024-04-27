public class Radio {
    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume = minVolume;
    private int minStation = 0;
    private int maxStation = 9;
    private int currentStation = minStation;

    public Radio(int size){
        maxStation = minStation + size - 1;
    }
    public Radio(){

    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            newCurrentVolume = minVolume;
        }
        if (newCurrentVolume > maxVolume) {
            newCurrentVolume = maxVolume;
        }
        currentVolume = newCurrentVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < minStation) {
            newCurrentStation = minStation;
        }
        if (newCurrentStation > maxStation) {
            newCurrentStation = maxStation;
        }
        currentStation = newCurrentStation;
    }

    public void nextCurrentStation() {
        if (currentStation >= maxStation) {
            currentStation = minStation;
        } else {
            currentStation = currentStation + 1;
        }
    }

    public void prevCurrentStation() {
        if (currentStation <= minStation) {
            currentStation = maxStation;
        } else {
            currentStation = currentStation - 1;
        }
    }


    public void nextCurrentVolume() {
        if (currentVolume >= maxVolume) {
            currentVolume = maxVolume;
        } else {
            currentVolume = currentVolume + 1;
        }
    }

    public void prevCurrentVolume() {
        if (currentVolume <= minVolume) {
            currentVolume = minVolume;
        } else {
            currentVolume = currentVolume - 1;
        }
    }
}

