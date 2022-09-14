package ObjectClass;

public class ObjectReferMethod {
    int rollno;
    String name;

    public void  insertRecord(int r, String n) {
       rollno = r;
       name = n;
       System.out.println("Name of the student is " + name + " and roll no is " + rollno);
    }

}

class GetDataValues {
    public static void main(String[] args) {
        ObjectReferMethod om = new ObjectReferMethod();
        ObjectReferMethod om1 = new ObjectReferMethod();
        om.insertRecord(123, "Heena");
        om1.insertRecord(123, "Heena");
    }
}

