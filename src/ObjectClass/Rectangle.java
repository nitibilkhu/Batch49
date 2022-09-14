package ObjectClass;

public class Rectangle {
    int length;
    int breadth;

    public void getArea(int l, int b) {
        length = l;
        breadth = b;
        System.out.println("Area of the rectangle is " + length*breadth);
    }
}

class getArea {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.getArea(67,45);
        r.getArea(12,98);
        r.getArea(9,56);
    }
}




