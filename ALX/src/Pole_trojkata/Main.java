package Pole_trojkata;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// odczytaj 3 liczby, sprawddz
		// czy liczby moga tworzyć trojkat
		// sqrt(p(p-a)(p-b)(p-c))
System.out.println("Starting...");
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a,b,c : ");
		int a = sc.nextInt(),
				b=sc.nextInt(),
				c=sc.nextInt();
		
		int p = (a+b+c)/2;
		
		int wynik = (int)(Math.sqrt(p*(p-a)*(p-b)*(p-c)));
		System.out.println("Pole: " + wynik);
		if(wynik != 0) {
			System.out.println("Można.");
		}else
			System.out.println("Nie można.");
	}

}
