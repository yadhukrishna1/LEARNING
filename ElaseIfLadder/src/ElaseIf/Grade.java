package ElaseIf;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enetr the mark");
		int mark=scan.nextInt();
		GradeCheck g1=new GradeCheck();
		g1.score(mark);
	}
	

}

