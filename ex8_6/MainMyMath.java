package ex8_6;
import java.util.Scanner;

public class MainMyMath {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
//        int n1 = 10;
//        int n2 = 20;
        System.out.print("첫 번째 정수 값 : ");
        int n1 = sc.nextInt();
        System.out.print("두 번째 정수 값 : ");
        int n2 = sc.nextInt();
        System.out.printf("%d와/과 %d 중에 더 큰 값 : %f\n",n1,n2,MyMath.max(n1,n2));
        System.out.printf("%d와/과 %d 중에 더 작은 값 : %f\n",n1,n2,MyMath.min(n1,n2));
        sc.close();
    }
}