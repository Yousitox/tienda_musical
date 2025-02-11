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
                    tienda.menuCompra();
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
        Instrumento instrumento2 = new Instrumento(Marca.LA_GALLINA_DE_ORO, 1800, "Guitarra_Gold",
                LocalDate.of(2012, 02, 12));
        //
        Instrumento instrumento3 = new Instrumento(Marca.PERRO_SANCHEZ_MUSIC, 2800, "Bateria_Bronce",
                LocalDate.of(2023, 01, 31));
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
            // try/catch para evitar errores
            try {
                elecInfo = scaner.nextInt();
                if (elecInfo == 0) {
                    System.out.println("Regresando al menu principal");
                    break;
                }
            } catch (InputMismatchException e) {
                scaner.next();
            }
            // switch para la eleccion del usuario
            switch (elecInfo) {
                // casos para la informacion de los instrumentos
                // caso 1 guitarra por defecto
                case 1:
                    System.out.println("--------------------");
                    System.out.println(
                            "Esta Guitarra es el de por defecto perfecto para empezar\n" + instrumento.toString());
                    System.out.println("Esta disponible?");
                    instrumento.estaDisponible();
                    System.out.println("Y tiene estos años de antiguedad:");
                    instrumento.getAnyos();
                    System.out.println("--------------------");
                    break;
                // caso 2 guitarra marca LA_GALLINA_DE_ORO
                case 2:
                    System.out.println("--------------------");
                    System.out.println(
                            "Esta Guitarra es muy buena para gente mas experimentada\n" + instrumento2.toString());
                    System.out.println("Esta disponible?");
                    instrumento2.estaDisponible();
                    System.out.println("Y tiene estos años de antiguedad:");
                    instrumento2.getAnyos();
                    System.out.println("--------------------");
                    break;
                // caso 3 bateria marca PERRO_SANCHEZ_MUSIC
                case 3:
                    System.out.println("--------------------");
                    System.out.println("Esta Bateria es muy buena para gente mas novata\n" + instrumento3.toString());
                    System.out.println("Esta disponible?");
                    instrumento3.estaDisponible();
                    System.out.println("Y tiene estos años de antiguedad:");
                    instrumento3.getAnyos();
                    System.out.println("--------------------");
                    break;
                // caso 4 bateria marca FEIJO_OLD_CLASIC
                case 4:
                    System.out.println("--------------------");
                    System.out.println(
                            "Esta Bateria es muy buena para gente mas experimentada\n" + instrumento4.toString());
                    System.out.println("Esta disponible?");
                    instrumento4.estaDisponible();
                    System.out.println("Y tiene estos años de antiguedad:");
                    instrumento4.getAnyos();
                    System.out.println("--------------------");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (true);
    }

    private void menuCompra() {
        // variable para el escaner
        int elecCompra = 10;
        // do/while para el menu de compra
        do {
            System.out.println("Elije una opcion para comprar");
            System.out.println("1.-Guitarra por defecto");
            System.out.println("2.-Guitarra marca " + Marca.LA_GALLINA_DE_ORO);
            System.out.println("3.-Bateria marca " + Marca.PERRO_SANCHEZ_MUSIC);
            System.out.println("4.-Bateria marca " + Marca.FEIJO_OLD_CLASIC);
            System.out.println("0.-Salir");

            try {
                elecCompra = scaner.nextInt();
                if (elecCompra == 0) {
                    System.out.println("Espero que regresas pronto");
                    break;
                }
            } catch (InputMismatchException e) {
                scaner.next();
            }

            Instrumento comprar = null;
            switch (elecCompra) {
                case 1:
                    comprar = new Instrumento();
                    break;
                case 2:
                    comprar = new Instrumento(Marca.LA_GALLINA_DE_ORO, 1800, "Guitarra_Gold", null, null, null,
                            LocalDate.of(2012, 02, 12));
                    break;
                case 3:
                    comprar = new Instrumento(Marca.PERRO_SANCHEZ_MUSIC, 2800, "Bateria_Bronce", null, null, null,
                            LocalDate.of(2023, 01, 31));
                    break;
                case 4:
                    comprar = new Instrumento(Marca.FEIJO_OLD_CLASIC, 3800, "Bateria_Clasica", null, null, null,
                            LocalDate.of(2022, 12, 1));
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }

            if (comprar != null) {
                System.out.println("Introduce tu DNI");
                scaner.nextLine();
                String texto = scaner.nextLine();
                System.out.println("Introduce tu nombre");
                String texto2 = scaner.nextLine();
                comprar.comprar(texto, texto2, LocalDate.now());

                // Muestra la información de la guitarra comprada
                if (comprar.getDniComprador().equals(texto)) {
                    System.out.println("Información de la guitarra comprada:");
                    comprar.getInfo();
                }
            }
        } while (true);
    }
}
