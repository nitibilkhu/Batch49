package ObjectClass;

public class EmployeeData {
    int id;
    String name;
    String deptt;
    int salary;

    public void setEmployeeData(int i, String n, String d, int s) {
         id = i;
         name = n;
         deptt = d;
         salary = s;
        System.out.println("EMPLOYEE DATA");
        System.out.println("Employee id is " + id );
        System.out.println("Employee name is " + name );
        System.out.println("Employee department is " + deptt );
        System.out.println("Employee salary is " + salary );
    }
}

class GetEmployeesData {
    public static void main(String[] args) {
        EmployeeData ed = new EmployeeData();
        EmployeeData ed1 = new EmployeeData();
        ed.setEmployeeData(123, "Harry", "Software Developer", 900000);
        ed1.setEmployeeData(456, "Anand", "Software Developer", 800000);
    }
}
