import java.util.Scanner;
public class SmartProgrammingIf {
    public static void main(String[] args) {

        // FIND GREATER NUMBER BETWEEN 2 NUMBERS


//        int a, b;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the value of a ");
//        a = sc.nextInt();
//        System.out.println("Enter the value of b");
//        b = sc.nextInt();
//        if(a > b) {
//            System.out.println(a + " is greater than " + b);
//        }
//        else {
//            System.out.println(b + " is greater than " +  a);
//        }

        // FIND GREATER NUMBER BETWEEN 2 NUMBERS USING TERNARY OPERATOR


//     String result = (a > b) ? "A is greater" : "B is greater";
//        System.out.println(result);



        // FIND GREATER NUMBER BETWEEN 3 NUMBERS



//        int a,b,c;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the first number");
//        a = sc.nextInt();
//        System.out.println("Enter the second number");
//        b = sc.nextInt();
//        System.out.println("Enter the third number");
//        c = sc.nextInt();
//        if  (a == b && a == c) {
//            System.out.println("All are equal");
//        }
//        else if (b >= a && b >= c) {
//            System.out.println("B is greater");
//        }
//        else if (a >= b && a >= c){
//            System.out.println("A is greater");
//        }
//        else {
//            System.out.println("C is greater");
//        }

//       LEAP YEAR PROGRAM

        int year;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any year");
        year = sc.nextInt();

        if(year%4 == 0) {
            if (year%100 == 0 || year%400 == 0) {
                System.out.println("It is a leap year");
            }
        }
        else {
            System.out.println("It is not a leap year");
        }

    }
}
