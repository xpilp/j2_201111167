package headfirst.command.undo;

public class Light {
  int level;
  public Light() {
  }
  
  public void on() {
    System.out.println("Light is on");
  }
  
  public void off() {
    System.out.println("Light is off");
  }
  
  public void dim(int level) {
    this.level = level;
  }
  
  public int getLevel() {
    return level;
  }
}