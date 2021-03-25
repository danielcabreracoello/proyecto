package proyecto;

import java.util.Arrays;

public class Sucursal {

    //Atributos
    private Paquete[] paquetes;

    //Constructores
    public Sucursal() {
        this.paquetes = new Paquete[10];
    }

    public Sucursal(int tamanio) {
        this.paquetes = new Paquete[tamanio];
    }

    public void anadirPaquete(Paquete c) {

        if (existePaquete(c)) {
            System.out.println("El contacto existe");
        } else {

            boolean encontrado = false;
            for (int i = 0; i < paquetes.length && !encontrado; i++) {
                if (paquetes[i] == null) {
                    paquetes[i] = c;
                    encontrado = true;
                }
            }

            if (encontrado) {
                System.out.println("Se ha añadido");
            } else {
                System.out.println("No se ha podido añadir");
            }
        }

    }

    public boolean existePaquete(Paquete c) {

        for (int i = 0; i < paquetes.length; i++) {

            if (paquetes[i] != null && c.equals(paquetes[i])) {
                return true;
            }
        }
        return false;

    }

    public void listarPaquete() {
        for (int i = 0; i < paquetes.length; i++) {
            if (paquetes[i] != null) {
                System.out.println(paquetes[i]);
            }
        }

    }

    public void buscarPorNombre(String nombre) {

        boolean encontrado = false;
        for (int i = 0; i < paquetes.length && !encontrado; i++) {
            if (paquetes[i] != null && paquetes[i].getNombre().trim().equalsIgnoreCase(nombre.trim())) {
                System.out.println("Su número de paquete es " + paquetes[i].getnPaquete());
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No se ha encontrado el contacto");
        }

    }

    public void eliminarPaquete(Paquete c) {
        boolean encontrado = false;
        for (int i = 0; i < paquetes.length && !encontrado; i++) {
            if (paquetes[i] != null && paquetes[i].equals(c)) {
                paquetes[i] = null;
                encontrado = true;
            }
        }

        if (encontrado) {
            System.out.println("Se ha eliminado el paquete");
        } else {
            System.out.println("No se ha eliminado el paquete");

        }

    }

    public void ordernarPaquete() {
       
    }
    

}
