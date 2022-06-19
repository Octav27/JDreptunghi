package application;
public class Placa {
	public int grosime, lung1,lung2;
	public Placa() {
		;
	}
	public Placa(int grosime, int lung1, int lung2) {
		this.grosime = grosime;
		this.lung1 = lung1;
		this.lung2 = lung2;
	}
	
	public String inFile() {
		return 	String.valueOf(grosime) + ' ' + lung1 + ' '+ lung2; 
		
	}
	
	
}
