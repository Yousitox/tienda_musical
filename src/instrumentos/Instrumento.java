package instrumentos;

import java.time.LocalDate;

public class Instrumento {
    private double precio;
    private enum marca{GuitarraLite, GuitarraLiteGold, BateriaGold6};
    private String modelo;
    private String dniComprador;
    private String nombreComprador;
    private LocalDate fechaCompra;
    private LocalDate fechaFabricacion;
    private int stock;
    private boolean sinStock;
     
}
