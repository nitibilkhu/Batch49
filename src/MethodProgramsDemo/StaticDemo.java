package MethodProgramsDemo;

public class StaticDemo {
    int student_id;
    String fav_subject;
    static int roll_no;
    static String name;

    public static void displayStudentData() {
        System.out.println("This is the info of all students");
    }
}

class GetStudentValues {
    public static void main(String[] args) {
        StaticDemo sd = new StaticDemo();
        sd.student_id =57678;
        sd.fav_subject ="English";
        StaticDemo.name ="Harman";
        StaticDemo.roll_no = 6357;
        StaticDemo.displayStudentData();
        System.out.println("Student name is " + StaticDemo.name + " and roll no is " + StaticDemo.roll_no);
        System.out.println("ID is " + sd.student_id + " and his/her favourite subject is " + sd.fav_subject);

    }
}
