package headfirst.iterator.dinermerger.before;

import java.util.ArrayList;

public class PancakeHouseMenu {
    ArrayList<MenuItem> menuItems;
 
    public PancakeHouseMenu() {
        menuItems = new ArrayList<MenuItem>();
    
        addItem("BLT","Bacon Lettuce Tomato", false, 2.99);
        addItem("BLT2","Bacon2 Lettuce2 Tomato2", false, 2.99);
    }
    public void addItem(String n, String d, boolean v, double p) {
        MenuItem menuItem = new MenuItem(n, d, v, p);
        menuItems.add(menuItem);
    }
    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }
    public String toString() {
        return "Objectville Pancake House Menu";
    }
}