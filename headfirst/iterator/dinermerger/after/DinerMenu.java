package headfirst.iterator.dinermerger.after;

public class DinerMenu implements Menu {
    static final int MAX_ITEMS = 3;
    int numberOfItems = 0;
    MenuItem[] menuItems;
  
    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("BLT","Bacon Lettuce Tomato", false, 2.99);
        addItem("BLT2","Bacon2 Lettuce2 Tomato2", false, 2.99);
        addItem("BLT3","Bacon3 Lettuce3 Tomato3", false, 2.99);
    }
    
    public void addItem(String n, String d, boolean v, double p) {
        MenuItem menuItem = new MenuItem(n, d, v, p);
        menuItems[numberOfItems] = menuItem;
        numberOfItems = numberOfItems + 1;
        
    }
     public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }
    public MenuItem[] getMenuItems() {
        return menuItems;
    }
}