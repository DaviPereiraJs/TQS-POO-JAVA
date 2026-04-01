class Point {
    // intanciando os objetos, ultilizando o private para garantir o encapsulamento e que esses atributos sejam protegidos para que nehum outra parte do sistema possa altera-lá

    private double x;
    private double y;

    // construtor
    public Point(double x, double y){
        // usamos o this para pegar o valor da variavel e guarda no objeto.
        this.x = x;
        this.y = y;
    }

    // metodo gat que torna o objeto acessivel, basta acessar o getX ou getY 
    public double getX() { return x; }
    public double getY() { return y; }

    // metodo auxiliar pra calcular a distância entre o ponto e outro 
    public double distanceTo(Point other) {
        // aqui ocorre a subtração dos pontos (Math.pow = potencia e Math.sqrt = raiz quadrada)
        return Math.sqrt(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2));
    }

    @Override // sobrescrever, diz ao java que que ignore o metodo existente e passe ao usar a minha versão
    public String toString() {
        // recebe o numero e deixa apenas uma casa decimal
        return String.format("(%.1f, %.1f)", x, y);
    }
}
