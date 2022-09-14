public class ThirtyAug {
    public static void main(String[] args) {

        for(int i = 1; i <= 5; i++) {
            for(int j = 5; j >= i; j--) {
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++) {
                if((i == 2 || i == 3 || i == 4) &&  (k == 2 || k == 3 || k== 4)) {
                    System.out.print(" ");
                } else {
                    System.out.print("*" + " ");
                }
            }
            System.out.println(" ");
        }

        // FIRST (DOWN PYRAMID)

//        for(int i = 1; i <= 5; i++) {
//            for(int j = 1; j  <= i; j++) {
//                System.out.print(" ");
//            }
//            for(int k = 5; k >= i; k--) {
//                System.out.print("*" + " ");
//            }
//            System.out.println(" ");
//        }

        // SECOND (LEFT PASCAL TRIANGLE)

//        for(int i = 1; i < 5; i++) {
//            for(int j = 5; j >= i; j--) {
//                System.out.print(" ");
//            }
//            for(int k = 1; k <= i; k++) {
//                System.out.print("*");
//            }
//            System.out.println(" ");
//        }
//
//        for(int a = 1; a <= 5; a++) {
//            for(int b = 1; b <= a; b++) {
//                System.out.print(" ");
//            }
//            for(int c = 5; c >= a; c--) {
//                System.out.print("*");
//            }
//            System.out.println(" ");
//        }

        // THIRD (SAND GLASS PATTERN)

//        for(int i =1; i < 8; i++) {
//            for(int j = 1; j <= i; j++ ) {
//                System.out.print(" ");
//            }
//            for(int k = 8; k >= i; k--) {
//                System.out.print(" *" );
//            }
//            System.out.println(" ");
//        }
//
//        for(int i =1; i <= 8; i++) {
//            for(int j = 8; j >= i; j-- ) {
//                System.out.print(" ");
//            }
//            for(int k = 1; k <= i; k++) {
//                System.out.print(" *" );
//            }
//            System.out.println(" ");
//        }


    }
}
