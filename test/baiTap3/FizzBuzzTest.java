package baiTap3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void traslate0() {
        int number = 15;
        String expected = "FizzBuzz";
        String result = FizzBuzz.traslate(number);
        assertEquals(expected,result);
    }

    @Test
    void traslate1() {
        int number = 9;
        String expected = "Fizz";
        String result = FizzBuzz.traslate(number);
        assertEquals(expected,result);
    }

    @Test
    void traslate2() {
        int number = 25;
        String expected = "Buzz";
        String result = FizzBuzz.traslate(number);
        assertEquals(expected,result);
    }

    @Test
    void traslate3() {
        int number = 38;
        String expected = "38";
        String result = FizzBuzz.traslate(number);
        assertEquals(expected,result);
    }

    @Test
    void traslate4() {
        int number = -10;
        String expected = "Out of ability";
        String result = FizzBuzz.traslate(number);
        assertEquals(expected,result);
    }

    @Test
    void spellNumber0() {
        int number = 53;
        String expected = "FizzBuzz";
        String result = FizzBuzz.spellNumber(number);
        assertEquals(expected,result);
    }

    @Test
    void spellNumber1() {
        int number = 35;
        String expected = "FizzBuzz";
        String result = FizzBuzz.spellNumber(number);
        assertEquals(expected,result);
    }

    @Test
    void spellNumber2() {
        int number = 63;
        String expected = "Fizz";
        String result = FizzBuzz.spellNumber(number);
        assertEquals(expected,result);
    }

    @Test
    void spellNumber3() {
        int number = 85;
        String expected = "Buzz";
        String result = FizzBuzz.spellNumber(number);
        assertEquals(expected,result);
    }

    @Test
    void spellNumber4() {
        int number = 26;
        String expected = "Twenty Six";
        String result = FizzBuzz.spellNumber(number);
        assertEquals(expected,result);
    }

    @Test
    void spellNumber5() {
        int number = 18;
        String expected = "Eighteen";
        String result = FizzBuzz.spellNumber(number);
        assertEquals(expected,result);
    }
}