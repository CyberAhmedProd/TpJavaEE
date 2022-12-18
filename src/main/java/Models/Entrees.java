package Models;

public class Entrees {
	private int e1;
	private int e2;
	
	public Entrees() {
		// TODO Auto-generated constructor stub
	}

	public Entrees(int e1, int e2) {
		super();
		this.e1 = e1;
		this.e2 = e2;
	}
	public int pgcd(int a,int b) {
		int r = a;
		while (r!=0)  
		{
			r = a%b; a=b; b=r;
		}
		return(Math.abs(a));
	}
	public int ppcm (int a, int b) {
		int Produit, Reste, PPCM;
			
		Produit = a*b;
		Reste   = a%b;
		while(Reste != 0){
		    a = b;
		    b = Reste;
		    Reste = a%b;
	        }
		PPCM = Produit/b;
		return PPCM;		
	}
	public int getE1() {
		return e1;
	}

	public void setE1(int e1) {
		this.e1 = e1;
	}
	
	public int getE2() {
		return e2;
	}

	public void setE2(int e2) {
		this.e2 = e2;
	}

}
