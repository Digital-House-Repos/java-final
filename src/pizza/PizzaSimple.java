package pizza;

public class PizzaSimple extends Pizza {
    private double precioBase;
    private boolean esEspecial;

    // Constructor
    public PizzaSimple(String nombre, String descripcion, double precioBase, boolean esEspecial) {
        super(nombre, descripcion);
        this.precioBase = precioBase;
        this.esEspecial = esEspecial;

        this.calcularPrecio();
    }

    // Methods
    @Override
    public double calcularPrecio() {
        if (this.esEspecial) {
            this.precio = this.precioBase * 1.7;
        } else {
            this.precio = this.precioBase;
        }
        return this.precio;
    }

    // To String
    @Override
    public String toString() {
        if (this.esEspecial) {
            return super.toString() + " - Precio base (" + this.precioBase + "$) + 70% (Especial)";
        } else {
            return super.toString();
        }
    }
}
