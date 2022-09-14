public class Pyramid {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++) {
            for(int j = 5; j >= i; j--) {
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            for(int l = 2; l <= i; l++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        for(int a = 1; a <= 5; a++) {
            for(int b = 1; b <= a; b++) {
                System.out.print(" ");
            }
            for(int c = 5; c >= a; c--) {
                System.out.print("*");
            }
            for(int d = 4; d >= a; d--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
