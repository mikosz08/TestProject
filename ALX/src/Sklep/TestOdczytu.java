package Sklep;

import java.util.Map;

public class TestOdczytu {

	public static void main(String[] args) {
		Map<String, Double> cennik = WczytywanieDanych.wczytajCennik("cennik.csv");
		System.out.println(cennik);
	}
	
}
