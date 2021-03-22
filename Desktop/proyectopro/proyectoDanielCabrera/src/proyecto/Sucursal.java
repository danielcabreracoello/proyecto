package proyecto;

public class Sucursal {
    private int numeroSucursal;
    private String direccion;
    private String ciudad;

    public Sucursal(int numeroSucursal, String dirrecion, String ciudad) {
        this.numeroSucursal = numeroSucursal;
        this.direccion = dirrecion;
        this.ciudad = ciudad;
    }

    public int getNumeroSucursal() {
        return numeroSucursal;
    }

    public String getDirrecion() {
        return direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String mostrarDatosSucursal() {
        return "\nNumero sucursal: " + numeroSucursal
                + "\nDirrecion: " + direccion
                + "\nCiudad: " + ciudad;
    }

    public double calcular_precio(Paquete t) {
        double precio;
        precio = t.getPeso();
        if (t.getPrioridad() == 1) {
            precio = precio + 10;
        } else if (t.getPrioridad() == 2) {
            precio = precio + 20;
        }
        return precio;
    }
}
