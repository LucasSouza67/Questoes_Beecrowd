package iniciante;

import java.util.Scanner;

public class Animal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String animal = "";

		String caracteristica = sc.next();
		String caracteristica1 = sc.next();
		String caracteristica2 = sc.next();

		if (caracteristica.equalsIgnoreCase("vertebrado")) {
			if (caracteristica1.equalsIgnoreCase("ave")) {
				if (caracteristica2.equalsIgnoreCase("carnivoro"))
					animal = "aguia";
				else
					animal = "pomba";
			} else {
				if (caracteristica2.equalsIgnoreCase("onivoro"))
					animal = "homem";
				else
					animal = "vaca";
			}
		} else {
			if (caracteristica1.equalsIgnoreCase("inseto")) {
				if (caracteristica2.equalsIgnoreCase("hematofago"))
					animal = "pulga";
				else
					animal = "lagarta";
			} else {
				if (caracteristica2.equalsIgnoreCase("hematofago"))
					animal = "sanguessuga";
				else
					animal = "minhoca";
			}
		}

		sc.close();

		System.out.println(animal);

	}

}
