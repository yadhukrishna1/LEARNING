package SwitchStatement;
import java.util.Scanner;

public class Day {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enetr number between 1-7");
	int day=scan.nextInt();
	DayApp d1=new DayApp();
	d1.dayCheck(day);
}
}
