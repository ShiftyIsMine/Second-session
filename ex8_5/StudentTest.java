package ex8_5;

public class StudentTest {
    public static void main(String[] args){
        Student Park = new Student(2024122104,"Park");
        Student Kim = new Student(2024206028,"Kim");
        Student Lee = new Student(2024153237,"Lee");
//        System.out.printf("ex8_5.Student 객체의 수 : %d ",ex8_5.Student.count);
        System.out.printf(String.format("ex8_5.Student 객체의 수 : %d",Student.count));
    }
}
