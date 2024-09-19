package ex8_7;
import java.util.Scanner;

public class mainBank {
    public static void main(String[] args) {
        account ac = new account();
        Scanner input =  new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        Scanner select = new Scanner(System.in);

        System.out.println("이름을 입력하세여. ");
        String name = input2.nextLine();
        ac.setName(name);
        System.out.println("비밀번호 입력하세여. ");
        String pass = input2.nextLine();
        ac.setPassword(pass);
        System.out.println("계좌번호 설정하세여. ");
        long AcNumb = input.nextLong();
        ac.setNumber(AcNumb);

        System.out.println(ac.toString());
        while(true) {
            System.out.println("입금할 거임? ");
            System.out.println("1. 입금");
            System.out.println("2. 출금");
            System.out.println("0. 나가");
            int selectnum = input.nextInt();
            if (selectnum == 1) {
                System.out.print("얼마? ");
                long depo = input.nextLong();
                ac.deposit(depo);
                System.out.printf("현재 잔고 : " + ac.getBalance() + "\n");
            } else if (selectnum == 2) {
                System.out.print("얼마? ");
                long with = input.nextLong();
                ac.withdraw(with);
                System.out.printf("현재 잔고 : " + ac.getBalance() + "\n");
            } else if (selectnum == 0) {
                System.out.println("나가세여 \n");
                break;
            }
        }
        System.out.println("님 잔고 : " + ac.getBalance());
//        System.out.println("이름 : " + ac.getName());
//        System.out.println("비밀번호 : " + ac.getPassword());
//        System.out.println("계좌번호 : " + ac.getNumber());
//        System.out.println("님 잔고임 : " + ac.getBalance());

        input.close();
        input2.close();
        select.close();

    }
}
