package pizza;

import java.util.ArrayList;
import java.util.List;

public class PizzaCombinada extends Pizza {
    private List<Pizza> listaPizzas;


    // Constructor
    public PizzaCombinada(String nombre, String descripcion) {
        super(nombre, descripcion);
        this.listaPizzas = new ArrayList<>();

        this.calcularPrecio();
    }

    // Methods
    public void agregarPizza(Pizza pizza) {
        if (this.listaPizzas.isEmpty()) {
            this.listaPizzas.add(pizza);
        } else {
            this.listaPizzas.add(pizza);
        }
        // Agregar try catch para que no agregue mas de 2 pizzas
    }

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
