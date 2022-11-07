public class TestQuadrilateral {
    public static void main(String[] args) {
        Quadrilateral qad = new Quadrilateral(1.1, 1.2, 6.6, 2.8, 6.2, 9.9, 2.2, 7.4);
        System.out.printf("%s\n", qad.toString());

        Trapezoid t = new Trapezoid(0.0, 0.0, 10.0, 0.0, 8.0, 5.0, 3.3, 5.0, 5.0);
        System.out.printf("\n%s", t.toString());

        Parallelogram p = new Parallelogram(5.0, 5.0, 11.0, 5.0, 12.0, 20.0, 6.0, 20., 15.0, 6.0);
        System.out.printf("\n\n%s\n", p.toString());

//        Square sq = new Square(10,10,20,10,20,20,10,20);
//        System.out.printf("Area of the square is: %d\n", sq.area());
//
//        Rectangle rect = new Rectangle(10,10,30,10,30,20,10,20);
//        System.out.printf("Area of the rectangle is: %d\n", rect.area());
//



    }
}
