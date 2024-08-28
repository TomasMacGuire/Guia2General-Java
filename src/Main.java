import models.Autor;
import models.Factura;
import models.Libro;

import java.time.chrono.ChronoLocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner ingreso = new Scanner(System.in);
        int opcion = -1;
        while (opcion != 27) {
            menu();
            opcion = ingreso.nextInt();
            switch (opcion) {
                case 1:
                    ej1();
                    break;
                case 2:
                    ej2();
                    break;
            }

        }
    }

    private static void menu() {
        System.out.println("\nIngrese una opcion");
        System.out.println("1 - EJERCICIO 1");
        System.out.println("2 - EJERCICIO 2");
        System.out.println("\n0 para salir...\n");
    }

    private static void ej1() {
        Autor a = new Autor()
                .name("Joshua")
                .lastName("Blonch")
                .email("joshua@email.com")
                .genero('M');

        a.imprimir();
        System.out.printf("\n");

        Libro l = new Libro()
                .titulo("Effective Java")
                .precio(450)
                .stock(150)
                .autor(a);

        l.imprimir();
        System.out.printf("\n");

        l.setPrecio(500);
        l.setStock(50);

        l.imprimir();
        l.getAutor().imprimir();

        l.frase();
    }

    private static void ej2(){
        Factura f = new Factura();

        f.toString();
    }
}