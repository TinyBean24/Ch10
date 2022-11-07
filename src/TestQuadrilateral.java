public class TestQuadrilateral {
    public static void main(String[] args) {
        Square sq = new Square(10,10,20,10,20,20,10,20);
        System.out.printf("Area of the square is: %d\n", sq.area());

        Rectangle rect = new Rectangle(10,10,30,10,30,20,10,20);
        System.out.printf("Area of the rectangle is: %d\n", rect.area());

        Parallelogram p = new Parallelogram(10,10,30,10,20,20,0,20,8);
        System.out.printf("Area of the parallelogram is: %d\n", p.area());

        Trapezoid t = new Trapezoid(10,10,30,10,40,20,0,20,8);
        System.out.printf("Area of the trapezoid is: %d\n", t.area());

    }
}
