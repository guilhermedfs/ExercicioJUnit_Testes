package tests;
import junit.framework.*;
import bonus.BONUS;

public class BonusCoberturaCondicoesTest extends TestCase{
	public void testcalculaSalary1() {
		int sales [] = {10000, 8000, 10000};
		String emptab[] = {"", "", ""};
		String depttab[] = {"", "", ""};
		char code[] = {' ', ' ', ' '};
		int salary[] = {};
		int eSize = 0;
		int dSize = 0;
		int RetornoEsperado = 1;
		int RetornoFeito = BONUS.calculaSalary(3, sales, emptab, depttab, code, salary, eSize, dSize);
		
		assertEquals(RetornoEsperado, RetornoFeito, 0);
	}
	
	public void testcalculaSalary2() {
		int sales [] = {10000, 8000, 10000};
		String emptab[] = {"D42", "D32", "D42"};
		String depttab[] = {"D42", "D32", "D95"};
		char code[] = {'E', 'E', 'M'};
		int salary[] = {21000, 14000, 10000};
		int eSize = 3;
		int dSize = 3;
		int RetornoEsperado = 2;
		int RetornoFeito = BONUS.calculaSalary(3, sales, emptab, depttab, code, salary, eSize, dSize);
		
		assertEquals(RetornoEsperado, RetornoFeito, 0);
	}
}

