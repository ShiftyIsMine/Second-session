package chp10.ex10_4;

public class mainSqaure {
    public static void main(String[] args) {
        //object,shape,square 객체의 필드와 메소드 접근 가능
        square squ = new square();
        //shape 객체의 필드와 메소드 접근 가능(cf.square객체의 멤버(필드,메소드)도 접근할 수 있다.)
        shape shapes = new square();
    }
}
