package ex10_9;

public class Dog extends Animal{
    public void cry(String sound){
        System.out.println(getName()+"이/가 "+sound+" 소리를 낸다.");
    }
    public void eat(String food){
        System.out.println(getName()+"이/가 "+food+"를 먹는다.");
    }
    public void wag(){
        System.out.println("꼬리를 살랑살랑 흔든다.");
    }
}
