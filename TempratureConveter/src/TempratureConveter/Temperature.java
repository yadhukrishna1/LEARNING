package TempratureConveter;
import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the temprature to convert Farenheit to Celcius:");
		double f1=scan.nextDouble();
		 TempratureConverter temperatureConverter = new TempratureConverter();
		double c=temperatureConverter.convertFahrenheitToCelsius(f1);
		 System.out.println(c);
		
	}
}
