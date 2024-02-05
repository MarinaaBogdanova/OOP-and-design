public class Radio {
    private int currentRadioStation;
    private int currentVolume;
    private int maxStation;
    private int minVolume = 0;
    private int maxVolume = 100;

    public Radio() {
        this.maxStation = 9;
    }

    public Radio(int radioStations) {
        this.maxStation = radioStations - 1;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int CurrentRadioStation) {
        if (CurrentRadioStation < 0) {
            return;
        }
        if (CurrentRadioStation > maxStation) {
            return;
        }
        this.currentRadioStation = CurrentRadioStation;
    }

    public void next() {
        if (currentRadioStation < maxStation) {
            currentRadioStation++;
        } else {
            currentRadioStation = 0;
        }
    }

    public void prev() {
        if (currentRadioStation == 0) {
            currentRadioStation = maxStation;
        } else {
            currentRadioStation--;
        }
    }

    public int getCurrentVolume() {

        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume == maxVolume) {
            currentVolume = 0;
        } else {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume == minVolume) {
            currentVolume = 0;
        } else {
            currentVolume--;
        }
    }
}
