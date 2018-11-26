package Circle;


public class Circle {
    private int r, x, y;

    Circle(int r, int x, int y) {
        this.r = r;
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                ", x=" + x +
                ", y=" + y +
                '}';
    }

    public void sqCircle() {
        double sq = Math.PI * getR() * getR();
        System.out.println("Площадь окружности с радиусом " + getR() + " = " + sq);
    }

    public void lengthCircle() {
        double length = Math.PI * getR();
        System.out.println("Длинна окружности с радиусом " + getR() + " = " +length);

    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        if (r < 0) System.out.println("Круг с таким радиусом не может существовать");
        else this.r = r;
    }

    public int getX() {
        return x;
    }

    public void setX(int xx) {
        this.x = x + xx;
    }

    public int getY() {
        return y;
    }

    public void setY(int yy) {
        this.y = y + yy;
    }
}
