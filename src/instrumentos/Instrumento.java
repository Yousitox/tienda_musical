package instrumentos;

import java.time.LocalDate;

enum Marca {
    Perro_Sanchez_Music, La_Gallina_De_Oro, Feijo_Old_Clasic
};

public class Instrumento {
    // Las variables
    private double precio;



    private String modelo;
    private String dniComprador;
    private String nombreComprador;
    private LocalDate fechaCompra;
    private LocalDate fechaFabricacion;
    private static int stock = 0;
    private boolean sinStock;

    // marcas del enum
/*     private Marca marca1;
    private Marca marca2;
    private Marca marca3;
    {
    marca1 = Marca.Perro_Sanchez_Music;
    marca2 = Marca.La_Gallina_De_Oro;
    marca3 = Marca.Feijo_Old_Clasic;
    } */

    

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

    public boolean isSinStock() {
        return sinStock;
    }

    public void setSinStock(boolean sinStock) {
        this.sinStock = sinStock;
    }

    // constructor con valores por defecto
    public Instrumento() {
        this.precio = 1300;
        this.modelo = "GuitarraLite";
        this.dniComprador = "Sin Dni por defecto";
        this.nombreComprador = "Sin nombre por defecto";
        this.fechaCompra = LocalDate.now();
        this.fechaFabricacion = LocalDate.of(2015, 10, 5);
        if (stock == 0) {
            this.sinStock = true;

        } else {
            this.sinStock = false;
        }
    }

    // constructor que inicializa valores dados por el usuario
    public Instrumento(/* Marca marcas, */ double precio, String modelo, String dniComprador, String nombreComprador, LocalDate fechaCompra,
            LocalDate fechaFabricacion) {
/*         this.marca1 = marcas;
        this.marca2 = marcas; */
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


    //toString
    @Override
    public String toString() {
        return "Instrumento, modelo: " + modelo + "\nFechaFabricacion " + fechaFabricacion
                + "\nMarca: " /* + marca1 + marca2 + marca3 */;
    }

    

    // funcion para optener la informacion
    public void getInfo() {
        System.out.println("Modelo: " + this.modelo + "\nPrecio: " + this.precio + "\nDni del comprador: "
                + this.dniComprador + "\nNombre del comprador: " + this.nombreComprador + "\nFecha de compra: "
                + this.fechaCompra + "\nFecha de fabricacion: " + this.fechaFabricacion + "\nStock: " + stock
                + "\nSin stock: " + this.sinStock);
    }

}
