import pizzeria.Pizzeria;
import pizza.*;

public class Main {
    public static void main(String[] args) {
        Pizzeria pizzeria = new Pizzeria("La Pizzeria Digital House");

        Pizza pizza1 = new PizzaSimple("Muzzarella", "Muzzarella, tomate y oregano", 700, false);
        Pizza pizza2 = new PizzaSimple("Margarita", "Margarita, tomate, oregano y ajo", 850, true);
        Pizza pizza3 = new PizzaSimple("Anana", "Anana, tomate, ajo y oregano", 950, false);

        PizzaCombinada pizza4 = new PizzaCombinada("Combinada loca", "Margarita + Anana");
        pizza4.agregarPizza(pizza2);
        pizza4.agregarPizza(pizza3);

        pizzeria.agregarPizza(pizza1);
        pizzeria.agregarPizza(pizza2);
        pizzeria.agregarPizza(pizza3);
        pizzeria.agregarPizza(pizza4);

        pizzeria.mostrarMenu();
    }
}
