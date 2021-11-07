package model;

public class Hanoi {

	private int aux[]; 
	
	
	public Hanoi() {

		aux = new int[3];
	}
	
	
	public void create(int n) {

		aux[0] = n;
		aux[1] = 0;
		aux[2] = 0;
	}
		
	
	public String printAux() {

		return "A:[" + aux[0] + "] " + "B:[" + aux[1] + "] " + "C:[" + aux[2] + "]";
	}
	
	public int[] getAux() {
		return aux;
	}

	public void setAux(int[] aux) {
		this.aux = aux;
	}
}