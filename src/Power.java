import java.util.Scanner;
public class Power {
    public static void main(String[] args) {
        int num, power, mul = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        num = sc.nextInt();
        System.out.println("Enter the power");
        power = sc.nextInt();
        for(int i = 1; i <= power; i++) {
            mul = mul * num;
        }
        System.out.println("Power of " + num + " is " + mul);


    }
}
