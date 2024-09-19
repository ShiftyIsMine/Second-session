package ex8_5;

public class Student {
    static int count = 0;
    int id;
    String name;

    Student(int id, String name) {
        Student.count++;
        this.id = id;
        this.name = name;
    }
}
