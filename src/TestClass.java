public class TestClass {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Circle circle = new Circle(3,"black");
        System.out.println(circle);

        Cylinder cylinder = new Cylinder(3.0,4.0,3,"blue");
        System.out.println(cylinder);
        System.out.println(cylinder.getArea());


    }
}