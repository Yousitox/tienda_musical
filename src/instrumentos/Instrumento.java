package instrumentos;

import java.time.LocalDate;

public class Instrumento {
    // Las variables
    private double precio;

    private enum marca {
        GuitarraLite, GuitarraLiteGold, BateriaGold6
    };

    private String modelo;
    private String dniComprador;
    private String nombreComprador;
    private LocalDate fechaCompra;
    private LocalDate fechaFabricacion;
    private int stock;
    private boolean sinStock;

    // marcas del enum
    private marca GuitarraLite = marca.GuitarraLite;
    private marca GuitarraLiteGold = marca.GuitarraLiteGold;
    private marca BateriaGold6 = marca.BateriaGold6;

    // Todos los guetter y setter
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getDniComprador() {
        return dniComprador;
    }

    public void setDniComprador(String dniComprador) {
        this.dniComprador = dniComprador;
    }

    public String getNombreComprador() {
        return nombreComprador;
    }

    public void setNombreComprador(String nombreComprador) {
        this.nombreComprador = nombreComprador;
    }

    public LocalDate getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(LocalDate fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public LocalDate getFechaFabricacion() {
        return fechaFabricacion;
    }

    public void setFechaFabricacion(LocalDate fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public boolean isSinStock() {
        return sinStock;
    }

    public void setSinStock(boolean sinStock) {
        this.sinStock = sinStock;
    }

    // constructor con valores por defecto
    public Instrumento() {
        this.precio = 300;
        this.modelo = "Modelo por defecto";
        this.dniComprador = "Sin Dni por defecto";
        this.nombreComprador = "Sin nombre por defecto";
        this.fechaCompra = LocalDate.now();
        this.fechaFabricacion = LocalDate.of(2005, 10, 5);
        this.stock = 0;
        if (stock == 0) {
            this.sinStock = true;

        } else {
            this.sinStock = false;
        }
    }

    // constructor que inicializa valores dados por el usuario
    public Instrumento(double precio, String modelo, String dniComprador, String nombreComprador, LocalDate fechaCompra,
            LocalDate fechaFabricacion) {
        GuitarraLite.name();
        this.precio = precio;
        this.modelo = modelo;
        this.dniComprador = dniComprador;
        this.nombreComprador = nombreComprador;
        this.fechaCompra = LocalDate.now();
        this.fechaFabricacion = fechaFabricacion;
        stock++;
        if (stock == 0) {
            this.sinStock = true;

        } else {
            this.sinStock = false;
        }
    }

    // funcion para optener la informacion
    public void getInfo() {
        System.out.println("Modelo: " + this.modelo + "\nPrecio: " + this.precio + "\nDni del comprador: "
                + this.dniComprador + "\nNombre del comprador: " + this.nombreComprador + "\nFecha de compra: "
                + this.fechaCompra + "\nFecha de fabricacion: " + this.fechaFabricacion + "\nStock: " + this.stock
                + "\nSin stock: " + this.sinStock);
    }

}
