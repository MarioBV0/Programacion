package Barajas;

public class Baraja {
	
	private carta cartas[];
	public static final int num_cartas=40;
	private int posicionsiguiente = 0;
	
	public Baraja() {
		this.cartas = new carta[num_cartas];
		this.posicionsiguiente = 0;
		crearBaraja();
		barajar();
	}
	
	
	
	private void crearBaraja() {
		String[] palos = carta.PALOS;
		
		int indice = 0;
		
		 for (int n=0;n<palos.length;n++) {
			 for (int i=0;i<carta.lim;i++) {
				 
				 cartas[indice] = new carta(i + 1, palos[n]);
				 indice++;
             
         }
		 }
	}
	
	

	
		
		
public void barajar() {
	
	int posAleatoria = 0;
    carta c;

   
    for (int i = 0; i < cartas.length; i++) {

        posAleatoria = metodo.generaNumeroEnteroAleatorio(0, num_cartas - 1);

      
        c = cartas[i];
        cartas[i] = cartas[posAleatoria];
        cartas[posAleatoria] = c;

    }

  
    this.posicionsiguiente = 0;

}
		
			

		
public carta siguienteCarta() {
	
	 carta c = null;
	 
     if (posicionsiguiente == num_cartas) {
         System.out.println("Ya no hay mas cartas, barajea de nuevo");
     } else {
         c = cartas[posicionsiguiente++];
     }

     return c;
	
			
			
}

public int cartasDisponibles() {
	
	return num_cartas - posicionsiguiente;
	
	
	
	
}

public carta[] darCartas(int numCartas) {
	 
    if (numCartas > num_cartas) {
        System.out.println("No se puede dar mas cartas de las que hay");
    } else if (cartasDisponibles() < numCartas) {
        System.out.println("No hay suficientes cartas que mostrar");
    } else {

        carta[] cartasDar = new carta[numCartas];

        
        for (int i = 0; i < cartasDar.length; i++) {
            cartasDar[i] = siguienteCarta(); 
        }
         
        
        return cartasDar;

    }

   
    return null;

}


public void cartasMonton() {
	 
    if (cartasDisponibles() == num_cartas) {
        System.out.println("No se ha sacado ninguna carta");
    } else {
        
        for (int i = 0; i < posicionsiguiente; i++) {
            System.out.println(cartas[i]);
        }
    }

}

public void mostrarBaraja() {
	 
    if (cartasDisponibles() == 0) {
        System.out.println("No hay cartas que mostrar");
    } else {
        for (int i = posicionsiguiente; i < cartas.length; i++) {
            System.out.println(cartas[i]);
        }
    }

}

	}


