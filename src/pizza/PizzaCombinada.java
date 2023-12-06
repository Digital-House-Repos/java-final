package pizza;

import java.util.ArrayList;
import java.util.List;

public class PizzaCombinada extends Pizza {
    private List<Pizza> listaPizzas;


    // Constructor
    public PizzaCombinada(String nombre, String descripcion) {
        super(nombre, descripcion);
        this.listaPizzas = new ArrayList<>();
    }

    // Methods
    public void agregarPizza(Pizza pizza) throws RuntimeException {
        if (this.listaPizzas.isEmpty()) {
            this.listaPizzas.add(pizza);
        } else if (this.listaPizzas.size() == 1 && !this.listaPizzas.contains(pizza)) {
            this.listaPizzas.add(pizza);
            this.calcularPrecio();
        } else {
            throw new RuntimeException("No se puede agregar mas de 2 pizzas o la pizza ya esta agregada");
        }
    }
// Agregar try catch para que no agregue mas de 2 pizzas


    @Override
    public double calcularPrecio() {
        Pizza pizza1 = this.listaPizzas.get(0);
        Pizza pizza2 = this.listaPizzas.get(1);

        if (pizza1.getPrecio() > pizza2.getPrecio()) {
            this.precio = pizza1.getPrecio();
        } else {
            this.precio = pizza2.getPrecio();
        }
        return this.precio;
    }
}
