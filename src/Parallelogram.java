public class Parallelogram extends Quadrilateral {
    private final double height;
    Parallelogram(double x1, double x2, double x3, double x4,
                  double y1, double y2, double y3, double y4, double height) {
        super.setCoordinate(5.0, 5.0, 11.0, 5.0, 12.0, 20.0, 6.0, 20.0);
        this.height  = height;
    }
    double area() {
        double x1;
        double d1 = Math.sqrt((x1-x2)*(x1-x2) + (y1 - y2)*(y1-y2));
        return (int) (d1 * height);
    }
}