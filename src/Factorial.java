import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        int num, mul = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        num = sc.nextInt();
        for(int i = num; i >= 1; i--) {
            mul = mul * i;
        }
        System.out.println("Factorial of " + num + " is " + mul);

    }
}
