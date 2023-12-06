package pizza;

public class PizzaSimple extends Pizza {
    private double precioBase;
    private boolean esEspecial;

    // Constructor
    public PizzaSimple(String nombre, String descripcion, double precioBase, boolean esEspecial) {
        super(nombre, descripcion);
        this.precioBase = precioBase;
        this.esEspecial = esEspecial;

        // agregar metodo calcularPrecio() al constructor
    }

    // Methods
    @Override
    public void calcularPrecio() {
        if (this.esEspecial) {
            this.precio = this.precioBase * 1.7;
        } else {
            this.precio = this.precioBase;
        }
    }
}
