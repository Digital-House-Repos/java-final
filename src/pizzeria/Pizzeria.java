package pizzeria;

import java.util.ArrayList;
import java.util.List;
import pizza.Pizza;

public class Pizzeria {
    private List<Pizza> listaPizzas;
    private String nombre;

    // Constructor
    public Pizzeria(String nombre) {
        this.nombre = nombre;
        this.listaPizzas = new ArrayList<>();
    }

    // Methods
    public void agregarPizza(Pizza pizza) {
        this.listaPizzas.add(pizza);
    }

    public void mostrarMenu() {
        System.out.println("Menu de la pizzeria " + this.nombre);
        for (Pizza pizza : this.listaPizzas) {
            System.out.println("- " + pizza);
        }
    }
}
