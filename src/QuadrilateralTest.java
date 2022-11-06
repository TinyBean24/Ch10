import org.w3c.dom.css.Rect;

public class QuadrilateralTest {
    public static void main(String[] args) {
        Square sq = new Square(10,10,20,10,20,10,10,20);
        System.out.println("Area of the square is" + sq.area());

        Rectangle rec = new Rect(10,10,20,10,30,20,10);
        System.out.println("Area of the rectangle is " + rec.area());

        Parallelogram p = new Quadrilateral.Parallelogram(10,10,30,10,20,20,0,20,8);
        System.out.println("Area of the paralellogram is" + p.area());

        Trapezoid t = new Quadrilateral.Trapezoid(10,10,30,10,40,20,0,20,8);
        System.out.println("Area of the trapezoid is" + t.area());

    }
}
