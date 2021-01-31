import java.util.*;
class Flute{
    private int gsm;
    private int ExtraGsm;
    private int totalGsm;
    private String type;
    
    private static HashMap<String,Integer> map = new HashMap();
    
    
    
    public Flute(String type,int gsm)
    {
        this.type = type;
        this.gsm  = gsm;
        this.totalGsm = 0;
        map.put("A",10);
        map.put("B",30);
        map.put("C",20);
        map.put("E",40);
        map.put("F",50);
        map.put("G",20);
    }
    
    public int getTotalGsm()
    {
        totalGsm = map.get(type) + this.gsm*100;
        return totalGsm;
    }
    
    public int getExtraGsm()
    {
        return map.get(type);
    }
    
    public String toString()
    {
        return type+" Gsm= "+gsm+" ExtraGsm = "+map.get(type);
    }
}
