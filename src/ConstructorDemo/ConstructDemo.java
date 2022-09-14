package ConstructorDemo;

public class ConstructDemo {
    int id;
    String name;

    void display() {
        System.out.println("Values are " + id + " " + name);
    }
}

class GetConstructorValues {
    public static void main(String[] args) {
        ConstructDemo cd = new ConstructDemo();
        cd.display();

    }
}
