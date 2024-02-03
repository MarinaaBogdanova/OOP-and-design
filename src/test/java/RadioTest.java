
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

public class RadioTest {

    @Test
    public void shouldSetRadioStation() {
        Radio radiostation = new Radio();

        radiostation.setCurrentRadioStation(3);

        int expected = 3;
        int actual = radiostation.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldNotSetRadioStation() {
        Radio radiostation = new Radio();

        radiostation.setCurrentRadioStation(-5);

        int expected = 0;
        int actual = radiostation.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioStationAboveMax() {
        Radio radiostation = new Radio();

        radiostation.setCurrentRadioStation(15);

        int expected = 0;
        int actual = radiostation.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getNextStation() {
        Radio radiostation = new Radio();
        radiostation.setCurrentRadioStation(5);

        radiostation.next();

        int expected = 6;
        int actual = radiostation.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getNextStationInMax() {
        Radio radiostation = new Radio();
        radiostation.setCurrentRadioStation(9);

        radiostation.next();

        int expected = 0;
        int actual = radiostation.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getPrevStationInMin() {
        Radio radiostation = new Radio();
        radiostation.setCurrentRadioStation(0);

        radiostation.prev();

        int expected = 9;
        int actual = radiostation.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getPrevStation() {
        Radio radiostation = new Radio();
        radiostation.setCurrentRadioStation(5);

        radiostation.prev();

        int expected = 4;
        int actual = radiostation.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume() {
        Radio volume = new Radio();

        volume.setCurrentVolume(50);

        int expected = 50;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolume() {
        Radio volume = new Radio();

        volume.setCurrentVolume(-5);

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeAboveMax() {
        Radio volume = new Radio();

        volume.setCurrentVolume(150);

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getIncreaseVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(50);

        volume.increaseVolume();

        int expected = 51;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getIncreaseVolumeInMax() {
        Radio volume = new Radio();
        volume.setCurrentVolume(100);

        volume.increaseVolume();

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getDecreaseVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(50);

        volume.decreaseVolume();

        int expected = 49;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getDecreaseVolumeInMin() {
        Radio volume = new Radio();
        volume.setCurrentVolume(0);

        volume.decreaseVolume();

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}


