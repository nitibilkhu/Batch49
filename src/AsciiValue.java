import java.util.Scanner;
public class AsciiValue {
    public static void main(String[] args) {
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Character");
        ch = sc.next().charAt(0);
        int c1 = ch;
        System.out.println("ASCII VALUE of " + ch +  " is " + c1);
    }
}
