package car;

public class Car {
    private String name;
    public Car(String name){
        this.name = name;
        System.out.printf("모델명: %s\n", name);
    }
    void move(){
        System.out.printf("[%s]가 이동합니다.\n",name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
