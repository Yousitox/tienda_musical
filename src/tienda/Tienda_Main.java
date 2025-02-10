package tienda;

import java.util.Scanner;
import java.time.LocalDate;

//importamos el paquete instrumentos webinfo(https://www.forosdelweb.com/f45/enlazar-dos-ficheros-java-401230/)
import instrumentos.Instrumento;

public class Tienda_Main {
    public static void main(String[] args) {
        Tienda_Main tienda = new Tienda_Main();
        do {
            Scanner scaner = new Scanner(System.in);
            System.out.println("Tienda----Menu");
            System.out.println("1.-Comprar");
            System.out.println("2.-Informacion");
            System.out.println("0.-Salir");

            switch (scaner.nextInt()) {
                case 1:

                    break;
                case 2:
                    tienda.menuInfo();
                    break;

                default:
                    break;
            }
        } while (true);

/*         // valores por unsuario
        Instrumento instrumento2 = new Instrumento(1800, "Guitarra_Gold", "12345678A", "Juan", null,
                LocalDate.of(2022, 12, 1));
        instrumento2.getInfo();
        Instrumento instrumento3 = new Instrumento(1000, "Baterria Clasic", "12445678A", "Luan", null,
                LocalDate.of(2024, 2, 5));
        instrumento3.getInfo(); */
    }

    private void menuInfo() {
        do {
            Scanner scaner = new Scanner(System.in);
            System.out.println("1.-Instrumento por defecto");
            System.out.println("2.-Instrumento");
            System.out.println("0.-Salir");
            switch (scaner.nextInt()) {
                case 1:
                    intrumentoDefecto();
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                default:
                    break;
            }
        } while (true);
    }

    private void intrumentoDefecto() {
        // valores por defecto
        Instrumento instrumento = new Instrumento();
        instrumento.getInfo();
        // con el toString
        System.out.println(instrumento.toString());
    }
}
