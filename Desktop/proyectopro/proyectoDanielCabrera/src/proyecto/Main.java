package proyecto;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        boolean salir = false;
        int opcion;

        Sucursal sucursalPaquete = new Sucursal(100);
        String nombre;
        int nPaquete;

        Paquete c;

        while (!salir) {

            System.out.println("1. Añadir paquete");
            System.out.println("2. Listar paquetes");
            System.out.println("3. Buscar paquete");
            System.out.println("4. Eliminar paquete");
            System.out.println("5. Ordenar paquete");//No me sale este metodo, si me lo puedes explicar, ya he visto en el libro pero no lo puedo implemetar y estoy bloqueado.
            System.out.println("6. Guardar paquete");//No funciona
            System.out.println("7. Cargar paquete");//No funciona
            System.out.println("8. Salir");

            System.out.println("Escribe una de las opciones");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:

                    System.out.println("Escribe un nombre: ");
                    nombre = entrada.next();

                    System.out.println("Escribe un numero de paquete: ");
                    nPaquete = entrada.nextInt();

                    c = new Paquete(nombre, nPaquete);

                    sucursalPaquete.anadirPaquete(c);

                    break;
                case 2:

                    sucursalPaquete.listarPaquete();
                    break;
                case 3:

                    System.out.println("Escribe un nombre");
                    nombre = entrada.next();

                    sucursalPaquete.buscarPorNombre(nombre);

                    break;
                case 4:

                    System.out.println("Escribe un nombre");
                    nombre = entrada.next();

                    c = new Paquete(nombre, 0);

                    sucursalPaquete.eliminarPaquete(c);

                    break;
                case 5:

                    sucursalPaquete.ordernarPaquete();
                    break;
                case 6:

                    
                    break;
                case 7:

                    
                    break;
                case 8:
                    salir = true;
                    break;
                default:
                    System.out.println("Solo números entre 1 y 8");
            }

        }

    }

}
