package tienda;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.time.LocalDate;

//importamos el paquete instrumentos webinfo(https://www.forosdelweb.com/f45/enlazar-dos-ficheros-java-401230/)
import instrumentos.Instrumento;
import instrumentos.Instrumento.Marca;
import instrumentos.Instrumento.Bateria;
import instrumentos.Instrumento.Guitarra;

public class Tienda_Main {
    // el escaner
    static Scanner scaner = new Scanner(System.in);

    
    /** 
     * @param args
     */
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
        Instrumento instrumento = new Guitarra();
        //
        Instrumento instrumento2 = new Guitarra(Marca.LA_GALLINA_DE_ORO, 1800, "Guitarra_Gold",
                LocalDate.of(2012, 02, 12));
        //
        Instrumento instrumento3 = new Bateria(Marca.PERRO_SANCHEZ_MUSIC, 2800, "Bateria_Bronce",
                LocalDate.of(2023, 01, 31));
        //
        Instrumento instrumento4 = new Bateria(Marca.FEIJO_OLD_CLASIC, 3800, "Bateria_Clasica",
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
                    System.out.println("Suena asi: ");
                    instrumento.tocar();
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
                    System.out.println("Suena asi: ");
                    instrumento2.tocar();
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
                    System.out.println("Suena asi: ");
                    instrumento3.tocar();
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
                    System.out.println("Suena asi: ");
                    instrumento4.tocar();
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
                    System.out.println("Regresando al menu principal");
                    break;
                }
            } catch (InputMismatchException e) {
                scaner.next();
            }

            switch (elecCompra) {
                case 1:
                    Instrumento comprar = new Guitarra();

                    /*
                     * Si el objeto comprar no es nulo, se podra comprar el producto
                     * pidiendole despues el dni y el nombre
                     */
                    if (comprar != null) {
                        System.out.println("Introduce tu DNI");
                        scaner.nextLine();
                        String dni = scaner.nextLine();
                        System.out.println("Introduce tu nombre");
                        String nombre = scaner.nextLine();
                        comprar.comprar(dni, nombre, LocalDate.now());

                        /*
                         * Muestra la información de la guitarra comprada
                         * ademas el if obtiene el dni añadido por el comprador
                         * y este lo compara con el añadido por el comprador
                         * para saber si es igual y despues muestra la informacion
                         * de la guitarra comprada
                         * ---------
                         * this.dniComprador = dni;
                         * en esa parte, de la clase instrumento,
                         * en la funcion comprar, el dni añadido en el scaner
                         * pasa a la variable dniComprador, entonces
                         * cuando el if va a verificiar si el dni añadido
                         * es igual al dniComprador, si es igual y muestra la informacion
                         */
                        if (comprar.getDniComprador().equals(dni)) {
                            System.out.println("--------------------");
                            System.out.println("Información de la guitarra comprada:");
                            comprar.getInfo();
                            System.out.println("--------------------");
                        }
                    }
                    break;
                case 2:
                    Instrumento comprar1 = new Guitarra(Marca.LA_GALLINA_DE_ORO, 1800, "Guitarra_Gold", null, null,
                            null,
                            LocalDate.of(2012, 02, 12));

                    if (comprar1 != null) {
                        System.out.println("Introduce tu DNI");
                        scaner.nextLine();
                        String dni = scaner.nextLine();
                        System.out.println("Introduce tu nombre");
                        String nombre = scaner.nextLine();
                        comprar1.comprar(dni, nombre, LocalDate.now());

                        if (comprar1.getDniComprador().equals(dni)) {
                            System.out.println("--------------------");
                            System.out.println("Información de la guitarra comprada:");
                            comprar1.getInfo();
                            System.out.println("--------------------");
                        }
                    }
                    break;
                case 3:
                    Instrumento comprar2 = new Bateria(Marca.PERRO_SANCHEZ_MUSIC, 2800, "Bateria_Bronce", null,
                            null, null,
                            LocalDate.of(2023, 01, 31));
                    if (comprar2 != null) {
                        System.out.println("Introduce tu DNI");
                        scaner.nextLine();
                        String dni = scaner.nextLine();
                        System.out.println("Introduce tu nombre");
                        String nombre = scaner.nextLine();
                        comprar2.comprar(dni, nombre, LocalDate.now());

                        if (comprar2.getDniComprador().equals(dni)) {
                            System.out.println("--------------------");
                            System.out.println("Información de la guitarra comprada:");
                            comprar2.getInfo();
                            System.out.println("--------------------");
                        }
                    }
                    break;
                case 4:
                    Instrumento comprar3 = new Bateria(Marca.FEIJO_OLD_CLASIC, 3800, "Bateria_Clasica", null, null,
                            null,
                            LocalDate.of(2022, 12, 1));
                    if (comprar3 != null) {
                        System.out.println("Introduce tu DNI");
                        scaner.nextLine();
                        String dni = scaner.nextLine();
                        System.out.println("Introduce tu nombre");
                        String nombre = scaner.nextLine();
                        comprar3.comprar(dni, nombre, LocalDate.now());

                        if (comprar3.getDniComprador().equals(dni)) {
                            System.out.println("--------------------");
                            System.out.println("Información de la guitarra comprada:");
                            comprar3.getInfo();
                            System.out.println("--------------------");
                        }
                    }
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (true);
    }
}
