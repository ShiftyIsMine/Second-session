package area;

public class square extends Shape{
    private int length;
    double area(){
        return Math.pow(length, 2);
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
