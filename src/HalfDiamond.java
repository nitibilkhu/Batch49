public class HalfDiamond {
    public static void main(String[] args) {
        for(int i = 1; i <= 4; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        for(int a = 1; a <= 5; a++) {
            for(int b = 5; b >= a; b--) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
