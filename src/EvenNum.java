import java.util.Scanner;
public class EvenNum {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number");
        num = sc.nextInt();
        for(int i = 0; i <= num; i++) {
            if(i%2 == 0) {
                System.out.println("Even numbers are " + i);
            }
        }
    }
}
