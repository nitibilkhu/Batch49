import java.util.Scanner;
public class NaturalNum {
    public static void main(String[] args) {
        int num, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            System.out.println("Natural numbers are " + i);
            sum = sum + i;
        }
        System.out.println("Sum of Natural numbers are " + sum);
    }
}
