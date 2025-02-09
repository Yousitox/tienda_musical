package tienda;

import java.time.LocalDate;

//importamos el paquete instrumentos webinfo(https://www.forosdelweb.com/f45/enlazar-dos-ficheros-java-401230/)
import instrumentos.Instrumento;

public class Tienda_Main {
    public static void main(String[] args) {
        System.out.println("Tienfa");
        //valores por defecto
        Instrumento instrumento = new Instrumento();
        instrumento.getInfo();
        //valores por unsuario
        Instrumento instrumento2 = new Instrumento(800, "Guitarra", "12345678A", "Juan", null, LocalDate.of(2022, 12, 1));
        instrumento2.getInfo();
        Instrumento instrumento3 = new Instrumento(900, "Guitarra2", "12445678A", "Luan", null, LocalDate.of(2024, 2, 5));
        instrumento3.getInfo();
    }
}
