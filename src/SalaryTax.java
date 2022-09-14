import java.util.Scanner;
public class SalaryTax {
    public static void main(String[] args) {
        int salary;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the salary");
        salary = sc.nextInt();

        if(salary <= 5000) {
            System.out.println("There is no tax on salary");
        }
        else if(salary > 5000 && salary <= 50000){
            System.out.println(salary + (0.20 * salary));
            System.out.println("hi");
        }
        else {
            System.out.println(salary + (0.30 * salary));
        }





    }
}
