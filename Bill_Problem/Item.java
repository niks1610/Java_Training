class Item{
    private String name;
    private double price;
    private double disc;
    
    public Item(String name,double price, double disc)
    {
        this.name  = name; 
        this.price = price;
        this.disc  = disc;
    }
    
    public double getPrice()
    {
        return this.price;
    }
    
    public double getDiscount()
    {
        return this.disc;
    }
    
    @Override
    public String toString()
    {
        return name+" "+price;
    }
    
}
