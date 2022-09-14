import java.util.Scanner;
public class CircleArea {
    public static void main(String[] args) {
        final double pi = 3.14;
        int r;
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the radius ");
        r = sc.nextInt();

        double area  = pi * (r * r);
        System.out.println("Area of the circle is " + area);



    }
}
