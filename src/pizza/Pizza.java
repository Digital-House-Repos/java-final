package pizza;

public abstract class Pizza {
    protected String nombre;
    protected String descripcion;
    protected double precio;

    // Constructor
    public Pizza(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = 0;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    // Methods
    public abstract double calcularPrecio();

    // To String
    @Override
    public String toString() {
        return this.nombre + " - " + this.descripcion + " - " + this.precio + "$";
    }
}
