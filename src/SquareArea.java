import java.util.Scanner;
public class SquareArea {
        public static void main(String[] args) {
            int s;
            Scanner sc =  new Scanner(System.in);
            System.out.println("Enter the side");
            s = sc.nextInt();

            int area  = (s*s);
            System.out.println("Area of the Square is " + area);



        }
    }

