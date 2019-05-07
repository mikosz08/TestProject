package Statystyki;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int licznik = 0;
		double suma = 0;
		double MAX = Double.MIN_VALUE;
		double MIN = Double.MAX_VALUE;
		double next;
		System.out.println("Podawaj liczby jakby nie było jutra");

		while (sc.hasNext()) {

			try {
				next = sc.nextDouble();
				suma += next;
				licznik++;
			} catch (InputMismatchException e) {
				break;
			}
			if (MAX < next) {
				MAX = next;
			}
			if (MIN > next) {
				MIN = next;
			}

		}
		System.out.println("Podano " + licznik + " liczb/y");
		System.out.println("Ich suma to " + suma);
		double srednia = suma / licznik;
		System.out.println("Ich średnia to " + srednia);
		System.out.println("Najmniejszą liczbą było/a : " + MIN);
		System.out.println("Największą liczbą było/a : " + MAX);

	}

}
