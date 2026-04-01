// super class
// abstract = conceito, que serve de base pra outras class
abstract class Quadrilateral {
    // instanciando os objetos 
    private Point p1, p2, p3, p4;

    // construtor
    public Quadrilateral(Point p1, Point p2, Point p3, Point p4){
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
    }

    // metoodo get, ler os pontos guardados de forma privada
    public Point getP1() { return p1; }
    public Point getP2() { return p2; }
    public Point getP3() { return p3; }
    public Point getP4() { return p4; }

    // contrato obrigatorio, garantindo que as filhas herdem a o jeito de calcular
    public abstract double getArea();
}
