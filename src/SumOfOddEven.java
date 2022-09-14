import java.util.Scanner;
public class SumOfOddEven {
    public static void main(String[] args) {
        int num, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        num = sc.nextInt();
        if(num%2 == 0) {
            for(int i = 0; i <= num; i = i + 2) {
                System.out.println("Even numbers are " + i);
                sum = sum + i;
            }
            System.out.println("Sum is " + sum);
        }
        else {
            for(int j = 1; j <= num; j = j + 2) {
                System.out.println("Odd numbers are " + j);
                sum = sum + j;
            }
            System.out.println("Sum is " + sum);
        }
    }
}
