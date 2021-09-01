package tests;
import junit.framework.*;
import bonus.BONUS;

public class BonusCoberturaMultiplasCondicoesEAnaliseLimiteTest extends TestCase{
	public void testcalculaSalary1() { //Casos 1, 4, 7, 17, 20 do slide
		int sales [] = {10000};
		String emptab[] = {"D42"};
		String depttab[] = {"D42"};
		char code[] = {' ', ' ', ' '};
		int salary[] = {14999};
		int eSize = 1;
		int dSize = 1;
		int RetornoEsperado = 0;
		int RetornoFeito = BONUS.calculaSalary(sales, emptab, depttab, code, salary, eSize, dSize);
		
		assertEquals(RetornoEsperado, RetornoFeito, 0);
	}
	
	public void testcalculaSalary2() { //Casos 10, 14, 18
		int sales [] = {10000, 10000, 10000, 10000};
		String emptab[] = {"D42", "D33", "D45", "D42"};
		String depttab[] = {"D42", "D33", "D12", "D45"};
		char code[] = {'M', 'M', 'E', 'E'};
		int salary[] = {17000, 23000, 15000, 10000};
		int eSize = 4;
		int dSize = 4;
		int RetornoEsperado = 0;
		int RetornoFeito = BONUS.calculaSalary(sales, emptab, depttab, code, salary, eSize, dSize);
		
		assertEquals(RetornoEsperado, RetornoFeito, 0);
	}
	
	public void testcalculaSalary3() { //Casos 24
		int sales [] = {20000, 20000};
		String emptab[] = {"D67", "D22"};
		String depttab[] = {"D66", "D67"};
		char code[] = {'E', 'E'};
		int salary[] = {10000, 33333};
		int eSize = 2;
		int dSize = 2;
		int RetornoEsperado = 2;
		int RetornoFeito = BONUS.calculaSalary(sales, emptab, depttab, code, salary, eSize, dSize);
		
		assertEquals(RetornoEsperado, RetornoFeito, 0);
	}
	
	}
