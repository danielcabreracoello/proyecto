package proyecto;

import java.util.Comparator;

public class Paquete implements Comparable<Paquete> {

    String nombre;
    private int nPaquete;

    public Paquete(String nombre, int paquete) {
        this.nombre = nombre;
        this.nPaquete = paquete;
    }

    public Paquete(String nombre) {
        this.nombre = nombre;
        this.nPaquete = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getnPaquete() {
        return nPaquete;
    }

    public void setnPaquete(int paquete) {
        this.nPaquete = paquete;
    }

    public boolean equals(Paquete c) {

        if (this.nombre.trim().equalsIgnoreCase(c.getNombre().trim())) {
            return true;
        }

        return false;

    }

    @Override
    public int compareTo(Paquete o) {
        if(nPaquete < o.nPaquete){
            return -1;
        }if(nPaquete > o.nPaquete){
            return 1;
        }
        return 0;
            
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", NumeroDePaquete=" + nPaquete;
    }

}
