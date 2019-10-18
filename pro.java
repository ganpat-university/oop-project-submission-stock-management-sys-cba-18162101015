import java.util.Scanner;
import java.util.Arrays;
import java.io.*;

////////////////////////////////////////////////////////////////////////////////

class product
{

public int stk,price,q,mode=0;
public String name,proname,PID;

	public product()
	{
		for(;;)
		{
		if(mode>0)
		{
		Scanner sc = new Scanner(System.in);
		{
		System.out.println("--->Product Details<---");
		System.out.println("1> ADD Product");
		System.out.println("2> Sales Report");
		System.out.println("3> Consumer Details");
		System.out.println("4> Exit");
		System.out.println("Enter your option : ");
		q = sc.nextInt();
		}

		if(q==4)
		{
			System.exit(0);
		}

		if(q==1)
		{
		int w;
		System.out.println("--->Menu<---");
		System.out.println("1> White Grain");
		System.out.println("2> Electronics");
		System.out.println("3> Dairy");
		System.out.println("4> Fruits");
		System.out.println("5> Drugs");
		System.out.println("Please Enter your choice : ");
		w = sc.nextInt();
		PID_GEN();

		switch(w)
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
	}

		if(mode==0)
		{
		Scanner sc = new Scanner(System.in);
		{
		System.out.println("--->Product Details<---");
		System.out.println("1> ADD Product");
		System.out.println("2> Sales Report");
		System.out.println("3> Consumer Details");
		System.out.println("4> Exit");
		System.out.println("Enter your option : ");
		q = sc.nextInt();
		}

		if(q==4)
		{
			System.exit(0);
		}

		if(q==1)
		{
		int w;
		System.out.println("--->Menu<---");
		System.out.println("1> White Grain");
		System.out.println("2> Electronics");
		System.out.println("3> Dairy");
		System.out.println("4> Fruits");
		System.out.println("5> Drugs");
		System.out.println("Please Enter your choice : ");
		PID_GEN();
		w = sc.nextInt();

		switch(w)
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
		}

	}
	}

	public void Grain()
	{
		int stk,price,q;
		String name,proname;
		Scanner sc = new Scanner(System.in);

		System.out.println("--->White Grain<---");

		System.out.println("Add Product name : ");
		proname = sc.next();

		System.out.println("Add Stock level : ");
		stk = sc.nextInt();

		System.out.println("Add Price : ");
		price = sc.nextInt();

	}

	public void Electronics()
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("--->White Grain<---");

		System.out.println("Add Product name : ");
		proname = sc.next();

		System.out.println("Add Stock level : ");
		stk = sc.nextInt();

		System.out.println("Add Price : ");
		price = sc.nextInt();
		SAVE_PRODUCT("White Grain");
	}

	public void Dairy()
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("--->Dairy Product<---");

		System.out.println("Add Product name : ");
		proname = sc.next();

		System.out.println("Add Stock level : ");
		stk = sc.nextInt();

		System.out.println("Add Price : ");
		price = sc.nextInt();
		SAVE_PRODUCT("Dairy Product");
	}

	public void Fruits()
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("--->Fruits<---");

		System.out.println("Add Product name : ");
		proname = sc.next();

		System.out.println("Add Stock level : ");
		stk = sc.nextInt();

		System.out.println("Add Price : ");
		price = sc.nextInt();
		SAVE_PRODUCT("Fruits");
	}

	public void Drugs()
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("--->Paracetamol<---");

		System.out.println("Add Product name : ");
		proname = sc.next();

		System.out.println("Add Stock level : ");
		stk = sc.nextInt();

		System.out.println("Add Price : ");
		price = sc.nextInt();
		SAVE_PRODUCT("Paracetamol");
	}

	public void PID_GEN(){
		try{
			File file = new File("data/product/PIDHOLDER.txt");
			if(file.createNewFile())
			{
				FileWriter fw = new FileWriter("data/product/PIDHOLDER.txt");
				PID = "PID0";
				fw.write('0');
				fw.close();
			}
			else
			{
				Scanner ss = new Scanner(new File("data/product/PIDHOLDER.txt"));
				int z = ss.nextInt();
				PID = "PID"+(z+1);
				FileWriter fw = new FileWriter("data/product/PIDHOLDER.txt");
				z=z+1;
				fw.write(new Integer(z).toString());
				fw.close();
			}
		}catch(IOException e)
			{
			System.out.println("ERR:>" + e);
			}
	}

	public void SAVE_PRODUCT(String type){
		try{
			 String data = PID + "\t\t\t\t --> \t" + proname + "\t" + "\n";
			 File file = new File("data/product/list/" + type + ".txt");
			 if(file.createNewFile()){
				 FileWriter fw = new FileWriter("data/product/list/" + type + ".txt",true);
				 fw.write(data);
				 fw.close();
			 }else{
				 FileWriter fw = new FileWriter("data/product/list/" + type + ".txt",true);
				 fw.write(data);
				 fw.close();
			 }

			data = PID + "\n" + proname + "\n" + price + "\n" + stk;
			File file2 = new File("data/product/" + PID + ".txt");
 			file2.createNewFile();
 			FileWriter fw2 = new FileWriter("data/product/" + PID + ".txt");
 			fw2.write(data);
 			fw2.close();

	}catch(IOException e){
		System.out.println(e);
	}
}

}

//______________________________________________________________________________
class client
{
	public Console cn = System.console();
	public static Scanner sc = new Scanner(System.in);
	private String name,CID,password,address;
	public char[] password1,password2;

	public void CID_GEN(){
		try{
			File file = new File("data/client/CIDHOLDER.txt");
			if(file.createNewFile())
			{
				FileWriter fw = new FileWriter("data/client/CIDHOLDER.txt");
				CID = "CID0";
				fw.write('0');
				fw.close();
			}
			else
			{
				Scanner ss = new Scanner(new File("data/client/CIDHOLDER.txt"));
				int z = ss.nextInt();
			  CID = "CID"+(z+1);
				FileWriter fw = new FileWriter("data/client/CIDHOLDER.txt");
				z=z+1;
				fw.write(new Integer(z).toString());
				fw.close();
			}
		}catch(IOException e)
			{
			System.out.println("ERR:>" + e);
			}
	}

////////////////////////////////////////////////////////////////////////////////

public void LOGIN_IN_CLIENT(){
	 System.out.println("ENTER CID:");
	 CID = sc.nextLine();
	 char[] pass = cn.readPassword("ENTER YOUR PASSWORD:");
	 password = String.valueOf(pass);

	 File file = new File("data/client/" + CID +".txt");
	 if(file.exists()){
		 try{
			 FileReader fr = new FileReader("data/client/" + CID + ".txt");
			 BufferedReader br = new BufferedReader(fr);
			 String st; int i=0;
			 while((st = br.readLine()) != null){
				 	if(i == 3){
					 			if(st.equals(password))
					 			{
						 			System.out.println("pasword conform");
									BUY_product();
					 			}else{
						 			System.out.println("WRONG PAASWORD :[");
					 			}
				 		}
				 	i++;
			 }
			 fr.close();
		 }catch(IOException e){
			 System.out.println(e);
		 }
	 }else{
		 System.out.println("CANNOT FIND YOU :(");
	 }
}
///////////////////////////////////////////////////////////////////////////////

public void BUY_product(){
	String str,id;
	String type = new String();
	int w,Stock;
			System.out.println("select type:");
			System.out.println("1> White Grain");
			System.out.println("2> Electronics");
			System.out.println("3> Dairy");
			System.out.println("4> Fruits");
			System.out.println("5> Drugs");
			System.out.println("Please Enter your choice : ");
			w = sc.nextInt();
			System.out.println("\n\n");

			switch(w)
			{
				case 1:
					type = "White Grain";
				break;
				case 2:
					type = "White Grain";
				break;
				case 3:
					type = "Dairy Product";
				break;
				case 4:
					type = "Fruits";
				break;
				case 5:
					type = "Paracetamol";
				break;
				default:
					//exit
			}
			try{
			FileReader fr = new FileReader("data/product/list/" + type + ".txt");
			BufferedReader br = new BufferedReader(fr);
			while((str = br.readLine()) != null){
				System.out.println(str);
				}
			fr.close();
			System.out.println("Enter Product Id:");
			id = sc.nextLine();
			System.out.println("Enter Stock level:");
			Stock = sc.nextInt();
		}catch(IOException e){
			System.out.println("ERR>" + e);
		}
		}

///////////////////////////////////////////////////////////////////////////////

	public void SAVE_CDATA(){
		try{
				String data = "\t\t$$$$$$$$ DATA $$$$$$$$$\n" + CID + "\n" + name + "\n" + password + "\n" + address + "\n\t\t$$$$$$$$$ RECORDS $$$$$$$$$$";
				File file = new File("data/client/" + CID + ".txt");
				file.createNewFile();
				FileWriter fw = new FileWriter("data/client/" + CID + ".txt");
				fw.write(data);
				fw.close();
		}catch(IOException e){
				System.out.println("ERR>>" + e);
		}
	}

////////////////////////////////////////////////////////////////////////////////

	public void Create_client_AC(){
		System.out.println("Enter name :");
		name = sc.nextLine();
		System.out.println("Enter address :");
		address = sc.nextLine();
		passwd:
		for(;;){
			password1 = cn.readPassword("Enter Password :");
			password2 = cn.readPassword("Re-enter Password :");
			if( (Arrays.equals(password1,password2)) ){
				password = String.valueOf(password1);
				System.out.println("\nPASSWORD CONFORM");
			  CID_GEN();
				System.out.println("YOUR ID >> " + CID);
				SAVE_CDATA();
				break passwd;
				}
			else{
				System.out.println(" OOPS!!! Incorrect password:");
				}
		}
		}

}

//______________________________________________________________________________

class seller
{
	Console cn = System.console();
	public static Scanner sc = new Scanner(System.in);
	String name,SID,password,address;
	char[] password1,password2;

	public void SID_GEN(){
		try{
			File file = new File("data/seller/SIDHOLDER.txt");
			if(file.createNewFile())
			{
				FileWriter fw = new FileWriter("data/seller/SIDHOLDER.txt");
				fw.write('0');
				SID = "SID0";
				fw.close();
			}
			else
			{
				System.out.println("HYY");
				Scanner ss = new Scanner(new File("data/seller/SIDHOLDER.txt"));
				int z = ss.nextInt();
				SID = "SID"+(z+1);
				FileWriter fw = new FileWriter("data/seller/SIDHOLDER.txt");
				z=z+1;
				fw.write(new Integer(z).toString());
				fw.close();
			}
		}catch(IOException e)
			{
			System.out.println("ERR:>" + e);
			}
	}

////////////////////////////////////////////////////////////////////////////////

public void LOGIN_IN_SELLER(){
	 System.out.println("ENTER SID:");
	 SID = sc.nextLine();
	 char[] pass = cn.readPassword("ENTER YOUR PASSWORD:");
	 password = String.valueOf(pass);

	 File file = new File("data/seller/" + SID +".txt");
	 if(file.exists()){
		 try{
			 FileReader fr = new FileReader("data/seller/" + SID + ".txt");
			 BufferedReader br = new BufferedReader(fr);
			 String st; int i=0;
			 while((st = br.readLine()) != null){
				 if(i == 3){
					 if(st.equals(password))
					 {
						 System.out.println("pasword conform");
						 product pd = new product();
					 }else{
						 System.out.println("WRONG PAASWORD :[");
					 }
				 }
				 i++;
			 }
			 fr.close();
		 }catch(IOException e){
			 System.out.println(e);
		 }
	 }else{
		 System.out.println("CANNOT FIND YOU :(");
	 }
}

////////////////////////////////////////////////////////////////////////////////
	public void SAVE_SDATA(){
		try{
				String data = "\t\t$$$$$$$$ DATA $$$$$$$$$\n" + SID + "\n" + name + "\n" + password + "\n" + address + "\n\t\t$$$$$$$$$ RECORDS $$$$$$$$$$";
				File file = new File("data/seller/" + SID + ".txt");
				file.createNewFile();
				FileWriter fw = new FileWriter("data/seller/" + SID + ".txt");
				fw.write(data);
				fw.close();
		}catch(IOException e){
				System.out.println("ERR>>" + e);
		}
	}

////////////////////////////////////////////////////////////////////////////////

	public void Create_seller_Ac(){
		System.out.println("Enter name :");
		name = sc.nextLine();
		System.out.println("Enter address :");
		address = sc.nextLine();
		passwd:
		for(;;){
			password1 = cn.readPassword("Enter Password :");
			password2 = cn.readPassword("Re-enter Password :");
			if( (Arrays.equals(password1,password2)) ){
				password = String.valueOf(password1);
				System.out.println("\nPASSWORD CONFORM");
				SID_GEN();
				System.out.println("YOUR ID >> " + SID);
				SAVE_SDATA();
				break passwd;
				}
			else{
				System.out.println(" OOPS!!! Incorrect password:");
				}
			}
		}

}

//______________________________________________________________________________

class pro
{
	public static Scanner sc = new Scanner(System.in);

	public static void CREATE_AC(){
		int choice;

		System.out.println("1>create as client");
		System.out.println("2>create as seller");
		choice = sc.nextInt();

		switch(choice){
			case 1:
				client cl = new client();
				cl.Create_client_AC();
			break;
			case 2:
				seller sl = new seller();
				sl.Create_seller_Ac();
			break;
			default:
				//exit
			}
		}

	public static void select()
	{
		int choice;
		for(;;){
		System.out.println("main class");
		System.out.println("1> Create new account");
		System.out.println("2> Login as client");
		System.out.println("3> Login as seller");
		System.out.println("Enter your choice :");
		choice = sc.nextInt();

		switch(choice)
		{
			case 1:
				CREATE_AC();
			break;
			case 2:
				client cl = new client();
				cl.LOGIN_IN_CLIENT();
			break;
			case 3:
				seller sl = new seller();
				sl.LOGIN_IN_SELLER();
			break;
			default:
				break;
			}
		}
		}

	public static void main(String ayu[])
		{
			for(;;){
				select();
			}
		}
}
