package Sklep;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class WczytywanieDanych {
	// Uwaga - traktowanie cen jako wartości double jest nieporządne, bo mogą pojawiać się błędy w obliczeniach
	public static Map<String, Double> wczytajCennik(String nazwaPliku) {
		Map<String, Double> cennik = new LinkedHashMap<>();
		
		// takie dziwne try to jest "try-with-resources", dostępne od Javy 7,
		// dzięki temu zapisowi plik zostanie zamknięty gdy z niego skorzystamy
		try(Scanner sc = new Scanner(new File(nazwaPliku))) {
			sc.useDelimiter(";");
			while(sc.hasNext()) {
				String nazwa = sc.next().trim();
				double cena = sc.nextDouble();
				cennik.put(nazwa, cena);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return cennik;
	}

}
