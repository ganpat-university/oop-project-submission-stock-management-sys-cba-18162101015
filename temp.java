import java.util.Scanner;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.*;
import java.io.IOException;

class temp
{
	public static Scanner sc = new Scanner(System.in);

	public void BUY_product(){
		String str,id;
		String type = new String();
		int w.Stock;
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
				System.out.println("ERR:" + e);
			}
			}


		public static void main(String[] args)
    {
			temp t = new temp();
			t.BUY_product();
    }
}
