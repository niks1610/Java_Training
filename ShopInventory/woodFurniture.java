
import java.util.*;
class woodFurniture extends Furniture implements Shop{
    
    private ArrayList<String> type_list = new ArrayList();
    
    
    public woodFurniture(String type,int total_num,double cost)
    {
        super(type,total_num,cost);
        type_list.add(type);
        
    }
    
    
    public void getList()
    {
        type_list.forEach(System.out::println);
    }
    
    public boolean isChildSafe()
    {
        return true;
    }
    
    public String toString()
    {
        return "Wood "+super.type+" total number= "+super.total_num+" cost/piece = "+super.cost;
    }
}
