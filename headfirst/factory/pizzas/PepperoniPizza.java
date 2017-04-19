package headfirst.factory.pizzas;

public class PepperoniPizza extends Pizza{
  public PepperoniPizza(){
    name = "Pepperoni Pizza";
    dough = "Regular Crust";
    sauce = "Hot Pizza Sauce";
    toppings.add("Fresh Tomato");
    toppings.add("Parmesan");
  }
}