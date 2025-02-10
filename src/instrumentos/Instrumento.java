package instrumentos;

import java.time.LocalDate;

public class Instrumento {
    public enum Marca {
        PERRO_SANCHEZ_MUSIC, LA_GALLINA_DE_ORO, FEIJO_OLD_CLASIC
    };

    // Las variables
    private double precio;
    private String modelo;
    private String dniComprador;
    private String nombreComprador;
    private LocalDate fechaCompra;
    private LocalDate fechaFabricacion;
    private static int stock = 0;
    private boolean sinStock;
    private Marca marcas;

    // Todos los guetter y setter
    public Marca getMarcas() {
        return marcas;
    }

    public void setMarcas(Marca marcas) {
        this.marcas = marcas;
    }

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

    public boolean isSinStock() {
        return sinStock;
    }

    public void setSinStock(boolean sinStock) {
        this.sinStock = sinStock;
    }

    // constructor con valores por defecto
    public Instrumento() {
        this.marcas = Marca.PERRO_SANCHEZ_MUSIC;
        this.precio = 1300;
        this.modelo = "GuitarraLite";
        this.dniComprador = "Sin Dni por defecto";
        this.nombreComprador = "Sin nombre por defecto";
        this.fechaCompra = null;
        this.fechaFabricacion = LocalDate.of(2015, 10, 5);
        stock++;
        if (stock == 0) {
            this.sinStock = true;

        } else {
            this.sinStock = false;
        }
    }

    // constructor que inicializa valores dados por el usuario
    public Instrumento(Marca marcas, double precio, String modelo, String dniComprador, String nombreComprador,
            LocalDate fechaCompra,
            LocalDate fechaFabricacion) {
        this.marcas = marcas;
        this.precio = precio;
        this.modelo = modelo;
        this.dniComprador = dniComprador;
        this.nombreComprador = nombreComprador;
        this.fechaCompra = fechaCompra;
        this.fechaFabricacion = fechaFabricacion;
        stock++;
        if (stock == 0) {
            this.sinStock = true;

        } else {
            this.sinStock = false;
        }
    }

    // toString
    @Override
    public String toString() {
        return "Instrumento, modelo: " + modelo + "\nFechaFabricacion " + fechaFabricacion
                + "\nMarca: " + marcas;
    }

    // funcion para optener la informacion
    public void getInfo() {
        System.out.println("Modelo: " + this.modelo + "\nPrecio: " + this.precio + "\nDni del comprador: "
                + this.dniComprador + "\nNombre del comprador: " + this.nombreComprador + "\nFecha de compra: "
                + this.fechaCompra + "\nFecha de fabricacion: " + this.fechaFabricacion + "\nStock: " + stock
                + "\nSin stock: " + this.sinStock);
    }

}
