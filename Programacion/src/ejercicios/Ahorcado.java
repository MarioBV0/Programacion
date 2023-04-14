package ejercicios;
import java.util.Scanner;

public class Ahorcado {

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	String Adivinanza = "";
        
    	String [] palabras = {"farola","parque","pizarra","españa","hugo","nati","teclado"};
    	
    	int	intentos = 0;
    	 String palabra1 = new String(new char[palabraElegida.length()]).replace("\0", "_");
    	
    	

		 
			 
			 
		 int palabra1=(int) Math.floor(Math.random() * palabras.length);
			 
			 String fin=palabras[palabra1];
			 
			 System.out.println(fin);
			 
			 char[] let = fin.toCharArray();
			 
			 
			
			 
			 do {
				 
				 intentos = intentos +1;
				 
			 
    	System.out.println("¡Bienvenido al ahorcado!, introduzca la primera letra");
		char c = sc.next().charAt(0);
    	
		
		
		
			
			
		
    	for (int n=0;n<fin.length();n++) {
    		
    		
    		
    	if(fin.charAt(n) == c) {
    		Pista = Pista.substring(0, n) + c + Pista.substring(n + 1);
    	}
    	
    		
    			
    	
    	
    	
    	}
    	
    	
    	
    	
    	
    	
    	
    	
    	
	
    	
    	
    	
    	
    	
    	
    
    

    	
    	
			 }while(intentos < 10);
			 
    }
    
}
				 
    	
    	
    


    	

