
import java.util.*;
class pasteBox implements Box{
    
    private String name;
    private String type;
    private double length;
    private double width;
    private double height;
    private double area;
    private Flute  flute;
    private static HashMap<String,Integer> map = new HashMap();
    private int mf;
    
   
    
    
    
    public pasteBox(String name,String type,double length,double width,double height,Flute flute)
    {
        this.name = name;
        this.type = type;
        this.length = length;
        this.width = width;
        this.height = height;
        this.area = length*width*height;
        this.flute= flute;
        if(type.equals("single") || type.equals("Single") || type.equals("SINGLE"))
        mf=1;
        
        else if(type.equals("double") || type.equals("Double") || type.equals("DOUBLE"))
        mf=3;
        
        else
        {System.out.println("Wrong type!");
         return;
        }
        
         map.put("Universal",20);
         map.put("AllFlapMeeting",30);
         map.put("HoneyComb",40);
         map.put("ReverseTuckin",50);
         map.put("TopOpeningSnapLock",50);
    }
    
    public double getLength()
    {
        return length;
    }
    
    public double getWidth()
    {
        return width;
    }
    
    public double getHeight()
    {
        return height;
    }
    
    public double getArea()
    {
        return area;
    }
    
    public Flute getFlute()
    {
        return flute;
    }
    
    public double getManufactureCost()
    {
        return area*flute.getTotalGsm()*flute.getExtraGsm()*map.get(name)*mf;
    }
    
    public String toString()
    {
        return name+" "+type+" pasteBox "+length+" "+width+" "+height;
    }
}
