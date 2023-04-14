package Orientadaobjetos;

public class Password {
	
	
	private final static int LONG_DEF=8;
	
	private int longitud;
	private String contraseña;
	
  
    public int getLongitud() {
        return longitud;
    }
  
   
    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
  
    
    public String getContraseña() {
        return contraseña;
    }
	
	public String generaPassword() {
		
		String password="";
		 for (int i=0;i<longitud;i++){
	            int eleccion=((int)Math.floor(Math.random()*3+1));
	            
	  
	            	if(eleccion == 1) {
	            		char min=(char)((int)Math.floor(Math.random()*(123-97)+97));
	                    password+=min;
	                    
	                
	                    
	            	}else{
	                    char num=(char)((int)Math.floor(Math.random()*(58-48)+48));
	                    password+=num;
	                    
	               
	            	}
		 }
		 return password;
	}
	
	
	public Password (int longitud){
	    this.longitud=longitud;
	    contraseña=generaPassword();
	}
	
	public boolean compro(){
        int cuentnum=0;
        int cuentmin=0;
        int cuentmay=0;
        
        for (int i=0;i<contraseña.length();i++){
                if (contraseña.charAt(i)>=97 && contraseña.charAt(i)<=122){
                    cuentmin+=1;
                }else{
                    if (contraseña.charAt(i)>=65 && contraseña.charAt(i)<=90){
                        cuentmay+=1;
                }else{
                    cuentnum+=1;
                    }
                }
            }
		
		 
		


	
        if (cuentnum>=5 && cuentmin>=1 && cuentmay>=2){
            return true;
        }else{
            return false;
        }
    }


public Password (){
    this(LONG_DEF);
}



}

	
	
	


