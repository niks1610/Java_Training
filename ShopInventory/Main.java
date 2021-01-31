/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/



public class Main
{
	public static void main(String[] args) {
	
	
    woodFurniture w1 = new woodFurniture("chair", 1000, 500);
    System.out.println(w1);
    System.out.println("Total cost in purchasing = "+ w1.getTotalCost());
    System.out.println("Child Safe = "+w1.isChildSafe());
    
    System.out.println();
    
    steelFurniture s1 = new steelFurniture("table", 1000, 500);
    System.out.println(s1);
    System.out.println("Total cost in purchasing = "+ s1.getTotalCost());
    System.out.println("Child Safe = "+s1.isChildSafe());
	
		
		
		
	}
}

