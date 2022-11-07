public class Trapezoid extends Quadrilateral {
    private final double height;

    Quadrilateral t = new Quadrilateral(0.0, 0.0, 10.0, 0.0, 8.0, 5.0, 3.3, 5.0);

    protected Trapezoid(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4, double height) {
        super(x1, y1, x2, y2, x3, y3, x4, y4);
        this.height = height;
    }

    double area() {
        double d1=Math.sqrt((t.getX1() - t.getX2()) * (t.getX1() - getX2()) + (getY1() - getY2() * (getY1() - getY2())));
        double d2=Math.sqrt((getX3() - getX4()) * (getX3() - getX4()) + (getY3() - getY4()) * (getY3() -getY4()));
        return ((d1+d2)*height)/2;
    }

    @Override
    public String toString() {
        return String.format("%s(%.1f, %.1f), (%.1f, %.1f), (%.1f, %.1f), (%.1f, %.2f)\n%s %.2f\nArea is: %.2f",
                "Coordinates of Trapezoid are:\n",
                getX1(), getY1(), getX2(), getY2(),
                getX3(), getY3(), getX4(), getY4(), "Height is: ", height, area());
    }
}


