package ConditionalConstructs;
import java.util.Scanner;

public class Welcome {
	public static void main(String[] args) {
		
		//Scanner scan= new Scanner(System.in);
		//System.out.println("Ente a number:");
		//int marks=scan.nextInt();
		System.out.println("Welocome to kodnest");
		TechClub();
	}
	public static void TechClub() {

		Scanner scan= new Scanner(System.in);
		System.out.println("Ente a number:");
		int marks=scan.nextInt();
		if(marks>=80)
		{
		System.out.println("Welcome to Techclub");
		}
		
		
	}

}
