import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void shouldNextCurrentStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(0);

        rad.nextCurrentStation();

        int expected = 1;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextCurrentStation2() {
        Radio rad = new Radio();
        rad.setCurrentStation(-1);

        rad.nextCurrentStation();

        int expected = 1;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextCurrentStation3() {
        Radio rad = new Radio();
        rad.setCurrentStation(1);

        rad.nextCurrentStation();

        int expected = 2;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextCurrentStation4() {
        Radio rad = new Radio();
        rad.setCurrentStation(8);

        rad.nextCurrentStation();

        int expected = 9;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextCurrentStation5() {
        Radio rad = new Radio();
        rad.setCurrentStation(9);

        rad.nextCurrentStation();

        int expected = 0;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextCurrentStation6() {
        Radio rad = new Radio();
        rad.setCurrentStation(10);

        rad.nextCurrentStation();

        int expected = 0;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNextCurrentStation7() {
        Radio rad = new Radio(30);
        rad.setCurrentStation(10);

        rad.nextCurrentStation();

        int expected = 11;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNextCurrentStation8() {
        Radio rad = new Radio(30);
        rad.setCurrentStation(29);

        rad.nextCurrentStation();

        int expected = 0;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevCurrentStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(0);

        rad.prevCurrentStation();

        int expected = 9;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevCurrentStation2() {
        Radio rad = new Radio();
        rad.setCurrentStation(-1);

        rad.prevCurrentStation();

        int expected = 9;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevCurrentStation3() {
        Radio rad = new Radio();
        rad.setCurrentStation(1);

        rad.prevCurrentStation();

        int expected = 0;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevCurrentStation4() {
        Radio rad = new Radio();
        rad.setCurrentStation(8);

        rad.prevCurrentStation();

        int expected = 7;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevCurrentStation5() {
        Radio rad = new Radio();
        rad.setCurrentStation(9);

        rad.prevCurrentStation();

        int expected = 8;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevCurrentStation6() {
        Radio rad = new Radio();
        rad.setCurrentStation(10);

        rad.prevCurrentStation();

        int expected = 8;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldPrevCurrentStation7() {
        Radio rad = new Radio(30);
        rad.setCurrentStation(10);

        rad.prevCurrentStation();

        int expected = 9;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldPrevCurrentStation8() {
        Radio rad = new Radio(30);
        rad.setCurrentStation(0);

        rad.prevCurrentStation();

        int expected = 29;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldNextCurrentVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);

        rad.nextCurrentVolume();

        int expected = 1;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextCurrentVolume2() {
        Radio rad = new Radio();
        rad.setCurrentVolume(-1);

        rad.nextCurrentVolume();

        int expected = 1;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextCurrentVolume3() {
        Radio rad = new Radio();
        rad.setCurrentVolume(1);

        rad.nextCurrentVolume();

        int expected = 2;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextCurrentVolume4() {
        Radio rad = new Radio();
        rad.setCurrentVolume(99);

        rad.nextCurrentVolume();

        int expected = 100;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextCurrentVolume5() {
        Radio rad = new Radio();
        rad.setCurrentVolume(100);

        rad.nextCurrentVolume();

        int expected = 100;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextCurrentVolume6() {
        Radio rad = new Radio();
        rad.setCurrentVolume(101);

        rad.nextCurrentVolume();

        int expected = 100;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevCurrentVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);

        rad.prevCurrentVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevCurrentVolume2() {
        Radio rad = new Radio();
        rad.setCurrentVolume(-1);

        rad.prevCurrentVolume();

        int expected = 0;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevCurrentVolume3() {
        Radio rad = new Radio();
        rad.setCurrentVolume(1);

        rad.prevCurrentVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevCurrentVolume4() {
        Radio rad = new Radio();
        rad.setCurrentVolume(99);

        rad.prevCurrentVolume();

        int expected = 98;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevCurrentVolume5() {
        Radio rad = new Radio();
        rad.setCurrentVolume(100);

        rad.prevCurrentVolume();

        int expected = 99;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevCurrentVolume6() {
        Radio rad = new Radio();
        rad.setCurrentVolume(101);

        rad.prevCurrentVolume();

        int expected = 99;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}