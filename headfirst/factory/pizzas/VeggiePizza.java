package headfirst.factory.pizzas;

public class VeggiePizza extends Pizza{
  public VeggiePizza(){
    name = "Veggie Pizza";
    dough = "Regular Crust";
    sauce = "Marinara Pizza Sauce";
    toppings.add("Fresh Mozzarella");
    toppings.add("Parmesan");
  }
}