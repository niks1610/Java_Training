/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/



public class Main
{
	public static void main(String[] args) {
	
	    // create instance of employee and VegetableBill
		Employee e1 = new Employee(1,"Aman");
		DiscountBill vb = new DiscountBill(e1,true);
		
		
		//create instance of items
		Item i1 = new Item ("Banana  ",30.0,5.0);
		Item i2 = new Item ("Apple   ",100.0,0.0);
		Item i3 = new Item ("Juice   ",150.0,15.0);
		Item i4 = new Item ("Biscuits",30.0,0.0);
		Item i5 = new Item ("Noodles ",90.0,5.0);
		Item i6 = new Item ("Chips   ",50.0,0.0);
		
		//add items to VegetableBill
		vb.addItem(i1);
		vb.addItem(i2);
		vb.addItem(i3);
		vb.addItem(i4);
		vb.addItem(i5);
		vb.addItem(i6);
		
		//print details of bills with or without discount
		System.out.println("Employee Details:");
		System.out.println(e1.toString());
		System.out.println("Bill Receipt:");
		
		vb.printReceipt();
		
		
		
		System.out.println("Total price:                    "+vb.getTotal());
		System.out.println("Total items with discount:      "+vb.getDiscountCount());
	 	System.out.println("Total amount saved as discount: "+vb.getDiscountAmount());
		System.out.println("Discount percentage:            "+vb.getDiscountPercent());
		
		
		
		
		
	}
}

