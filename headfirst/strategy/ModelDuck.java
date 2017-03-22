package headfirst.strategy;

public class ModelDuck extends Duck {
 public ModelDuck() {
  setFlyBehavior (new FlyWithWings());
  setQuackBehavior( new Quack());
 }

 public void display() {
  System.out.println("I'm a model duck");
 }
}