import java.util.Scanner;
public class Voting {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any age");
        num = sc.nextInt();
        if(num >= 18){
            System.out.println("You are eligible for votes");
        }
        else {
            System.out.println("you have to wait unless you are 18 years old");
        }
    }
}

