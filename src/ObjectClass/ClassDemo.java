package ObjectClass;

public class ClassDemo {
    int id;
    String name;
    String email;
    String city;
}

class getData {
    public static void main(String[] args) {
        ClassDemo ch = new ClassDemo();
        System.out.println(ch.id);
        System.out.println(ch.name);
        System.out.println(ch.email);
        System.out.println(ch.city);
    }
}
