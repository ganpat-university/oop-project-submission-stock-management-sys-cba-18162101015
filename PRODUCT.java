import java.util.Scanner;

class Product
{

	public static void main(String args[]){
		double[] product = new double[20];
		Scanner sc = new Scanner(System.in);
		int option,mode=0,b;
		{
		System.out.println("--->Product Details<---");
		System.out.println("1> Product ID");
		System.out.println("2> Total Bill");
		System.out.println("3> Exit");
		System.out.println("Enter your option : ");
		option = sc.nextInt();
		}

		if(option==1){
		int choice;
		System.out.println("--->Menu<---");
		System.out.println("1> White Grain");
		System.out.println("2> Electronics");
		System.out.println("3> Dairy");
		System.out.println("4> Fruits");
		System.out.println("5> Drugs");
		System.out.println("Please Enter your choice : ");
		choice = sc.nextInt();

		switch(choice)
		{
			case 1:
				Grain();
			break;
			case 2:
				Electronics();
			break;
			case 3:
				Dairy();
			break;
			case 4:
				Fruits();
			break;
			case 5:
				Drugs();
			break;
			default:
				//exit
		}

		}

		if(option==2){
		System.out.println("Your Total Bill is : ");
		}

		if(option==3){
		System.exit(0);
		}
	}

	public static void Grain(){
	int a;
	Scanner sc = new Scanner(System.in);
	System.out.println("--->Product Description<---");
	System.out.println("Product Name : Rice");
	System.out.println("Description : White Grain");
	System.out.println("Stock Level : 200");
	System.out.println("Out of Stock : 5");
	System.out.println("Price per kg : 20");
	System.out.println("Enter the number of quantities you want : ");
	a=sc.nextInt();
//========================================++TOTAL++===============================================================
	double[] product = new double[20];
	product[0] = a;
        product[1] = 200;
	double cTotal1=(product[1] - product[0]);
	System.out.println("Remainder : ");
        String CostD = String.valueOf(cTotal1);
        System.out.println(CostD);
 	product[2] = a;
        product[3] = 20;
	double cTotal2 = (product[2] * product[3]) ;
	System.out.println("Total Bill in RS : ");
        String TotalD = String.valueOf(cTotal2);
        System.out.println(TotalD);
	}

	public static void Electronics(){
	int b;
	Scanner sc = new Scanner(System.in);
	System.out.println("--->Product Description<---");
	System.out.println("Product Name : Fridge");
	System.out.println("Description : Electronics");
	System.out.println("Stock Level : 400");
	System.out.println("Out of Stock : 10");
	System.out.println("Price per kg : 30000");
	System.out.println("Enter the number of quantities you want : ");
	b=sc.nextInt();
//========================================++TOTAL++===============================================================
	double[] product = new double[5];
	product[0] = b;
        product[1] = 400;
	double cTotal3=(product[1] - product[0]);
	System.out.println("Remainder : ");
        String CostE = String.valueOf(cTotal3);
        System.out.println(CostE);
 	product[2] = b;
        product[3] = 30000;
	double cTotal4 = (product[2] * product[3]) ;
	System.out.println("Total Bill in RS : ");
        String TotalE = String.valueOf(cTotal4);
        System.out.println(TotalE);
	}



	public static void Dairy(){
	int c;
	Scanner sc = new Scanner(System.in);
	System.out.println("--->Product Description<---");
	System.out.println("Product Name : Milk");
	System.out.println("Description : Dairy");
	System.out.println("Stock Level : 500");
	System.out.println("Out of Stock : 10");
	System.out.println("Price per kg : 25");
	System.out.println("Enter the number of quantities you want : ");
	c=sc.nextInt();
//========================================++TOTAL++===============================================================
	double[] product = new double[5];
	product[0] = c;
        product[1] = 500;
	double cTotal5=(product[1] - product[0]);
	System.out.println("Remainder : ");
        String CostF = String.valueOf(cTotal5);
        System.out.println(CostF);
 	product[2] = c;
        product[3] = 25;
	double cTotal6 = (product[2] * product[3]) ;
	System.out.println("Total Bill in RS : ");
        String TotalF = String.valueOf(cTotal6);
        System.out.println(TotalF);
	}



	public static void Fruits(){
	int d;
	Scanner sc = new Scanner(System.in);
	System.out.println("--->Product Description<---");
	System.out.println("Product Name : Apple");
	System.out.println("Description : Fruits");
	System.out.println("Stock Level : 700");
	System.out.println("Out of Stock : 15");
	System.out.println("Price per kg : 50");
	System.out.println("Enter the number of quantities you want : ");
	d=sc.nextInt();
//========================================++TOTAL++===============================================================
	double[] product = new double[5];
	product[0] = d;
        product[1] = 700;
	double cTotal7=(product[1] - product[0]);
	System.out.println("Remainder : ");
        String CostG = String.valueOf(cTotal7);
        System.out.println(CostG);
 	product[2] = d;
        product[3] = 50;
	double cTotal8 = (product[2] * product[3]) ;
	System.out.println("Total Bill in RS : ");
        String TotalG = String.valueOf(cTotal8);
        System.out.println(TotalG);
	}




	public static void Drugs(){
	int e;
	Scanner sc = new Scanner(System.in);
	System.out.println("--->Product Description<---");
	System.out.println("Product Name : Paracetamol");
	System.out.println("Description : Drugs");
	System.out.println("Stock Level : 450");
	System.out.println("Out of Stock : 5");
	System.out.println("Price per kg : 5");
	System.out.println("Enter the number of quantities you want : ");
	e=sc.nextInt();
//========================================++TOTAL++===============================================================
	double[] product = new double[5];
	product[0] = e;
        product[1] = 450;
	double cTotal9=(product[1] - product[0]);
	System.out.println("Remainder : ");
        String CostH = String.valueOf(cTotal9);
        System.out.println(CostH);
 	product[2] = e;
        product[3] = 5;
	double cTotal10 = (product[2] * product[3]) ;
	System.out.println("Total Bill in RS : ");
        String TotalH = String.valueOf(cTotal10);
        System.out.println(TotalH);
	}




}
