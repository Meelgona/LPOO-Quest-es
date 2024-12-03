public class Triangle {
    private double ladoA;
    private double ladoB;
    private double ladoC;

    public Triangle() {}

    public Triangle(double ladoA, double ladoB, double ladoC) throws DimensoesInvalidasException {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
        validarLados();
    }

    private void validarLados() throws DimensoesInvalidasException {
        if (ladoA <= 0 || ladoB <= 0 || ladoC <= 0 || ladoA >= ladoB + ladoC ||
            ladoB >= ladoA + ladoC || ladoC >= ladoA + ladoB ||
            ladoA <= Math.abs(ladoB - ladoC) || ladoB <= Math.abs(ladoA - ladoC) ||
            ladoC <= Math.abs(ladoA - ladoB)) {
            throw new DimensoesInvalidasException("Dimensões inválidas para um triângulo.");
        }
    }

    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) throws DimensoesInvalidasException {
        this.ladoA = ladoA;
        validarLados();
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) throws DimensoesInvalidasException {
        this.ladoB = ladoB;
        validarLados();
    }

    public double getLadoC() {
        return ladoC;
    }

    public void setLadoC(double ladoC) throws DimensoesInvalidasException {
        this.ladoC = ladoC;
        validarLados();
    }
}
