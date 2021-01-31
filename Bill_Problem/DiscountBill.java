class DiscountBill extends VegetableBill{ 
    
    
    
    private boolean preferred;
    private int Disc_count;
    private double total_Disc;
  //  private double disc_per;
    
    public DiscountBill(Employee clerk,boolean preferred)
    {
        super(clerk);
        this.preferred  = preferred;
        this.Disc_count = 0;
        this.total_Disc = 0;
   //     this.disc_per   = 0;
    }
    
    public int getDiscountCount()
    {
        if(preferred)
        {
            for(int i=0;i<super.list.size();i++)
                {
                    if(super.list.get(i).getDiscount()>0)
                    Disc_count += 1;
                    
                }
        
            return Disc_count;
        }
        
        return 0;
    }
    
    public double getDiscountAmount()
    {
        if(preferred)
        {
            for(int i=0;i<super.list.size();i++)
                {
                    double disc = super.list.get(i).getDiscount();
                    
                    if(disc>0)
                    total_Disc += disc;
                    
                }
        
            return total_Disc;
        }
        return 0.0;
    }
    
    public double getDiscountPercent()
    {
        if(preferred)
        return (total_Disc/super.total_price)*100;
        
        return 0.0;
    }
    
}
