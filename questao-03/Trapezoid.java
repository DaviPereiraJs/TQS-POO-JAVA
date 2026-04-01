// Trapézio
class Trapezoid extends Quadrilateral {
    public Trapezoid(Point p1, Point p2, Point p3, Point p4) {
        super(p1, p2, p3, p4);
    }

    @Override // o override faz esquecer a regra geral e diz que a conta é ralizada de determinada maneira
    public double getArea() {
        // Base maior (p1 a p2) e Base menor (p4 a p3)
        double base1 = getP1().distanceTo(getP2());
        double base2 = getP4().distanceTo(getP3());
        // Altura é a diferença no eixo Y (assumindo bases horizontais)
        double height = Math.abs(getP1().getY() - getP4().getY());
        
        return ((base1 + base2) / 2.0) * height;
    }
}

// Paralelogramo herda de Trapézio
class Parallelogram extends Trapezoid {
    public Parallelogram(Point p1, Point p2, Point p3, Point p4) {
        super(p1, p2, p3, p4);
    }

    @Override
    public double getArea() {
        // Área = base * altura
        double base = getP1().distanceTo(getP2());
        double height = Math.abs(getP1().getY() - getP4().getY());
        return base * height;
    }
}

// Retângulo herda de Paralelogramo
class Rectangle extends Parallelogram {
    public Rectangle(Point p1, Point p2, Point p3, Point p4) {
        super(p1, p2, p3, p4);
    }

    @Override
    public double getArea() {
        // Área = base * altura ( que aqui é exatamente o tamanho da lateral p2 até p3)
        double width = getP1().distanceTo(getP2());
        double height = getP2().distanceTo(getP3());
        return width * height;
    }
}

// Quadrado herda de Retângulo
class Square extends Rectangle {
    public Square(Point p1, Point p2, Point p3, Point p4) {
        super(p1, p2, p3, p4);
    }

    @Override
    public double getArea() {
        // Lado * Lado
        double side = getP1().distanceTo(getP2());
        return side * side;
    }
}