public class Quadrilateral {
    private double x1, y1, x2, y2, x3, y3, x4, y4;

    public Quadrilateral(double x1, double y1, double x2, double y2, double x3,
                         double y3, double x4, double y4) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
        this.x4 = x4;
        this.y4 = y4;
    }

//    public void setCoordinate() {
//
//    }
    public void setX1(double x1) {
        this.x1 = x1;
    }
    public double getX1() {
        return x1;
    }
    public void setX2(double x2) {
        this.x2 = x2;
    }
    public double getX2() {
        return x2;
    }
    public void setX3(double x3) {
        this.x3 = x3;
    }
    public double getX3() {
        return x3;
    }
    public void setX4(double x4) {
        this.x4 = x4;
    }
    public double getX4() {
        return x4;
    }
    public void setY1(double Y1) {
        this.y1 = y1;
    }
    public double getY1() {
        return y1;
    }
    public void setY2(double Y2) {
        this.y2 = y2;
    }
    public double getY2() {
        return y2;
    }
    public void setY3(double Y3) {
        this.y3 = y3;
    }
    public double getY3() {
        return y3;
    }
    public void setY4(double Y4) {
        this.y4 = y4;
    }
    public double getY4() {
        return y4;
    }

    @Override
    public String toString() {
        return String.format("%s (%.1f, %.1f), (%.1f, %.1f), (%.1f, %.1f), (%.1f, %.1f)",
                "Coordinates of Quadrilateral are: \n",
                getX1(), getY1(), getX2(), getY2(),
                getX3(), getY3(), getX4(), getY4());
    }
}



//
//
//    public class Square extends Quadrilateral {
//        Square (int a, int b, int c, int d, int e, int f, int g, int h) {
//            setCoordinate(a,b,c,d,e,f,g,h);
//        }
//        int area() {
//            int d = (int)Math.sqrt((x1-x2) * (x1-x2) + (y1-y2) * (y1-y2));
//            return d*d;
//        }
//    }
//
//    public class Rectangle extends Quadrilateral {
//        Rectangle(int a, int b, int c, int d, int e, int f, int g, int h) {
//            setCoordinate(a,b,c,d,e,f,g,h);
//        }
//        int area() {
//            int d1=(int)Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
//            int d2=(int)Math.sqrt((x1-x4)*(x1-x4) + (y1-y4)*(y1-y4));
//            return d1*d2;
//        }
//    }
//
//    public class Trapezoid extends Quadrilateral {
//        private int height;
//        Trapezoid(int a, int b, int c, int d, int e, int f, int g, int h, int height) {
//            setCoordinate(a,b,c,d,e,f,g,h);
//            this.height = height;
//        }
//        int area() {
//            int d1=(int)Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
//            int d2=(int)Math.sqrt((x3-x4)*(x3-x4) + (y3-y4)*(y3-y4));
//            return (int)((d1+d2)*height)/2;
//        }
//    }
//
//    public class Parallelogram extends Quadrilateral {
//        private int height;
//        Parallelogram(int a, int b, int c, int d, int e, int f, int g, int h, int height) {
//            setCoordinate(a,b,c,d,e,f,g,h);
//            this.height  = height;
//        }
//        int area() {
//            int d1 = (int)Math.sqrt((x1-x2)*(x1-x2) + (y1 - y2)*(y1-y2));
//            return d1*height;
//        }
//    }
//
//
//}


