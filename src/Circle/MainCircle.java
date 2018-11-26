package Circle;

public class MainCircle {

    public static void main(String[] args) {
        Circle circle = new Circle(4, 4, 4);
        System.out.println(circle);
        circle.setX(2);
        circle.setY(3);
        circle.setR(5);
        System.out.println(circle);
        circle.sqCircle();
        circle.lengthCircle();

    }

}
