package Zagadka_matematyczna;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * TODO random 1-10 podaje diwe liczby i pyta jaki jest ich iloczyn user daje
		 * wynik do momentu az zgadnie
		 */
		Scanner sc = new Scanner(System.in);
		int randomNumber = (int) (Math.random() * 11);
		int randomNumber2 = (int) (Math.random() * 11);
		System.out.println("Wylosowano " + randomNumber + " i " + randomNumber2);
		System.out.println("Jaki będzie wynik mnożenia tych dwóch liczb?");
		while (true) {

			System.out.print(": ");
			int result = randomNumber * randomNumber2;
			int userInput = sc.nextInt();
			if (userInput == result) {
				System.out.println("good");
				break;
			} else
				System.out.println("bad, try again");

		}

	}

}
