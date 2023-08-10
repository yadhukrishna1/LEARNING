package Conditional;
import java.util.Scanner;

public class Conditional {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Ente a number:");
		int marks=scan.nextInt();
		System.out.println("Welocome to kodnest");
		Tech(marks);
	}
	public static void Tech(int marks)
	{
		if(marks>=80)
		{
		System.out.println("Welcome to Techclub");
		}
	}
	

}
