package account;

public class twentyMain {
    public static void main(String[] args) {
        twenty a = new twenty("123-45",10000);
        twenty b = new twenty("567-89",10000);
        while(a.transfer(b,3000)){
            System.out.println("송금완료");
        }
        System.out.println(a.toString());
        System.out.println(b.toString());
    }
}
