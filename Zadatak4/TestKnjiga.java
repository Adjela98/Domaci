/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biblioteka2;

/**
 *
 * @author Andjela
 */
public class TestKnjiga{

	public static void main(String[] args) {
		Knjiga Prva = new Knjiga();
		Prva.setNaslov("Istorija lepote");
		Prva.setAutor("Umberto Eko");
		Prva.setISBN("0-234-567");
		Knjiga Druga = new Knjiga();
		Druga.setNaslov("Istorija ruznoce");
		Druga.setAutor("Umberto Eko");
		Druga.setISBN("0-567-890");
		System.out.println("Ove knjige " + (Prva.equals(Druga) ? "jesu " : "nisu ") + "iste");
		System.out.println(Prva.toString());
		System.out.println(Druga.toString());
	}

}
    

