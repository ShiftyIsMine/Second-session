package ex10_9;

public class MainAnimal {
    public static void main(String[] args){
        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.setName("말티즈");
        dog.eat("사료");
        dog.cry("머어어어엉");
        dog.sleep(12);
        dog.wag();
        cat.setName("야옹이");
        cat.sleep(12);
        cat.eat("생선");
        cat.cry("meowmewoeeewwew");
        cat.grooming();

        Animal animal = new Dog();
        //업 캐스팅이라 Dog에 있는 wag(필드) 못 씀
    }
}
