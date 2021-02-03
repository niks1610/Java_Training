

import java.util.*;
class pasteJoin implements Join{
    private static HashMap<String,Integer> map;
    private String boxname;

    
    public pasteJoin(String boxname)
    {
        this.boxname = boxname;
         map = new HashMap();
         map.put("Universal",20);
         map.put("AllFlapMeeting",30);
         map.put("HoneyComb",40);
         map.put("ReverseTuckin",50);
         map.put("TopOpeningSnapLock",50);
    }
    
    public double getCost()
    {
        return map.get(boxname);
    }
}
