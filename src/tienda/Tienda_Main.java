package tienda;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.time.LocalDate;

//importamos el paquete instrumentos webinfo(https://www.forosdelweb.com/f45/enlazar-dos-ficheros-java-401230/)
import instrumentos.Instrumento;
import instrumentos.Instrumento.Marca;

public class Tienda_Main {
    // el escaner
    static Scanner scaner = new Scanner(System.in);

    public static void main(String[] args) {
        // instanciamos la clase Tienda_Main para poder acceder a sus funciones no
        // estaticas
        Tienda_Main tienda = new Tienda_Main();

        // variable para el escanar
        int elec = 10;
        // do/while para el menu de la tienda
        do {
            System.out.println("Tienda----Menu");
            System.out.println("1.-Comprar");
            System.out.println("2.-Informacion");
            System.out.println("0.-Salir");

            try {
                elec = scaner.nextInt();
                if (elec == 0) {
                    System.out.println("Espero que regresas pronto");
                    break;
                }
            } catch (InputMismatchException e) {
                scaner.next();
            }

            switch (elec) {
                case 1:

                    break;
                case 2:
                    tienda.menuInfo();
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (true);
    }

    // menu de informacion de instrumentos
    private void menuInfo() {
        //
        Instrumento instrumento = new Instrumento();
        //
        Instrumento instrumento3 = new Instrumento(Marca.PERRO_SANCHEZ_MUSIC, 2800, "Bateria_Bronce",
        LocalDate.of(2023, 01, 31));
        //
        Instrumento instrumento2 = new Instrumento(Marca.LA_GALLINA_DE_ORO, 1800, "Guitarra_Gold",
        LocalDate.of(2012, 02, 12));
        //
        Instrumento instrumento4 = new Instrumento(Marca.FEIJO_OLD_CLASIC, 3800, "Bateria_Clasica",
        LocalDate.of(2022, 12, 1));
        // variable para el escanar
        int elecInfo = 10;
        // do/while para el menu de informacion
        do {
            System.out.println("1.-Guitarra por defecto");
            System.out.println("2.-Guitarra marca " + Marca.LA_GALLINA_DE_ORO);
            System.out.println("3.-Bateria marca " + Marca.PERRO_SANCHEZ_MUSIC);
            System.out.println("4.-Bateria marca " + Marca.FEIJO_OLD_CLASIC);
            System.out.println("0.-Salir");
            //try/catch para evitar errores
            try {
                elecInfo = scaner.nextInt();
                if (elecInfo == 0) {
                    System.out.println("Espero que regresas pronto");
                    break;
                }
            } catch (InputMismatchException e) {
                scaner.next();
            }
            //switch para la eleccion del usuario
            switch (elecInfo) {
                //casos para la informacion de los instrumentos
                //caso 1 guitarra por defecto
                case 1:
                    System.out.println("Esta Guitarra es el de por defecto perfecto para empezar");
                    instrumento.getInfo();
                    break;
                //caso 2 guitarra marca LA_GALLINA_DE_ORO
                case 2:
                    System.out.println("Esta Guitarra es muy buena para gente mas experimentada");
                    instrumento2.getInfo();
                    break;
                //caso 3 bateria marca PERRO_SANCHEZ_MUSIC
                case 3:
                    System.out.println("Esta Bateria es muy buena para gente mas novata");
                    instrumento3.getInfo();
                    break;
                //caso 4 bateria marca FEIJO_OLD_CLASIC
                case 4:
                    System.out.println("Esta Bateria es muy buena para gente mas experimentada");
                    instrumento4.getInfo();
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (true);
    }

    /*
     * private void intrumentoDefecto() {
     * // valores por defecto
     * Instrumento instrumento = new Instrumento();
     * instrumento.getInfo();
     * // con el toString
     * System.out.println(instrumento.toString());
     * }
     */
}
