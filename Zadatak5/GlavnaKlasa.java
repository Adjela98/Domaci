/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String;

import java.util.Scanner;

/**
 *
 * @author Andjela
 */
public class GlavnaKlasa {

	public static void main(String[] args) {
            try (Scanner scan = new Scanner(System.in)) {
                AndjelaJovanovic cs = new AndjelaJovanovic();
                cs.setS1(scan.nextLine());
                cs.setS2(scan.nextLine());
                System.out.println("Broj ponavljanja = " + cs.brojPonavljanja(cs.getS1(), cs.getS2()));
                System.out.println();
            }
	}
}
