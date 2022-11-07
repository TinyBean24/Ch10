public class Rectangle extends Quadrilateral {
    private final double height;
    private final double width;

    Quadrilateral r = new Quadrilateral(0.0, 0.0, 10.0, 0.0, 8.0, 5.0, 3.3, 5.0);



    protected Rectangle(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4, double height, double width) {
        super(x1, y1, x2, y2, x3, y3, x4, y4);
        this.height = height;
        this.width = width;

    }
    double area() {
        double d1=Math.sqrt((r.getX1() - r.getX2()) * (r.getX1() - getX2()) + (getY1() - getY2() * (getY1() - getY2())));
        double d2=Math.sqrt((getX3() - getX4()) * (getX3() - getX4()) + (getY3() - getY4()) * (getY3() - getY4()));
        return ((d1+d2)*height)/2;
    }
}