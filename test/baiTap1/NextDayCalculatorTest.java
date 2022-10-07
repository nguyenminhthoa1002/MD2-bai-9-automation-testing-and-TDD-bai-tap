package baiTap1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @Test
    void main() {
    }

    @Test
    void calNextDay0() {
        int date = 1;
        int month = 1;
        int year = 2018;
        String expected = "The next day is 2/ 1/ 2018";
        String result = NextDayCalculator.calNextDay(date,month,year);
        assertEquals(expected,result);
    }

    @Test
    void calNextDay1() {
        int date = 31;
        int month = 1;
        int year = 2018;
        String expected = "The next day is 1/ 2/ 2018";
        String result = NextDayCalculator.calNextDay(date,month,year);
        assertEquals(expected,result);
    }

    @Test
    void calNextDay2() {
        int date = 30;
        int month = 4;
        int year = 2018;
        String expected = "The next day is 1/ 5/ 2018";
        String result = NextDayCalculator.calNextDay(date,month,year);
        assertEquals(expected,result);
    }

    @Test
    void calNextDay3() {
        int date = 28;
        int month = 2;
        int year = 2018;
        String expected = "The next day is 1/ 3/ 2018";
        String result = NextDayCalculator.calNextDay(date,month,year);
        assertEquals(expected,result);
    }

    @Test
    void calNextDay4() {
        int date = 29;
        int month = 2;
        int year = 2020;
        String expected = "The next day is 1/ 3/ 2020";
        String result = NextDayCalculator.calNextDay(date,month,year);
        assertEquals(expected,result);
    }

    @Test
    void calNextDay5() {
        int date = 31;
        int month = 12;
        int year = 2018;
        String expected = "The next day is 1/ 1/ 2019";
        String result = NextDayCalculator.calNextDay(date,month,year);
        assertEquals(expected,result);
    }
}