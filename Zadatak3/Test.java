/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Osoba;

/**
 *
 * @author Andjela
 */
public class Test {
    public static void main(String[] args) {
		Osoba Prva = new Osoba();
		Prva.setIme("Pera");
		Prva.setPrezime("Peric");
		Prva.setJmbg("1010980710034");
		Osoba Druga = new Osoba();
		Druga.setIme("Pera");
		Druga.setPrezime("Peric");
		Druga.setJmbg("1010980710034");
		System.out.println("U pitanju " + (Prva.equals(Druga) ? "je " : "nije ") + "ista osoba");
		System.out.println(Prva.toString());
	}
}
