package Sklep;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Sklep2 {

	public static void main(String[] args) {
		Map<String, Double> cennik = WczytywanieDanych.wczytajCennik("cennik.csv");
		
		System.out.println("----------------");
		for (Entry<String, Double> entry : cennik.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		System.out.println("----------------");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		double razem = 0;
		while (true) {
			System.out.println("Podaj nazwę towaru: ");
			String towar = sc.nextLine().trim();
			
			if(towar.isEmpty())
				break;
			
			if (cennik.containsKey(towar)) {
				double cena = cennik.get(towar);
				System.out.println("Ile " + towar + " chcesz kupić?");
				double ilosc = sc.nextDouble();
				sc.nextLine(); // aby Scanner przeszedł do następnej linii
				double kwota = cena * ilosc;
				// System.out.println("Za " + ilosc + " towaru " + towar + " do zapłaty będzie " + kwota + " zł");
				
				razem += kwota;
			} else {
				System.out.println("Nie ma takiego towaru");
			} 
		}
		
		// System.out.println("Łącznie do zapłaty: " + razem);
		System.out.printf("Łącznie do zapłaty: %.2f zł\n", razem);
		
	}	
}
// Porządniej byłoby uzywac BigDecimal zamiast double

