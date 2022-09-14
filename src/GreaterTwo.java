import java.util.Scanner;
public class GreaterTwo {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        a = sc.nextInt();
        System.out.println("Enter the second number");
        b = sc.nextInt();
        if (a > b) {
            System.out.println(a + " is greater");
        }
        else if(a == b) {
            System.out.println("Both are equal");
        }
        else {
            System.out.println(b + " is greater");
        }
    }
}
