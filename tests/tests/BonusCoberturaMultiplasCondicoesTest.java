package tests;
import junit.framework.*;
import bonus.BONUS;

public class BonusCoberturaMultiplasCondicoesTest extends TestCase{
	public void testcalculaSalary1() {
		int sales [] = {};
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
		String emptab[] = {"", "", ""};
		String depttab[] = {"", "", ""};
		char code[] = {' ', ' ', ' '};
		int salary[] = {};
		int eSize = 0;
		int dSize = 1;
		int RetornoEsperado = 1;
		int RetornoFeito = BONUS.calculaSalary(3, sales, emptab, depttab, code, salary, eSize, dSize);
		
		assertEquals(RetornoEsperado, RetornoFeito, 0);
	}
	
	public void testcalculaSalary3() {
		int sales [] = {};
		String emptab[] = {"", "", ""};
		String depttab[] = {"", "", ""};
		char code[] = {' ', ' ', ' '};
		int salary[] = {};
		int eSize = 1;
		int dSize = 0;
		int RetornoEsperado = 1;
		int RetornoFeito = BONUS.calculaSalary(3, sales, emptab, depttab, code, salary, eSize, dSize);
		
		assertEquals(RetornoEsperado, RetornoFeito, 0);
	}
	
	public void testcalculaSalary4() {
		int sales [] = {10000, 8000, 10000, 10000};
		String emptab[] = {"D42", "D95", "D42", "D95", "D32"};
		String depttab[] = {"D42", "D32", "D95", "D44"};
		char code[] = {'M', 'M', 'E', 'E', 'E'};
		int salary[] = {};
		int eSize = 5;
		int dSize = 4;
		int RetornoEsperado = 1;
		int RetornoFeito = BONUS.calculaSalary(3, sales, emptab, depttab, code, salary, eSize, dSize);
		
		assertEquals(RetornoEsperado, RetornoFeito, 0);
	}
}
