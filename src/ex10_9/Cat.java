package ex10_9;

public class Cat extends Animal {
    public void cry(String sound){
        System.out.println(getName()+"이/가 "+sound+" 소리를 낸다.");
    }
    public void eat(String food){
        System.out.println(getName()+"이/가 "+food+"를 먹는다.");
    }
    public void grooming(){
        System.out.println(getName()+"이/가 그루밍을 한다.");
    }
}
