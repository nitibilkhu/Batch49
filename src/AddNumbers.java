public class AddNumbers {

    static class StudentData {
       int roll_no;
       String name;

       void insertRecord(int r, String n) {
           roll_no = r;
           name = n;
       }
       void displayInfo() {
           System.out.println(roll_no + " " + name );
       }

       class StudentDataValues {
           public static void main(String[] args) {
               StudentData s1 = new StudentData();
               StudentData s2 = new StudentData();
               s1.insertRecord(12, "Harpreet");
               s2.insertRecord(13, "Dhavneet");
               s1.displayInfo();
               s2.displayInfo();
           }
       }
   }
}
