public class Square extends Quadrilateral {
    private final double height;
    private final double width;

    Quadrilateral s = new Quadrilateral(getX1(), getY1(), getX2(), getY2(), getX3(), getY3(), getX4(), getY4());

    protected Square(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4, double height, double width) {
        super(x1, y1, x2, y2, x3, y3, x4, y4);
        this.height = height;
        this.width = width;
    }

    double area() {
        return height * height;
    }

    @Override
    public String toString() {
        return String.format("%s(%.1f, %.1f), (%.1f, %.1f), (%.1f, %.1f), (%.1f, %.1f)\n%s %.2f\n%s %.2f\nArea is: %.2f",
                "Coordinates of Square are:\n",
                getX1(), getY1(), getX2(), getY2(),
                getX3(), getY3(), getX4(), getY4(), "Width is: ", width, "Height is: ", height, area());
    }

}