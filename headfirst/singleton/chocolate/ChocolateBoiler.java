package headfirst.singleton.chocolate;
 
public class ChocolateBoiler {

 private static ChocolateBoiler uniqueInstance;
        private static int numCalled=0; 
   
 public static ChocolateBoiler getInstance() {
  if (uniqueInstance == null) {
   System.out.println("Creating unique instance of Chocolate Boiler");
   uniqueInstance = new ChocolateBoiler();
  }
  System.out.println("Returning instance of Chocolate Boiler");
  System.out.println("jsl: numCalled "+numCalled++);
  return uniqueInstance;
 }
}
