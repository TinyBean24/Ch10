public class TestQuadrilateral {
    public static void main(String[] args) {
        Quadrilateral qad = new Quadrilateral(1.1, 1.2, 6.6, 2.8, 6.2, 9.9, 2.2, 7.4);
        System.out.printf("%s\n", qad.toString());

        Trapezoid t = new Trapezoid(0.0, 0.0, 10.0, 0.0, 8.0, 5.0, 3.3, 5.0, 5.0);
        System.out.printf("\n%s", t.toString());

        Parallelogram p = new Parallelogram(5.0, 5.0, 11.0, 5.0, 12.0, 20.0, 6.0, 20., 15.0, 6.0);
        System.out.printf("\n\n%s\n", p.toString());

        Rectangle r = new Rectangle(17.0, 14.0, 30.0, 14.0, 30.0, 28.0, 17.0, 28.0, 14, 13);
        System.out.printf("\n\n%s\n", r.toString());

        Square s = new Square(4.0, 0.0, 8.0, 0.0, 8.0, 4.0, 4.0, 4.0, 4.0, 8.0);
        System.out.printf("\n\n%s\n", s.toString());

    }
}
