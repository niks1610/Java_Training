
import java.util.*;

class VegetableBill{
    
    protected ArrayList<Item> list;
    private Employee clerk;
    protected double total_price;
    
    public VegetableBill(Employee clerk)
    {
        this.list = new ArrayList();
        this.clerk = clerk;
        this.total_price = 0;
    }
    
    public void addItem(Item item)
    {
        list.add(item);
        total_price += item.getPrice();
    }
    
    public double getTotal()
    {
        return total_price;
    }
    
    public void printReceipt()
    {
        list.forEach(System.out::println);
    }
    
}
