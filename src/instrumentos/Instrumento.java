package instrumentos;

import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
 * una clase abstracta es una clase restringida 
 * en la cual no se puede usar para crear objetos
 * para acceder debe ser desde otra clase, una clase hija
 * (https://www.w3schools.com/java/java_abstract.asp)
 */
public abstract class Instrumento {
    public enum Marca {
        PERRO_SANCHEZ_MUSIC, LA_GALLINA_DE_ORO, FEIJO_OLD_CLASIC
    };

    private static int stock = 0;

    public static int getStock() {
        return stock;
    }

    // Las variables
    private double precio;
    private String modelo;
    private String dniComprador;
    private String nombreComprador;
    private LocalDate fechaCompra;
    private LocalDate fechaFabricacion;

    private boolean sinStock;

    private Marca marcas;

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

    public Instrumento(Marca marcas, double precio, String modelo, LocalDate fechaFabricacion) {
        this.marcas = marcas;
        this.precio = precio;
        this.modelo = modelo;
        this.fechaFabricacion = fechaFabricacion;
        stock++;
    }

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

    public boolean getSinStock() {
        return sinStock;
    }

    public void setSinStock(boolean sinStock) {
        this.sinStock = sinStock;
    }

    // toString sirve para consultar la informacion mas basica
    // ya que el getInfo obtine la informacion de todo
    // y al no ver informacion pone null y son datos que el
    // usuario no necesita, a no ser que este compre la guitarra o bateria
    // el cual va dentro de una cadenade texto y no fuera
    // para que pueda funcionar
    @Override
    public String toString() {
        return "\nPrecio: " + precio + "\nModelo: " + modelo + "\nFecha de Fabricacion: " + fechaFabricacion
                + "\nMarca: " + marcas + "\nStock: " + getStock();
    }

    // funcion para optener la informacion
    public void getInfo() {
        System.out.println(
                "Modelo: " + this.modelo + "\nMarca: " + marcas + "\nPrecio: " + this.precio + "\nDni del comprador: "
                        + this.dniComprador + "\nNombre del comprador: " + this.nombreComprador + "\nFecha de compra: "
                        + this.fechaCompra + "\nFecha de fabricacion: " + this.fechaFabricacion);
    }

    // funcion para obtener los años desde la fabricacion
    // lo que hace el until es restar la fecha de fabricacion a la fecha actual
    // y con el getYears se obtiene los años
    public void getAnyos() {
        System.out.println("Años desde la fabricacion: " + fechaFabricacion.until(LocalDate.now()).getYears());
    }

    // funcion para saber si esta disponible (si no a sido comprada)
    public void estaDisponible() {
        if (this.fechaCompra == null) {
            this.sinStock = true;
            System.out.println(getSinStock());
        } else {
            this.sinStock = false;
            System.out.println(getSinStock());
        }
    }

    // Funcion para saber si el dni es correcto devolviendo un true o false
    //(https://www.programacionenjava.com/blog/2008/04/03/javabasico/algoritmo-de-comprobacion-de-dni-valido/)
    //(https://es.stackoverflow.com/questions/341564/validar-dni-en-java)
    public boolean esDniValido(String dni) {
        Pattern dniPattern = Pattern.compile("[0-9]{7,8}[A-Z a-z]");
        Matcher m = dniPattern.matcher(dni);
        if (m.matches()) {
            return true;
        } else
            return false;
    }

    // Funcion para comprar
    public void comprar(String dni, String nombreComprador, LocalDate fechaCompra) {
        if (esDniValido(dni)) {
            this.dniComprador = dni;
            this.nombreComprador = nombreComprador;
            this.fechaCompra = fechaCompra;
            System.out.println("Compra realizada con éxito.");
        } else {
            System.out.println("DNI no válido. Compra no realizada.");
        }
    }

    /*
     * un metodo abstacto solo se puede usar
     * en una clase abstracta y no tiene cuerpo
     * el cuerpo de le proporciona en las clases hijas
     */
    public abstract void tocar();

    // declaramos la calase hija guitarra
    /*
     * las clases hijas deben se estaticas
     * ya que estan dentro de una clase abstracta
     * y dentro de la clase padre
     * asi podran crear instancias de la clase hija
     */
    public static class Guitarra extends Instrumento {
        private String tipo = "Electrica";
        private int numeroCuerdas = 6;

        // getters y setters
        public String getTipo() {
            return tipo;
        }

        public int getNumeroCuerdas() {
            return numeroCuerdas;
        }

        public Guitarra() {
            /*
             * Super es una palabra de java que se usa para acceder
             * a los constructores de la clase padre
             * (https://www.datacamp.com/es/doc/java/super)
             */
            super();
        }

        public Guitarra(Marca marcas, double precio, String modelo, LocalDate fechaFabricacion) {
            super(marcas, precio, modelo, fechaFabricacion);
        }

        public Guitarra(Marca marcas, double precio, String modelo, String dniComprador, String nombreComprador,
                LocalDate fechaCompra, LocalDate fechaFabricacion) {
            super(marcas, precio, modelo, dniComprador, nombreComprador, fechaCompra, fechaFabricacion);
        }

        public void tocar() {
            System.out.println(
                    "Tocando la guitarra " + getTipo() + " con " + getNumeroCuerdas() + " cuerdas y sueno muy bien");
        }

    }

    // declaramos la calase hija Bataria
    public static class Bateria extends Instrumento {
        private int numeroTambores = 6;
        private int numeroPlatos = 2;

        // getters y setters
        public int getNumeroTambores() {
            return numeroTambores;
        }

        public int getNumeroPlatos() {
            return numeroPlatos;
        }

        public Bateria() {
            /*
             * Super es una palabra de java que se usa para acceder
             * a los constructores de la clase padre
             */
            super();
        }

        public Bateria(Marca marcas, double precio, String modelo, LocalDate fechaFabricacion) {
            super(marcas, precio, modelo, fechaFabricacion);
        }

        public Bateria(Marca marcas, double precio, String modelo, String dniComprador, String nombreComprador,
                LocalDate fechaCompra, LocalDate fechaFabricacion) {
            super(marcas, precio, modelo, dniComprador, nombreComprador, fechaCompra, fechaFabricacion);
        }

        public void tocar() {
            System.out.println(
                    "Tocando la Bateria " + getNumeroTambores() + " con " + getNumeroPlatos()
                            + " cuerdas y sueno muy bien");
        }

    }
}
