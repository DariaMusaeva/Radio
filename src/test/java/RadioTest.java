import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.radio.Radio;

public class RadioTest {

    @Test
    public void shouldSetStationWithUsersSize() {
        Radio stat = new Radio(25);

        stat.setCurrentStation(19);
        Assertions.assertEquals(19, stat.getCurrentStation());
    }

    @Test
    public void shouldSetStationWithDefaultSize() {
        Radio stat = new Radio();

        stat.getDefaultSize();
        stat.setCurrentStation(5);
        Assertions.assertEquals(5, stat.getCurrentStation());
   }

    @Test
    public void shouldSetMinAndMaxStationWithDefaultSize() {
        Radio stat = new Radio();

        stat.getDefaultSize();
        Assertions.assertEquals(9, stat.getMaxStation());
        Assertions.assertEquals(0, stat.getMinStation());
    }

    @Test
    public void shouldSetMinAndMaxStationWithUsersSize() {
        Radio stat = new Radio(36);

        Assertions.assertEquals(35, stat.getMaxStation());
        Assertions.assertEquals(0, stat.getMinStation());
    }

    @Test
    public void shouldSetStationAboveMaxWithUsersSize() {
        Radio stat = new Radio(35);

        stat.setCurrentStation(36);
        Assertions.assertEquals(0, stat.getMinStation());
    }

    @Test
    public void shouldSetStationAboveMaxWithDefaultSize() {
        Radio stat = new Radio();

        stat.setCurrentStation(36);
        Assertions.assertEquals(0, stat.getMinStation());
    }

       @Test
       public void shouldSetStationBelowMinWithUsersSize() {
        Radio stat = new Radio(25);

        stat.setCurrentStation(-1);
        Assertions.assertEquals(24, stat.getCurrentStation());
     }

    @Test
    public void shouldSetStationBelowMinWithDefaultSize() {
        Radio stat = new Radio();

        stat.setCurrentStation(-1);
        stat.getDefaultSize();
        Assertions.assertEquals(9, stat.getMaxStation());
    }

      @Test
    public void shouldSetToNextStationWithUsersSize() {
        Radio stat = new Radio(10);

        stat.setCurrentStation(5);
        stat.nextStation();
        Assertions.assertEquals(6, stat.getCurrentStation());
    }

    @Test
    public void shouldSetToNextStationWithDefaultSize() {
        Radio stat = new Radio();

        stat.getDefaultSize();
        stat.setCurrentStation(5);
        stat.nextStation();
        Assertions.assertEquals(6, stat.getCurrentStation());
    }

    @Test
    public void shouldSetToPrevStationWithUsersSize() {
        Radio stat = new Radio(10);

        stat.setCurrentStation(7);
        stat.prevStation();
        Assertions.assertEquals(6, stat.getCurrentStation());
    }

    @Test
    public void shouldSetToPrevStationWithDefaultSize() {
        Radio stat = new Radio();

        stat.getDefaultSize();
        stat.setCurrentStation(5);
        stat.prevStation();
        Assertions.assertEquals(4, stat.getCurrentStation());
    }
}
/*
       @Test
    public void shouldSetToNextStationBelowBorder() {
        Radio rad = new Radio();

        rad.setCurrentStation(9);
        rad.nextStation();
        int expected = 0;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToPrevStationAboveBorder() {
        Radio rad = new Radio();

        rad.setCurrentStation(0);
        rad.prevStation();
        int expected = 9;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeAboveMax() {
        Radio rad = new Radio();

        rad.setCurrentVolume(101);

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeBelowMin() {
        Radio rad = new Radio();

        rad.setCurrentVolume(-1);

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(15);
        rad.increaseVolume();

        int expected = 16;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeToMax() {
        Radio rad = new Radio();

        rad.setCurrentVolume(99);
        rad.increaseVolume();

        int expected = 100;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(100);
        rad.increaseVolume();

        int expected = 100;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(15);
        rad.decreaseVolume();

        int expected = 14;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeToMin() {
        Radio rad = new Radio();

        rad.setCurrentVolume(1);
        rad.decreaseVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotDecreaseVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(0);
        rad.decreaseVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
*/
