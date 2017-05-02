package headfirst.factory.pizzas;

public interface PizzaIngredientFactory {
  public Dough createDough();
  public Cheese createCheese();
}