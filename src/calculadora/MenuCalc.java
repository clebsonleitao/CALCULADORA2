package calculadora;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author Clebson Leitao
 */
public class MenuCalc {
        public static void main(String[] args) {
	    calculadora calculadora;
            calculadora = new calculadora();
		float codigo1;
		float codigo2;
                float tipo = 5;
                
                 Scanner input = new Scanner(System.in); 
            System.out.println("***********************");     
	    System.out.println("1. Soma");  
	    System.out.println("2. Subtrair");  
	    System.out.println("3. Multiplicar");  
	    System.out.println("4. Dividir");  
	    System.out.println("0. Sair");
            System.out.println("***********************");  

	    System.out.println("select: "); 
            System.out.println("***********************");  

            
	    tipo = input.nextInt();
	    while (tipo != 0) {
	    	if (tipo == 1) {
	    		
	    	    Scanner input1 = new Scanner(System.in); 
	    		System.out.println("primeiro numero: ");
	    		 codigo1 = input1.nextFloat();
	    		System.out.println(" segundo numero: ");
	    		codigo2 = input1.nextFloat();
	    		 /***/
	    			float select = calculadora.som(codigo1,codigo2);
	    			System.out.println(select);
	    		break;
	    	}
	    	 	if (tipo == 2) {
	    	 		  Scanner input1 = new Scanner(System.in);
	  	    		System.out.println("primeiro numero: ");
	  	    		 codigo1 = input1.nextFloat();
	  	    		System.out.println(" segundo numero: ");
	  	    		codigo2 = input1.nextFloat();
	  	    			float select = calculadora.sub(codigo1, codigo2);
	  	    			System.out.println(select);
		    		break;
		    		}
		    	if (tipo == 3) {
		    	 	   Scanner input1 = new Scanner(System.in); 
		  	    		System.out.println(" primeiro numero: ");
		  	    		codigo1 = input1.nextFloat();
		  	    		System.out.println("segundo numero: ");
		  	    		 codigo2 = input1.nextFloat();
		  	    			float select = calculadora.mult(codigo1, codigo2);
		  	    			System.out.println(select);
			    		break;
		    	 	}
			if (tipo == 4) {
			    	 		  Scanner input1 = new Scanner(System.in); 
			  	    		System.out.println(" primeiro numero: ");
			  	    		codigo1 = input1.nextFloat();
			  	    		System.out.println(" segundo numero: ");
			  	    		 codigo2 = input1.nextFloat();
			  	    			float select = calculadora.div(codigo1, codigo2);
			  	    			System.out.println(select);
				    		break;
				    		}
                                      
	    }
	}
}