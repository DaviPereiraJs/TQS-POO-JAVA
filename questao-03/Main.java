public class Main {
    public static void main(String[] args) {
        // Testando Trapézio
        Point t1 = new Point(0, 0);
        Point t2 = new Point(10, 0);
        Point t3 = new Point(8, 5);
        Point t4 = new Point(3, 5);
        Trapezoid trapezoid = new Trapezoid(t1, t2, t3, t4);
        System.out.println("Área do Trapézio: " + trapezoid.getArea());

        // Testando Paralelogramo
        Point p1 = new Point(0, 0);
        Point p2 = new Point(8, 0);
        Point p3 = new Point(10, 4);
        Point p4 = new Point(2, 4);
        Parallelogram parallelogram = new Parallelogram(p1, p2, p3, p4);
        System.out.println("Área do Paralelogramo: " + parallelogram.getArea());

        // Testando Retângulo
        Point r1 = new Point(0, 0);
        Point r2 = new Point(5, 0);
        Point r3 = new Point(5, 3);
        Point r4 = new Point(0, 3);
        Rectangle rectangle = new Rectangle(r1, r2, r3, r4);
        System.out.println("Área do Retângulo: " + rectangle.getArea());

        // Testando Quadrado
        Point s1 = new Point(0, 0);
        Point s2 = new Point(4, 0);
        Point s3 = new Point(4, 4);
        Point s4 = new Point(0, 4);
        Square square = new Square(s1, s2, s3, s4);
        System.out.println("Área do Quadrado: " + square.getArea());
    }
}