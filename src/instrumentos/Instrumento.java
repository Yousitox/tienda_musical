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

    public boolean getSinStock() {
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
        this.fechaFabricacion = LocalDate.of(2015, 10, 5);
        stock++;
    }

    // constructor con todos los valores
    public Instrumento(Marca marcas, double precio, String modelo, String dniComprador, String nombreComprador,
            LocalDate fechaCompra, LocalDate fechaFabricacion) {
        this.marcas = marcas;
        this.precio = precio;
        this.modelo = modelo;
        this.dniComprador = dniComprador;
        this.nombreComprador = nombreComprador;
        this.fechaCompra = fechaCompra;
        this.fechaFabricacion = fechaFabricacion;
        stock++;
    }

    public Instrumento(Marca marcas, double precio, String modelo,  LocalDate fechaFabricacion) {
        this.marcas = marcas;
        this.precio = precio;
        this.modelo = modelo;
        this.fechaFabricacion = fechaFabricacion;
        stock++;
    }

    //toString sirve para consultar la informacion mas basica
    //ya que el getInfo obtine la informacion de todo
    //y al no ver informacion pone null y son datos que el 
    //usuario no necesita, a no ser que este compre la guitarra o bateria
    //el cual va dentro de una cadenade texto y no fuera
    //para que pueda funcionar
    @Override
    public String toString() {
        return "\nPrecio: " + precio + "\nModelo: " + modelo + "\nFecha de Fabricacion: " + fechaFabricacion
                + "\nMarca: " + marcas + "\nStock: " + getStock();
    }

    // funcion para optener la informacion
    public void getInfo() {
        System.out.println("Modelo: " + this.modelo + "\nPrecio: " + this.precio + "\nDni del comprador: "
                + this.dniComprador + "\nNombre del comprador: " + this.nombreComprador + "\nFecha de compra: "
                + this.fechaCompra + "\nFecha de fabricacion: " + this.fechaFabricacion + "\nStock: " + stock);
    }

    // funcion para obtener los años desde la fabricacion
    // lo que hace el until es restar la fecha de fabricacion a la fecha actual
    // y con el getYears se obtiene los años
    public void getAnyos(){
        System.out.println("Años desde la fabricacion: " + fechaFabricacion.until(LocalDate.now()).getYears());
    }

    //funcion para saber si esta disponible (si no a sido comprada)
    public void estaDisponible(){
        if (this.fechaCompra == null) {
            this.sinStock = true;
            System.out.println(getSinStock());
        } else {
            this.sinStock = false;
            System.out.println(getSinStock());
        }
    }

    //Funcion para saber si el dni es correcto devolviendo un true o false
    public void esDniValido(String dni) {
    }


}
