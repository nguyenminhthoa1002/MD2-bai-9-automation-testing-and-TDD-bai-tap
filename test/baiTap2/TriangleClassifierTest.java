package baiTap2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    @Test
     void triangleClassifier() {
        int a= 2;
        int b = 2;
        int c = 2;
        String expected = "Equilateral Triangle";
        String result = TriangleClassifier.triangleClassifier(a,b,c);
        assertEquals(expected,result);
    }

    @Test
    void triangleClassifier1() {
        int a= 2;
        int b = 2;
        int c = 3;
        String expected = "Isosceles Triangle";
        String result = TriangleClassifier.triangleClassifier(a,b,c);
        assertEquals(expected,result);
    }

    @Test
    void triangleClassifier2() {
        int a= 3;
        int b = 4;
        int c = 5;
        String expected = "Normal Triangle";
        String result = TriangleClassifier.triangleClassifier(a,b,c);
        assertEquals(expected,result);
    }

    @Test
    void triangleClassifier3() {
        int a= 8;
        int b = 2;
        int c = 3;
        String expected = "Triangle is NOT exist!";
        String result = TriangleClassifier.triangleClassifier(a,b,c);
        assertEquals(expected,result);
    }

    @Test
    void triangleClassifier4() {
        int a= -1;
        int b = 2;
        int c = 1;
        String expected = "Triangle is NOT exist!";
        String result = TriangleClassifier.triangleClassifier(a,b,c);
        assertEquals(expected,result);
    }

    @Test
    void triangleClassifier5() {
        int a= 0;
        int b = 1;
        int c = 1;
        String expected = "Triangle is NOT exist!";
        String result = TriangleClassifier.triangleClassifier(a,b,c);
        assertEquals(expected,result);
    }
}