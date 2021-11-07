package ui;
import java.util.Scanner;


public class Main {
	
	private static Scanner sc;
	private static int aux[];
	private int movements = 0;
	
		
	public Main() {
		
		aux = new int[3];
		sc = new Scanner(System.in);
	}
	
	public static void main(String[] args) {
		
		Main main = new Main();
		
		System.out.println("//////////////////////////");
		System.out.println("Hola bienvenid@ :D");
		System.out.print("Escribe la cantidad: ");
		int x = sc.nextInt();
				
		int[] calculate = new int[x];
		
		for(int i = 0;i<calculate.length;i++) {
			
			calculate[i] = main.input();
		}
		
		for(int i=0; i<calculate.length;i++) {
			
			main.initialize(calculate[i]);
		}
	}
	
	
	public void createAux(int n) {
		
		aux[0] = n;
		aux[1] = 0;
		aux[2] = 0;
	}
	
	public int input() {
		
		System.out.print("Ahora escribe el numero de discos: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		return n;
	}
	
	public void initialize(int n) {
		
		movements = 0;
		
		System.out.println("\n--Operacion para el disco "+n);
		createAux(n);
		System.out.println(printAux());
		solve(n, aux[0], aux[1], aux[2], 0, 1, 2);
		System.out.println("Final " + printAux() + "\n");
		System.out.println("Total de movimientos: "+movements);
		System.out.println("2^"+n+" - 1  = "+(Math.pow(2, n)-1));
	}
	
	public void solve(int n, int origin, int aux, int destiny, int tower1, int tower2, int tower3) {
		
		if(n==1) {
			
			
			movements++;
			System.out.println(printAux());
			
		} else {

			solve(n - 1, origin, destiny, aux, tower1, tower3, tower2);
			
			movements++;
			System.out.println(printAux());
			solve(n-1, aux, origin, destiny, tower2, tower1, tower3);
		}
	}
	
	public int upload(int power) {
		
		int num = 0;
		num = (int) Math.pow(2, power)-1;
		
		return num;
	}
	
		
	
	public String printAux() {
		
		return "["+aux[0]+"] "+"["+aux[1]+"] "+"["+aux[2]+"]";
	}
	
	
	public int[] getAux() {
		
		return aux;
	}
	
	public void setAux(int[] aux) {
		
		Main.aux = aux;
	}
	
	
}
