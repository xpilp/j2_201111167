package com.sd.turtle;

public class TurtleObserverMain {
    public static void main(String[] args) {
        System.out.println("--Observer pattern demo");
     
        BabyTurtle baby=new BabyTurtle();
       
        MomTurtle mom=new MomTurtle();
        baby.addObserver(mom);
     
        mom.moveTo(100,100);
       
        baby.move(100,-100);
     
        baby.setChanged();
        baby.notifyObservers();
    }
}