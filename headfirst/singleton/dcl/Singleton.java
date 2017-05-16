package headfirst.singleton.dcl;
 
public class Singleton {
    private volatile static Singleton uniqueInstance;
    private static int numCalled=0;
 
    private Singleton() {}

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        System.out.println("numCalled: "+numCalled++);
        return uniqueInstance;
    }
}
