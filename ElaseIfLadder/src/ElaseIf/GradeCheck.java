package ElaseIf;

public class GradeCheck {
	void score(int m)
	{
		if( m>=90)
		{
			System.out.println("Grade A+");
			
		}
		else if(m>=80 && m<90)
		{
			System.out.println("Grade A");
			
		}
		else if(m>=70 && m<80)
		{
			System.out.println("Grade B");
			
		}
		else if(m>=60 && m<70)
		{
			System.out.println("Grade C");
			
		}
		else if(m>=50 && m<60)
		{
			System.out.println("Grade D");
			
		}
		else
		{
			System.out.println("Failed...");
		}
	}

}


