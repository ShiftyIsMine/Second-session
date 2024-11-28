package chp10.ex10_4;
import java.awt.*;

public class square extends shape {
    int pointNum = 4;

    public double area(int width){
        double area = Math.pow(width,2);
        return area;
    }
}
