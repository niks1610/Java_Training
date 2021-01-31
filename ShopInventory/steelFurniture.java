
import java.util.*;
class steelFurniture extends Furniture implements Shop{
    private String type;
    private ArrayList<String> type_list = new ArrayList();
    
    
    public steelFurniture(String type,int total_num,double cost)
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
        return false;
    }
    
    public String toString()
    {
        return "Steel "+super.type+" total number= "+super.total_num+" cost/piece = "+super.cost;
    }
}
