package headfirst.command.undo;

public class SimpleRemoteWithUndo {
  Command[] slots;
  
  public SimpleRemoteWithUndo() {
    slots = new Commnad[7];
    
    Command noCommand = new NoCommand();
    for(int i=0;i<7;i++) {
      slots[i] = new noCommand;
    }
  }
  
  public void setCommand(int slot, Command command) { 
    slots[num] = command;
  }
  
  public void buttonWasPressed(int num) {
    slots[num].execute();
  }
}