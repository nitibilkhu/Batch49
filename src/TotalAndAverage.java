import java.util.Scanner;
public class TotalAndAverage {
    public static void main(String[] args) {
        int num1, num2, num3, num4, num5;
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of English");
        num1 = sc.nextInt();
        System.out.println("Enter the number of Physics");
        num2 = sc.nextInt();
        System.out.println("Enter the number of Chemistry");
        num3 = sc.nextInt();
        System.out.println("Enter the number of Biology");
        num4 = sc.nextInt();
        System.out.println("Enter the number of Hindi");
        num5 = sc.nextInt();

        int Total = num1 +num2 + num3 + num4 + num5;
        System.out.println("Total is " + Total);
       double Average = Total/5;
        System.out.println("Average is " + Average);
    }
}
