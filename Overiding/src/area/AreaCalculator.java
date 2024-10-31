package area;

import java.awt.*;
import java.util.ArrayList;

public class AreaCalculator {
    public static void main(String[] args) {
        square s = new square();
        s.name = "정사각형";
        s.setLength(3);
        Triangle t = new Triangle();
        t.name = "삼각형";
        t.setBase(4);
        t.setHeight(3);
        Circle c = new Circle();
        c.name = "원";
        c.setRadius(4);
        Shape[] shapeArr = {s,t,c};
//        ArrayList<Shape> shapeArr = new ArrayList<Shape>();
//        shapeArr.add(s);
//        shapeArr.add(t);
//        shapeArr.add(c);
        viewShape(shapeArr);
    }

//    public static void viewShape(ArrayList<Shape> arrList) {
//        for (Shape s : arrList) {
//            System.out.printf("%s의 면적은 %.1f㎠\n",s.name,s.area());
//        }
//    }
    public static void viewShape(Shape[] arrList) {
        for (Shape s : arrList) {
            System.out.printf("%s의 면적은 %.1f㎠\n",s.name,s.area());
        }
    }
}
