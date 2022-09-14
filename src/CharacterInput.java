import java.util.Scanner;
public class CharacterInput {
    public static void main(String[] args) {
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any character");
        ch = sc.next().charAt(0);
        System.out.println("Character is " + ch);

    }
}
