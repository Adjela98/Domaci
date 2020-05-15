/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Osoba;

import java.util.Objects;

/**
 *
 * @author Andjela
 */
public class Osoba {private String ime = "N";
	private String prezime = "N";
	private String jmbg;
	
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		if (ime != null) {
			this.ime = ime;
		} else {
			System.out.println("Greska: Ime ima null vrednost");
		}
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		if (prezime != null) {
			this.prezime = prezime;
		} else {
			System.out.println("Greska: Prezime ima null vrednost");
		}
	}
	public String getJmbg() {
		return jmbg;
	}
	public void setJmbg(String jmbg) {
		if (jmbg != null) {
			this.jmbg = jmbg;
		} else {
			System.out.println("Greska: JMBG ima null vrednost");
		}
	}
	
	@Override
	public String toString() {
		return "Osoba ime: " + ime + ", prezime: " + prezime + ", jmbg: " + jmbg + "]";
	}
	
	@Override
	public boolean equals(Object object) {
		if (object == this) {
			return true;
		}
		
		if (!(object instanceof Osoba)) {
			System.out.println("Greska: Nije unet objekat klase Osoba");
			return false; 
		}
		
		Osoba osoba = (Osoba) object;
		
    return this.ime.equals(osoba.ime) && this.prezime.equals(osoba.prezime) && this.jmbg.equals(osoba.jmbg);
	}

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.ime);
        hash = 53 * hash + Objects.hashCode(this.prezime);
        hash = 53 * hash + Objects.hashCode(this.jmbg);
        return hash;
    }
}
