/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String;

/**
 *
 * @author Andjela
 */
public class AndjelaJovanovic {private String s1;
	private String s2;
	
	public String getS1() {
		return s1;
	}
	public void setS1(String s1) {
		this.s1 = s1;
	}
	public String getS2() {
		return s2;
	}
	public void setS2(String s2) {
		this.s2 = s2;
	}
	
	public int brojPonavljanja(String a, String b) {
		if (a.indexOf(b) == -1) {
			return 0;
		}
		return 1 + brojPonavljanja(a.substring(a.indexOf(b) + b.length()), b);
	}
    
}
