/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/



public class Main
{
	public static void main(String[] args) {
	
	
	//creating instance of Flute
	Flute f1 = new Flute("B",10);
	System.out.println("Details of flute:");
	System.out.println(f1);
	System.out.println();
	
	
	//creating instance of pinBox
	pinBox p1= new pinBox("Universal","single",10,20,5,f1);
	System.out.println("Details of pinBox1:");
	System.out.println(p1);
	System.out.println("manufacturing cost of pinbox1 = "+p1.getManufactureCost());
	
	System.out.println();
	//creating instance of pasteBox
	pasteBox p2 = new pasteBox("HoneyComb","double",15,10,3,f1);
	
	
	System.out.println("Details of pasteBox1:");
	System.out.println(p2);
	System.out.println("manufacturing cost of pastebox1 = "+p2.getManufactureCost());
	
		
		
		
	}
}

