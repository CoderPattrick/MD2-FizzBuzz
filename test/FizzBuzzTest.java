import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest extends FizzBuzz {

    @Test
    void method1() {
        int numb=9;
        String expected="Fizz";
        String result=method(numb);
        assertEquals(expected,result);
    }
    @Test
    void method2() {
        int numb=25;
        String expected="Buzz";
        String result=method(numb);
        assertEquals(expected,result);
    }
    @Test
    void method3() {
        int numb=30;
        String expected="FizzBuzz";
        String result=method(numb);
        assertEquals(expected,result);
    }
    @Test
    void method4() {
        int numb=31;
        String expected="Fizz";
        String result=method(numb);
        assertEquals(expected,result);
    }
    @Test
    void method5() {
        int numb=51;
        String expected="Fizz";
        String result=method(numb);
        assertEquals(expected,result);
    }
    @Test
    void method6() {
        int numb=53;
        String expected="FizzBuzz";
        String result=method(numb);
        assertEquals(expected,result);
    }
    @Test
    void method7() {
        int numb=49;
        String expected="bốn chín";
        String result=method(numb);
        assertEquals(expected,result);
    }
    @Test
    void method8() {
        int numb=52;
        String expected="Buzz";
        String result=method(numb);
        assertEquals(expected,result);
    }
}