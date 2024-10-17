package chp10.ex10_4;

public class mainShape {
    public static void main(String[] args) {
        square s = new square();
        s.name = "정사각형";
        triangle t = new triangle();
        t.name = "삼각형";
        circle c = new circle();
        c.name = "원";

//        shape s1 = new square();//이것두 참조를 부모 클래스로 했으면 그것도 업캐스팅
        shape[] shapes = {s,t,c};//업캐스팅 but 자식 클래스에 마음대로 접근 불가능
        for(int i=0;i<shapes.length;i++){
            System.out.printf("인덱스 번호 %d번의 도형 이름 : %s\n",i,shapes[i].name);
        }
//        (square)shapes[i]>>> 다운 캐스팅 but 부모 클래스의 변수를 사용 못 함
    }
}
