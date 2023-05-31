import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.radio.Radio;

public class RadioTest {

    @Test
    public void shouldSetStationWithUsersSize() {
        Radio rad = new Radio(25);

        rad.setCurrentStation(19);
        Assertions.assertEquals(19, rad.getCurrentStation());
    }

    @Test
    public void shouldSetStationWithDefaultSize() {
        Radio rad = new Radio();

        rad.getDefaultSize();
        rad.setCurrentStation(5);
        Assertions.assertEquals(5, rad.getCurrentStation());
    }

    @Test
    public void shouldSetMinAndMaxStationWithDefaultSize() {
        Radio rad = new Radio();

        rad.getDefaultSize();
        Assertions.assertEquals(9, rad.getMaxStation());
        Assertions.assertEquals(0, rad.getMinStation());
    }

    @Test
    public void shouldSetMinAndMaxStationWithUsersSize() {
        Radio rad = new Radio(36);

        Assertions.assertEquals(35, rad.getMaxStation());
        Assertions.assertEquals(0, rad.getMinStation());
    }

    @Test
    public void shouldNotSetStationAboveMaxWithUsersSize() {
        Radio rad = new Radio(35);

        rad.setCurrentStation(36);
        Assertions.assertEquals(0, rad.getCurrentStation());
    }

    @Test
    public void shouldNotSetStationAboveMaxWithDefaultSize() {
        Radio rad = new Radio();

        rad.setCurrentStation(11);
        Assertions.assertEquals(0, rad.getCurrentStation());
    }

    @Test
    public void shouldNotSetStationBelowMinWithUsersSize() {
        Radio rad = new Radio(25);

        rad.setCurrentStation(-1);
        Assertions.assertEquals(24, rad.getCurrentStation());
    }

    @Test
    public void shouldNotSetStationBelowMinWithDefaultSize() {
        Radio rad = new Radio();

        rad.setCurrentStation(-1);
        rad.getDefaultSize();
        Assertions.assertEquals(9, rad.getMaxStation());
    }

    @Test
    public void shouldSetToNextStationWithUsersSize() {
        Radio rad = new Radio(10);

        rad.setCurrentStation(5);
        rad.nextStation();
        Assertions.assertEquals(6, rad.getCurrentStation());
    }

    @Test
    public void shouldSetToNextStationWithDefaultSize() {
        Radio rad = new Radio();

        rad.getDefaultSize();
        rad.setCurrentStation(5);
        rad.nextStation();
        Assertions.assertEquals(6, rad.getCurrentStation());
    }

    @Test
    public void shouldSetToPrevStationWithUsersSize() {
        Radio rad = new Radio(10);

        rad.setCurrentStation(7);
        rad.prevStation();
        Assertions.assertEquals(6, rad.getCurrentStation());
    }

    @Test
    public void shouldSetToPrevStationWithDefaultSize() {
        Radio rad = new Radio();

        rad.getDefaultSize();
        rad.setCurrentStation(5);
        rad.prevStation();
        Assertions.assertEquals(4, rad.getCurrentStation());
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(15);
        rad.increaseVolume();
        Assertions.assertEquals(16, rad.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseVolumeToMax() {
        Radio rad = new Radio();

        rad.setCurrentVolume(99);
        rad.increaseVolume();
        Assertions.assertEquals(100, rad.getCurrentVolume());
    }

    @Test
    public void shouldNotIncreaseVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(101);
        rad.increaseVolume();
        Assertions.assertEquals(100, rad.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(15);
        rad.decreaseVolume();
        Assertions.assertEquals(14, rad.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseVolumeToMin() {
        Radio rad = new Radio();

        rad.setCurrentVolume(1);
        rad.decreaseVolume();
        Assertions.assertEquals(0, rad.getCurrentVolume());
    }

    @Test
    public void shouldNotDecreaseVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(-1);
        rad.decreaseVolume();
        Assertions.assertEquals(0, rad.getCurrentVolume());
    }
}
