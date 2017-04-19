package headfirst.factory.pizzafm;

public SMStylePizzaStore extends PizzaStore {
  Pizza createPizza(String item) {
  if (item.equals("potato")) {
   return new SMStylePotatoPizza();
  } 
 }
}