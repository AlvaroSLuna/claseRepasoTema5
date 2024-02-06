package tiendaMascotas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        TiendaMascotas tiendaMascotas = new TiendaMascotas(7);
        Scanner sc = new Scanner(System.in);

        tiendaMascotas.agregarMascota("Lucía", 5, "Perro");
        tiendaMascotas.agregarMascota("Luis", 2, "Pez");
        tiendaMascotas.agregarMascota("Tana", 5, "Delfin");

        tiendaMascotas.venderMascota("Luis");

        tiendaMascotas.mostrarInventario();

        int op =0;
        do {
            System.out.println("Esta es la tienda Per&Co elige una opción: ");
            System.out.println("1. Añade una mascota nueva: ");
            System.out.println("2. Vender Mascota");
            System.out.println("3. Mostrar Lista");
            System.out.println("4. Salida");
            op=sc.nextInt();

            switch (op){
                case 1:
                    System.out.println("Dinos todo de tu mascota!");
                    System.out.println("Introduce el nombre: ");
                    sc.next();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
            }
        }while(op!=4);

    }
}