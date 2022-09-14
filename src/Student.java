class Student {
    int id;
    String name;
}
class StudentMain {
    public static void main(String[] args) {
        Student s = new Student();
        Student s1 = new Student();
        s.id = 785;
        s. name = "Dhavneet";
        s1.id = 786;
        s1.name = "Gagandeep";
        System.out.println("Name of the student is " + s.name + " and her id is " + s.id);
        System.out.println("Name of the student is " + s1.name + " and her id is " + s1
                .id);
    }
}