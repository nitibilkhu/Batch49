import java.util.Scanner;

public class OddNum {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        num = sc.nextInt();
        for(int i = 1; i <= num; i++) {
           if(i%2 != 0) {
               System.out.println("Odd numbers are " + i);
           }
        }

    }
}
