import ADTs.* ;
import java.util.Scanner; 
public class MenuCoffee
{
	public static void main(String[] args)
	{
		GeneralTree IceLatte = new GeneralTree(new String("|  1.Ice Latte            \"18RS\"       |")) ;
		GeneralTree IceWhiteMocha = new GeneralTree(new String("|  2.Ice White Mocha      \"22RS\"       |")) ;
		GeneralTree IceMatcha = new GeneralTree(new String("|  3.Ice matcha           \"20RS\"       |")) ;
		GeneralTree IceV60 = new GeneralTree(new String("|  4.Ice V60              \"21RS\"       |")) ;
		GeneralTree KarkadehIceTea = new GeneralTree(new String("|  5.Karkadeh ice tea     \"18RS\"       |")) ;
		GeneralTree ColdDrinks = new GeneralTree(new String("|***********---Cold Drinks---**********|")) ;

		GeneralTree Latte = new GeneralTree(new String("|  1.Latte                \"16RS\"       |")) ;
		GeneralTree FlatWhite = new GeneralTree(new String("|  2.Flat White           \"15RS\"       |")) ;
		GeneralTree Cappuccino = new GeneralTree(new String("|  3.Cappuccino           \"16RS\"       |")) ;
		GeneralTree Espresso = new GeneralTree(new String("|  4.Espresso             \"12RS\"       |")) ;
		GeneralTree HotChocolate = new GeneralTree(new String("|  5.Hot Chocolate        \"20RS\"       |")) ;
		GeneralTree HotDrinks = new GeneralTree(new String("|***********---Hot Drinks---***********|")) ;

		GeneralTree SanSebastiann = new GeneralTree(new String("|  1.San Sebastiann       \"26RS\"       |")) ;
		GeneralTree SaffronCake = new GeneralTree(new String("|  2.Saffron Cake         \"24RS\"       |")) ;
		GeneralTree Tiramisu = new GeneralTree(new String("|  3.Tiramisu             \"24RS\"       |")) ;
		GeneralTree Doughnut = new GeneralTree(new String("|  4.Doughnut             \"13RS\"       |")) ;
		GeneralTree Cookies = new GeneralTree(new String("|  5.Cookies              \"12RS\"       |")) ;
		GeneralTree Sweets = new GeneralTree(new String("|*************---Sweets---*************|")) ;
		
		GeneralTree CroissantButter = new GeneralTree(new String("|  1.Croissant Butter     \"9RS \"       |")) ;
		GeneralTree CroissantCheese  = new GeneralTree(new String("|  2.Croissant Cheese     \"11RS\"       |")) ;
		GeneralTree CroissantZaatar = new GeneralTree(new String("|  3.Croissant Zaatar     \"10RS\"       |")) ;
		GeneralTree CroissantChocolate = new GeneralTree(new String("|  4.Croissant Chocolate  \"11RS\"       |")) ;
		GeneralTree LemonCake = new GeneralTree(new String("|  5.Lemon Cake           \"11RS\"       |")) ;
		GeneralTree Bakery = new GeneralTree(new String("|*************---Bakery---*************|")) ;
		GeneralTree Menu = new GeneralTree(new String("|          COFFEE CSCE231 MENU         |")) ;
		 
		ColdDrinks.attachSubtree(IceLatte);
		ColdDrinks.attachSubtree(IceWhiteMocha);
		ColdDrinks.attachSubtree(IceMatcha);
		ColdDrinks.attachSubtree(IceV60);
		ColdDrinks.attachSubtree(KarkadehIceTea);
		HotDrinks.attachSubtree(Latte);
		HotDrinks.attachSubtree(FlatWhite);
		HotDrinks.attachSubtree(Cappuccino);
		HotDrinks.attachSubtree(Espresso);
		HotDrinks.attachSubtree(HotChocolate);
		Sweets.attachSubtree(SanSebastiann);
		Sweets.attachSubtree(SaffronCake);
		Sweets.attachSubtree(Tiramisu);
		Sweets.attachSubtree(Doughnut);
		Sweets.attachSubtree(Cookies);
		Bakery.attachSubtree(CroissantButter);
		Bakery.attachSubtree(CroissantCheese);
		Bakery.attachSubtree(CroissantZaatar);
		Bakery.attachSubtree(CroissantChocolate);
		Bakery.attachSubtree(LemonCake);
		Menu.attachSubtree(ColdDrinks);
		Menu.attachSubtree(HotDrinks);
		Menu.attachSubtree(Sweets);
		Menu.attachSubtree(Bakery);
		
	    System.out.println("        Welcome to CSCE231 Cafe") ;
	    System.out.println(" --------------------------------------") ;
		Visitor V = new PrintingVisitor() ;
		Menu.depthFirstTraversal(new PreOrder(V)) ;
		System.out.println(" --------------------------------------") ;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("What do you want to order?") ;
		System.out.println("1.Cold Drinks   |   2.Hot Drinks   |   3.Sweets   |   4.Bakery   |   5.Nothing") ;
		String q1 = sc.nextLine() ;
		switch(q1)
		{ 
		case "Cold Drinks":
			Visitor C = new PrintingVisitor() ;
			ColdDrinks.depthFirstTraversal(new PreOrder(C)) ;
			System.out.println("1.Ice Latte   |   2.Ice White Mocha  |   3.Ice matcha   |   4.Ice V60   |   5.Karkadeh ice tea ") ;
			String a1 = sc.nextLine() ;
			
			System.out.println("Do you want something else?") ;
			System.out.println("1.Yes please   |   2.No Thank you") ;
			 String p1 = a1;
				switch(p1) {
				case "Ice Latte" :
					System.out.println("The price: 22RS") ;
					break;
				case "Ice White Mocha" :
					System.out.println("The price: 22RS") ;
					break ;
				case "Ice matcha" :
					System.out.println("The price: 20RS") ;
					break ;
				case "Ice V60" :
					System.out.println("The price: 21RS") ;
					break ;
				case "Karkadeh ice tea" :
					System.out.println("The price: 18RS") ;
					break ;
			String a2 = sc.nextLine() ;
			switch(a2)
			{
			case "Yes please":
			    System.out.println(" --------------------------------------") ;
				 V = new PrintingVisitor() ;
				Menu.depthFirstTraversal(new PreOrder(V)) ;
				System.out.println(" --------------------------------------") ;
				System.out.println("1.Cold Drinks   |   2.Hot Drinks   |   3.Sweets   |   4.Bakery   |   5.Nothing") ;
				String q2 = sc.nextLine() ;
				 //iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii
				
				 break;
				
					}
			case "No Thank you":
				System.out.println("Do you want a 1.table or 2.takeaway ? ") ;
				String a3 = sc.nextLine() ;
				System.out.println(" Your request is: "+a1+" Your total price: "+ p1) ;
				break ;
			}
			
			
			
		break;
		case "Hot Drinks": 
			Visitor H = new PrintingVisitor() ;
			HotDrinks.depthFirstTraversal(new PreOrder(H)) ;
			System.out.println("1.Latte   |   2.Flat White   |   3.Cappuccino   |   4.Espresso   |   5.Hot Chocolate") ;
			a1 = sc.nextLine() ;
		break;
		case "Sweets": 
			Visitor S = new PrintingVisitor() ;
			Sweets.depthFirstTraversal(new PreOrder(S)) ;
			System.out.println("1.San Sebastiann   |   2.Saffron Cake   |   3.Tiramisu   |   4.Doughnut   |   5.Cookies") ;
			a1 = sc.nextLine() ;
		break;
		case "Bakery": 
			Visitor B = new PrintingVisitor() ;
			Bakery.depthFirstTraversal(new PreOrder(B)) ;
			System.out.println("1.Croissant Butter   |   2.Croissant Cheese   |   3.Croissant Zaatar   |   4.Croissant Chocolate   |   5.Lemon Cake") ;
			a1 = sc.nextLine() ;
		break;
		case "Nothing": 
			System.out.println("Thank you and we hope you visit again");
			break;
		}
		
	}
}






