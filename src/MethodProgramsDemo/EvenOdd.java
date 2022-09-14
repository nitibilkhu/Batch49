package MethodProgramsDemo;

public class EvenOdd {
    int num;

    public int evenOddChecker(int num) {
        if(num%2 == 0) {
            System.out.println(num + " is even");
            return num;
        }
        else {
            System.out.println(num + " is odd");
            return num;
        }
    }
}

class Checker {
    public static void main(String[] args) {
        EvenOdd eo = new EvenOdd();
        eo.evenOddChecker(50);

    }
}
