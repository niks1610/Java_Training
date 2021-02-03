class HoneyCombBox implements Box{
   private String type;
    private double length;
    private double width;
    private double height;
    private double area;
    private Flute  flute;
    private int mf;
    
    
   
    
    
    
    public HoneyCombBox(String type,double length,double width,double height,Flute flute)
    {
        
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
    
    public double getManufactureCost(Join join)
    {
        return area*flute.getTotalGsm()*flute.getExtraGsm()*join.getCost()*mf;
    }
    
    public String toString()
    {
        return type+" HoneyComb "+length+" "+width+" "+height;
    }
}
