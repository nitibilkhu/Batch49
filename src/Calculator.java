import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
         int a, b;
         char operator;
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
         a = sc.nextInt();
        System.out.println("Enter the second number");
         b = sc.nextInt();
        System.out.println("Enter any operator ");
         operator = sc.next().charAt(0);

        if (operator == '+') {
            System.out.println("Addition is " + (a+b));
        }
        else if (operator == '-') {
            System.out.println("Subtraction is " + (a-b));
        }
        else if(operator == '*') {
            System.out.println("Multiplication is " + (a*b));
        }
        else if(operator == '/') {
            System.out.println("Division is " + (a/b));
        }
        else {
            System.out.println("Enter any of these operator +, -, *, /");
        }
        }


}

