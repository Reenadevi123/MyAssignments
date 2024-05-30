package week1.day2;

public class Fact_call_method {

	public static int getFactorial(int num) {
		
	
//Initializing factorial=1 and for every iteration the factorial value is multiplied by i and assigned back to factorial
		int i,factorial=1;
		for(i=1;i<=num;i++) {
			
				
				 factorial*=i;
          
          	
        }
		System.out.println(factorial);
      return num;
    }
     
 
	public static void main(String[] args) {
		Fact_call_method fac=new Fact_call_method();
      fac.getFactorial(6);
		
	}

}





