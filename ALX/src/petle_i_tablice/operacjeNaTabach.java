package petle_i_tablice;

import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class operacjeNaTabach {

	public static void main(String[] args) {
		System.out.println("Start.");
		Scanner sc = new Scanner(System.in);
		System.out.println("Jak duża ma być tablica?");
		int length = sc.nextInt();
		int[] tab = new int[length];
		int x;
		System.out.println("Podaj " + length + " wartości: ");
		for (int i = 0; i < tab.length; i++) {
			tab[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(tab));

		System.out.println("*Suma: " + suma(tab));
		System.out.println("*Średnia: " + srednia(tab));
		System.out.println("*max: " + max(tab));
		System.out.println("*max - min: " + minMinusMax(tab));
		System.out.print("-Wypisz elementy większe od: ");
		x = sc.nextInt();
		wypiszWieksze(tab, x);
		System.out.print("-Wypisz pierwszy element wiekszy od: ");
		x = sc.nextInt();
		System.out.println(pierwszaWieksza(tab, x));
		System.out.print("-Wypisz sume liczb wiekszych od: ");
		x = sc.nextInt();
		System.out.println(sumaWiekszych(tab, x));
		System.out.print("-Zlicz ile elementów jest wiekszych od: ");
		x = sc.nextInt();
		System.out.println(ileWiekszych(tab, x));
		System.out.print("-Wypisz podzielne przez: ");
		x = sc.nextInt();
		wypiszPodzielne(tab, x);
		System.out.print("-Wypisz pierwszą podzielną przez: ");
		x = sc.nextInt();
		System.out.println(pierwszaPodzielna(tab, x));
		System.out.print("-Zlicz ile jest podzielnych przez: ");
		x = sc.nextInt();
		System.out.println(ilePodzielnych(tab, x));

		// <tab2>
		System.out.println("Jak duża ma być druga tablica?");
		length = sc.nextInt();
		int[] t2 = new int[length];

		System.out.println("Podaj " + length + " wartości: ");
		for (int i = 0; i < t2.length; i++) {
			t2[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(t2));
		// </tab2>

		System.out.println("Pierwszym ellementem powtarzającym się jest: " + znajdzWspolny(tab, t2));
		System.out.println("Wszystkimi elementami powtarzającymi się są: " + wszystkieWspolne(tab, t2));
		System.out.println("End.");
	}

	public static int suma(int[] tab) {

		int res = 0;
		for (int i = 0; i < tab.length; i++) {
			res += tab[i];
		}
		return res;
	}

	public static double srednia(int[] tab) {
		double res = 0;
		double sum = 0;

		if (tab.length == 0) {
			return 0.0;
		}

		for (int i = 0; i < tab.length; i++) {
			sum += tab[i];
		}
		res = sum / tab.length;
		return res;
	}

	public static int max(int[] tab) {
		int max = Integer.MIN_VALUE;

		if (tab.length == 0) {
			return 0;
		}

		for (int i = 0; i < tab.length; i++) {
			if (max < tab[i]) {
				max = tab[i];
			}
		}
		return max;
	}

	public static int minMinusMax(int[] tab) {

		if (tab.length == 0) {
			return 0;
		}

		int min = Integer.MAX_VALUE;
		int res = 0;
		for (int i = 0; i < tab.length; i++) {
			if (min > tab[i]) {
				min = tab[i];
			}
		}
		res = max(tab) - min;
		return res;
	}

	public static void wypiszWieksze(int[] tab, int x) {
		int res = 0;

		if (tab.length == 0) {
			System.out.println("tab is empty");
		}
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] > x) {
				System.out.println(tab[i]);
				res++;
			}
			if(res == 0) {
				System.out.println("nie ma");
				break;
			}
		}
	}

	public static Integer pierwszaWieksza(int[] tab, int x) {
		Integer integer;
		for (int i = 0; i < tab.length; i++) {
			integer = tab[i];
			if (x < integer) {
				return tab[i];
			}
		}
		return null;
	}

	public static int sumaWiekszych(int[] tab, int x) {
		int res = 0;
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] > x) {
				res += tab[i];
			}
		}
		return res;
	}

	public static int ileWiekszych(int[] tab, int x) {
		int res = 0;
		for (int i = 0; i < tab.length; i++) {
			if (x < tab[i]) {
				res++;
			}
		}
		return res;
	}

	public static void wypiszPodzielne(int[] tab, int x) {
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] % x == 0) {
				System.out.println(tab[i]);
			}
		}

	}

	public static Integer pierwszaPodzielna(int[] tab, int x) {
		Integer integer = 0;
		for (int i = 0; i < tab.length; i++) {
			integer = tab[i];
			if (integer % x == 0) {
				return integer;
			}
		}
		return null;
	}

	public static int ilePodzielnych(int[] tab, int x) {
		int res = 0;
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] % x == 0) {
				res++;
			}
		}

		return res;
	}

	public static Integer znajdzWspolny(int[] t1, int[] t2) {
		int scan;
		for (int i = 0; i < t1.length; i++) {
			scan = t1[i];
			for (int j = 0; j < t2.length; j++) {
				if (scan == t2[j]) {
					return t2[j];
				}
			}
		}
		return null;
	}

	public static List<Integer> wszystkieWspolne(int[] t1, int[] t2) {
		List<Integer> listaWspolnych = new ArrayList();

		int scan;
		for (int i = 0; i < t1.length; i++) {
			scan = t1[i];
			for (int j = 0; j < t2.length; j++) {
				if (scan == t2[j]) {
					listaWspolnych.add(t2[j]);
				}
			}
		}
		return listaWspolnych;
	}
}