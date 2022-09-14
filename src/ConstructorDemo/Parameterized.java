package ConstructorDemo;

public class Parameterized {
    String name;
    int id;

    public Parameterized(String n1, int i1) {
        name = n1;
        id = i1;
    }
    public void display() {
        System.out.println(name + " " + id);
    }
}

class GetValues {
    public static void main(String[] args) {
        Parameterized p = new Parameterized("Dhavneet Kaur", 1242785);
        p.display();
    }
}
