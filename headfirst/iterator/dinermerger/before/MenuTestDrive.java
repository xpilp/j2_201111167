package headfirst.iterator.dinermerger.before;

import java.util.ArrayList;

public class MenuTestDrive {
    public static void main(String args[]) {
    PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
    DinerMenu dinerMenu = new DinerMenu();
 
    printMenu();
    }
    public static void printMenu() {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();

        ArrayList<MenuItem> breakfastItems = pancakeHouseMenu.getMenuItems();

      for(MenuItem menuItem : breakfastItems){
            System.out.print(menuItem.getName());
            System.out.println("\t\t" + menuItem.getPrice());
            System.out.println("\t" + menuItem.getDescription());
        }

        MenuItem[] lunchItems = dinerMenu.getMenuItems();

      for(MenuItem menuItem : lunchItems){
            System.out.print(menuItem.getName());
            System.out.println("\t\t" + menuItem.getPrice());
            System.out.println("\t" + menuItem.getDescription());
        }
    }
}