package MethodProgramsDemo;

public class Addition {
    int n1, n2;

    public int addTwoNumbers(int n1, int n2) {
        int c;
        c = n1 + n2;
        System.out.println("Addition of two numbers is " + c);
        return c;

    }
}

class GetValues {
    public static void main(String[] args) {
        Addition a = new Addition();
        a.addTwoNumbers(20,50);
    }
}
