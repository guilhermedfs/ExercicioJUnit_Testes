package bonus;

public class BONUS{
	int sales[] = null, maxSales = 0,  salary[] = null;
	static boolean found;
	static int linc = 100;
	static int sinc = 200;
	static int  lsalary = 15000;
	char code[] = null;
	static char mgr = 'M';
    static int i;
	static int j;
	static int k;
    static int errCode;
    int eSize = 0, dSize = 0;
    String emptabdept[], depttabdept[];

	public static int calculaSalary(int maxSales, int sales[], String emptabdept[], String depttabdept[], char code[], int []salary, int dSize, int eSize){

    	errCode = 0;
    	if(eSize <= 0 | dSize <= 0) {
    		errCode = 1;
    		
    	} else {
    		for(i = 0;i < dSize; i++) {
    			if(sales[i] >= maxSales) {
    				maxSales = sales[i];
    			}
    		}
    		for(j = 0; j < dSize; j++) {
    			if(sales[i] == maxSales) {
    				found = false;
    				for(k = 0; k < eSize; k++) {
    					if(emptabdept[k] == depttabdept[j]) {
    						found = true;
    						if(salary[k] >= lsalary | code[k] == mgr) {
    							salary[k] = salary[k]+linc;
    						} else {
    							salary[k] = salary[k]+sinc;
    						}
    					}
    				}
    				if(found == false) errCode= 2;
    			}
    		}
    	}
    	return errCode;
    }


}