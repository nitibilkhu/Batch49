import java.util.Scanner;
class SwitchCalculator {
    public static void main(String[] args) {
        int a, b;
        char operator;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any character +, -, *, %");
        operator = sc.next().charAt(0);
        System.out.println("Enter the first number");
        a = sc.nextInt();
        System.out.println("Enter the second number");
        b = sc.nextInt();

        switch(operator) {
            case '+' :
                System.out.println("Addition is " + (a+b));
                break;
            case '-' :
                System.out.println("Subtraction is " + (a-b));
                break;
            case '*':
                System.out.println("Multiplication is " + (a*b));
                break;
            case '/':
                System.out.println("Division is " + (a/b));
                break;
            default:
                System.out.println("Please enter any of these operator +, -, *, /");
        }
    }
        }
