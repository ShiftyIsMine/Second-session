package area;

public class Triangle extends Shape{
    private int base;
    private int height;
    double area(){
        double result =(base*height)/2.0;
        return result;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
