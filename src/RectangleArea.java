import java.util.Scanner;
public class RectangleArea {
    public static void main(String[] args) {
      int a, b;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the length of Rectangle");
      a = sc.nextInt();
      System.out.println("Enter the breadth of Rectangle");
      b = sc.nextInt();
      int area = a * b;
      System.out.println("Area of Rectangle is " + area);

    }
}
