public class Circulo extends Forma {
    
    private double raio;
    public char[] calcularArea;

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public double calcularArea(){
    return Math.PI*Math.pow(raio, 2);
    }
}
