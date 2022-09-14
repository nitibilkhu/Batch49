package MethodProgramsDemo;

public class GetterSetterProgram {
    private int id;
    private String student_name;

    public int getId() {
        return id;
    }

    public void setId(int i) {
        this.id = i;
    }

    public String getName() {
        return student_name;
    }

    public void setName(String n) {
        this.student_name = n;
    }
}

class GetValuesOfGetter {
    public static void main(String[] args) {
    GetterSetterProgram gs = new GetterSetterProgram();
    gs.setName("Dhavneet Kaur");
    gs.setId(8743);
        System.out.println(gs.getId());
        System.out.println(gs.getName());
    }
}

