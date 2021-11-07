package ui;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Test {
	
	private Main main;
	
	public void StageA() {
		
		main = new Main();
	}
	
	public void StageB() {
		
		main = new Main();
		main.createAux(6);
	}
	
	@Test
	public void testCreateaux() {
		
		StageA();
		
		main.createAux(4);
		int[] aux = main.getAux();
		assertEquals(aux[0], 4);
	}
	
	@Test
	public void testSolve() {
		
		StageB();
		int[] aux = main.getaux();
		int n = aux[0];
		
		main.solve(n, aux[0], aux[1], aux[2], 0, 1, 2);
		assertEquals(6, aux[2]);
	}
	
	@Test
	public void testMultipleSolve() {
		
		StageA();
		main.createAux(0);
		int[] aux = main.getAux();

		aux[0] = 1;
		aux[1] = 0;
		aux[2] = 0;
		main.solve(1, aux[0], aux[1], aux[2], 0, 1, 2);
		assertNotEquals(1, aux[0]);
		
		aux[0] = 2;
		aux[1] = 0;
		aux[2] = 0;
		main.solve(2, aux[0], aux[2], aux[2], 0, 1, 2);
		assertNotEquals(2, aux[0]);
		
		aux[0] = 3;
		aux[1] = 0;
		aux[2] = 0;
		main.solve(3, aux[0], aux[1], aux[2], 0, 1, 2);
		assertNotEquals(1, aux[0]);
		
		aux[0] = 4;
		aux[1] = 0;
		aux[2] = 0;
		main.solve(4, aux[0], aux[1], aux[2], 0, 1, 2);
		assertNotEquals(1, aux[0]);
		
		aux[0] = 5;
		aux[1] = 0;
		aux[2] = 0;
		main.solve(5, aux[0], aux[1], aux[2], 0, 1, 2);
		assertNotEquals(1, aux[0]);
		
		aux[0] = 6;
		aux[1] = 0;
		aux[2] = 0;
		main.solve(6, aux[0], aux[1], aux[2], 0, 1, 2);
		assertNotEquals(1, aux[0]);
		
		aux[0] = 7;
		aux[1] = 0;
		aux[2] = 0;
		main.solve(7, aux[0], aux[1], aux[2], 0, 1, 2);
		assertNotEquals(1, aux[0]);
		
		aux[0] = 8;
		aux[1] = 0;
		aux[2] = 0;
		main.solve(8, aux[0], aux[1], aux[2], 0, 1, 2);
		assertNotEquals(1, aux[0]);
		
		aux[0] = 9;
		aux[1] = 0;
		aux[2] = 0;
		main.solve(9, aux[0], aux[1], aux[2], 0, 1, 2);
		assertNotEquals(1, aux[0]);
		
		aux[0] = 10;
		aux[1] = 0;
		aux[2] = 0;
		main.solve(10, aux[0], aux[1], aux[2], 0, 1, 2);
		assertNotEquals(1, aux[0]);
		
		aux[0] = 11;
		aux[1] = 0;
		aux[2] = 0;
		main.solve(11, aux[0], aux[1], aux[2], 0, 1, 2);
		assertNotEquals(1, aux[0]);
	
		aux[0] = 12;
		aux[1] = 0;
		aux[2] = 0;
		main.solve(12, aux[0], aux[1], aux[2], 0, 1, 2);
		assertNotEquals(1, aux[0]);
		
		aux[0] = 13;
		aux[1] = 0;
		aux[2] = 0;
		main.solve(13, aux[0], aux[1], aux[2], 0, 1, 2);
		assertNotEquals(1, aux[0]);
		
		aux[0] = 14;
		aux[1] = 0;
		aux[2] = 0;
		main.solve(14, aux[0], aux[1], aux[2], 0, 1, 2);
		assertNotEquals(1, aux[0]);
		
		aux[0] = 15;
		aux[1] = 0;
		aux[2] = 0;
		main.solve(15, aux[0], aux[1], aux[2], 0, 1, 2);
		assertNotEquals(1, aux[0]);
		
		aux[0] = 16;
		aux[1] = 0;
		aux[2] = 0;
		main.solve(16, aux[0], aux[1], aux[2], 0, 1, 2);
		assertNotEquals(1, aux[0]);
		
		aux[0] = 17;
		aux[1] = 0;
		aux[2] = 0;
		main.solve(17, aux[0], aux[1], aux[2], 0, 1, 2);
		assertNotEquals(1, aux[0]);
		
		aux[0] = 18;
		aux[1] = 0;
		aux[2] = 0;
		main.solve(18, aux[0], aux[1], aux[2], 0, 1, 2);
		assertNotEquals(1, aux[0]);
		
		aux[0] = 19;
		aux[1] = 0;
		aux[2] = 0;
		main.solve(19, aux[0], aux[1], aux[2], 0, 1, 2);
		assertNotEquals(1, aux[0]);
		
		aux[0] = 20;
		aux[1] = 0;
		aux[2] = 0;
		main.solve(20, aux[0], aux[1], aux[2], 0, 1, 2);
		assertNotEquals(1, aux[0]);
		
		aux[0] = 21;
		aux[1] = 0;
		aux[2] = 0;
		main.solve(21, aux[0], aux[1], aux[2], 0, 1, 2);
		assertNotEquals(1, aux[0]);
		
		aux[0] = 22;
		aux[1] = 0;
		aux[2] = 0;
		main.solve(22, aux[0], aux[1], aux[2], 0, 1, 2);
		assertNotEquals(1, aux[0]);
		
		aux[0] = 23;
		aux[1] = 0;
		aux[2] = 0;
		main.solve(23, aux[0], aux[1], aux[2], 0, 1, 2);
		assertNotEquals(1, aux[0]);
		
		aux[0] = 24;
		aux[1] = 0;
		aux[2] = 0;
		main.solve(24, aux[0], aux[1], aux[2], 0, 1, 2);
		assertNotEquals(1, aux[0]);
		
		aux[0] = 25;
		aux[1] = 0;
		aux[2] = 0;
		main.solve(25, aux[0], aux[1], aux[2], 0, 1, 2);
		assertNotEquals(1, aux[0]);
		
		aux[0] = 26;
		aux[1] = 0;
		aux[2] = 0;
		main.solve(26, aux[0], aux[1], aux[2], 0, 1, 2);
		assertNotEquals(1, aux[0]);
		
		aux[0] = 27;
		aux[1] = 0;
		aux[2] = 0;
		main.solve(27, aux[0], aux[1], aux[2], 0, 1, 2);
		assertNotEquals(1, aux[0]);
		
		aux[0] = 28;
		aux[1] = 0;
		aux[2] = 0;
		main.solve(28, aux[0], aux[1], aux[2], 0, 1, 2);
		assertNotEquals(1, aux[0]);
		
		aux[0] = 29;
		aux[1] = 0;
		aux[2] = 0;
		main.solve(29, aux[0], aux[1], aux[2], 0, 1, 2);
		assertNotEquals(1, aux[0]);
		
		aux[0] = 30;
		aux[1] = 0;
		aux[2] = 0;
		main.solve(30, aux[0], aux[1], aux[2], 0, 1, 2);
		assertNotEquals(1, aux[0]);
	
	}
}