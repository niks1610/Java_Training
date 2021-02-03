public class Main
{
	public static void main(String[] args) {
	
	
	//creating instance of Flute
	Flute f1 = new Flute("B",10);
	System.out.println("Details of flute:");
	System.out.println(f1);
	System.out.println();
	
	Join j1 = new pinJoin();
	
	Join j2 = new pasteJoin("HoneyComb");
	
	//creating instance of pinBox
	Box p1= new UniversalBox("single",10,20,5,f1);
	System.out.println("Details of Box1:");
	System.out.println(p1);
	System.out.println("manufacturing cost of Box1 = "+p1.getManufactureCost(j1));
	
	System.out.println();
	//creating instance of pasteBox
	Box p2 = new HoneyCombBox("double",15,10,3,f1);
	
	
	System.out.println("Details of Box2:");
	System.out.println(p2);
	System.out.println("manufacturing cost of Box2 = "+p2.getManufactureCost(j2));
	
		
		
		
	}
}

