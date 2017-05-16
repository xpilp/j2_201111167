package headfirst.singleton.stat;
 
public class Singleton {

 private static Singleton uniqueInstance = new Singleton();
        private static int numCalled=0; 
   
 public static Singleton getInstance() {
//  if (uniqueInstance == null) {
//   System.out.println("Creating unique instance of Chocolate Boiler");
//   uniqueInstance = new Singleton();
 
  System.out.println("jsl: numCalled "+numCalled++);
  return uniqueInstance;
 }
}