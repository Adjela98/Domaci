/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biblioteka2;

import java.util.Objects;

/**
 *
 * @author Andjela
 */
public class Knjiga {
    private String naslov;
	private String autor;
	private String ISBN;
	
	public String getNaslov() {
		return naslov;
	}
	public void setNaslov(String naslov) {
		if (naslov != null) {
			this.naslov = naslov;
		} else {
			System.out.println("Greska: Niste uneli naslov");
		}
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		if (autor != null) {
			this.autor = autor;
		} else {
			System.out.println("Greska: Niste uneli autora");
		}
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		if (iSBN != null) {
			ISBN = iSBN;
		} else {
			System.out.println("Greska: NIste uneli ISBN");
		}
	}
	@Override
	public String toString() {
		return "Knjiga: naslov: " + naslov + ", autor: " + autor + ", ISBN: " + ISBN;
	}
	@Override
	public boolean equals(Object object) {
		if (object == this) {
			return true;
		}
		
		if (!(object instanceof Knjiga)) {
			return false;
		}
		
		Knjiga knjiga = (Knjiga) object;
		
		return this.ISBN.equals(knjiga.ISBN); 
	}

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.ISBN);
        return hash;
    }
}
