package ObjectClass;

public class SimpleObjectClass {
    int id;
    String name;

    public void displayWords() {
        System.out.println("This is my first Object class Program");
    }
}

 class GetValues {
     public static void main(String[] args) {
         SimpleObjectClass so = new SimpleObjectClass();
         SimpleObjectClass s1 = new SimpleObjectClass();
         so.id = 123;
         so.name = "Dhavneet Kaur";

         s1.id = 456;
         s1.name = "Harpreet Singh";
         System.out.println("Name is " + so.name + " and id is " + so.id );
         System.out.println("Name is " + s1.name + " and id is " + s1.id );
     }
}
