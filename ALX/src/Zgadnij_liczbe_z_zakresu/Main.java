package Zgadnij_liczbe_z_zakresu;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * TODO Auto-generated method stub zgadnij liczbe z zakresu 0 - 999 program mowi
		 * czy odgadnieta liczba jest za duza czy za mala po wygranej program mowi ile
		 * prob wykonal uzytkownik
		 */
		System.out.println(".:Zgadnij liczbe:. (0-999) \n : ");
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int randNum = r.nextInt(1000);
		// System.out.println(randNum);
		int res;
		int counter = 0;
		while (true) {
			res = sc.nextInt();
			if (res == randNum) {
				System.out.println("win");
				break;
			} /*
				 * else if (res > 999 / 2 && res > randNum) { System.out.println("mnieeej"); }
				 */else if (res > randNum) {
				System.out.println("Mnieeej");
			} /*
				 * else if (res < 999 / 2 && res < randNum ) { System.out.println("wincyyyyj");
				 * }
				 */else if (res < randNum) {
				System.out.println("Więęcej");
			}
			counter++;
		}
		System.out.println("Udało Ci się zgadnąć w: " + counter + " próbach.");
	}

}
