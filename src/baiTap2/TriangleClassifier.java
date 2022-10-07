package baiTap2;

public class TriangleClassifier {
    public static String triangleClassifier(int a,int b, int c) {
        if (a>0 && b>0 && c> 0) {
            if (a+b>c && a+c>b && b+c>a) {
                if (a==b || a==c || b==c){
                    if (a==b && b==c) {
                        return "Equilateral Triangle";
                    } else {
                        return "Isosceles Triangle";
                    }
                } else {
                    return "Normal Triangle";
                }
            } else {
                return "Triangle is NOT exist!";
            }
        } else {
            return "Triangle is NOT exist!";
        }
    }
}
