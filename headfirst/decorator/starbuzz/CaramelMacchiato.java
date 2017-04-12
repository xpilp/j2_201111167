package headfirst.decorator.starbuzz;

public class CaramelMacchiato {
 
 public static void main(String args[]) {
   Beverage cMacchiato = new Espresso();
   cMacchiato = new Milk(cMacchiato);
   cMacchiato = new Whip(cMacchiato);
   System.out.println(cMacchiato.getDescription() + " $" + cMacchiato.cost());
   
 }
}