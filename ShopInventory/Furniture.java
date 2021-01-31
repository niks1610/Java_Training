class Furniture{
    protected String type;
    protected int total_num;
    protected double cost;
    protected double total_cost;
    
    public Furniture(String type,int total_num,double cost)
    {
        this.type = type;
        this.total_num = total_num;
        this.cost = cost;
        total_cost =  total_num*cost;
    }
    
    public int getTotalNum()
    {
        return total_num;
    }
    
    public double getCost()
    {
        return cost;
    }
    
    public double getTotalCost()
    {
        return total_cost;
    }
    
    public String getType()
    {
        return type;
    }
    
    
}
