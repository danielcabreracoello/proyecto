package proyecto;

public class Paquete {
    private int numeroPaquete;
    private String dni;
    private double peso;
    private int prioridad; //0=normal 1 = alta 2=expres

    public Paquete(int numeroReferencia, String dni, double peso, int prioridad) {
        this.numeroPaquete = numeroPaquete;
        this.dni = dni;
        this.peso = peso;
        this.prioridad = prioridad;
    }

    public int getNumeroPaquete() {
        return numeroPaquete;
    }

    public String getDni() {
        return dni;
    }
    public double getPeso() {
        return peso;
    }

    public int getPrioridad() {
        return prioridad;
    }

    @Override
    public String toString() {
        return "Paquete{" + "numeroPaquete=" + numeroPaquete + ", dni=" + dni + ", peso=" + peso + ", prioridad=" + prioridad + '}';
    }
    
}
