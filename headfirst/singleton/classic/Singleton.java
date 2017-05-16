package headfirst.singleton.classic;
 
public class Singleton {

 private static Singleton uniqueInstance;
        private static int numCalled=0; 
   
 public static Singleton getInstance() {
  if (uniqueInstance == null) {
   System.out.println("Creating unique instance of Chocolate Boiler");
   uniqueInstance = new Singleton();
  }
  System.out.println("Returning instance of Chocolate Boiler");
  System.out.println("jsl: numCalled "+numCalled++);
  return uniqueInstance;
 }
}
