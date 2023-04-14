package Orientadaobjetos;

public class AppFriki {
	public static void main(String[] args) {
		
	Serie arrayserie[]=new Serie [5];
	
	Videojuego arrayvideojuego[]=new Videojuego [5];
	

	
	arrayserie[0]= new Serie("La que se avecina",14,"Comedia","Alberto Caballero");
	arrayserie[1]= new Serie("The last of Us",1,"Accion","Craig Mazin");
	arrayserie[2]= new Serie("Stranger Things",4,"Terror","Matt Duffer");
	arrayserie[3]= new Serie("Como conoci a vuestra madre",9,"Comedia","Carter Bays");
	arrayserie[4]= new Serie("The Mandalorian",3,"Accion","Jon Favreau");
	
	
	
	arrayvideojuego[0]=new Videojuego("Red Read Redeption 2",50,"Accion","Rockstar");
	arrayvideojuego[1]=new Videojuego("Elden Ring",100,"RPG","From Software");
	arrayvideojuego[2]=new Videojuego("Alien Insolation",10,"Terror","Creative Assembly");
	arrayvideojuego[3]=new Videojuego("Project Zomboid",500,"Survival","The Indie Stone");
	arrayvideojuego[4]=new Videojuego("Super Mario Bros",40,"Plataformas","Nintendos");

arrayserie[0].entregar();
arrayserie[3].entregar();


arrayvideojuego[0].entregar();
arrayvideojuego[1].entregar();
	
	for (int i=0;i<arrayserie.length;i++) {
		
		if (arrayserie[i].isEntregado()) {
			
			System.out.println(arrayserie [i].toString());
			
			
			
			
		}
	
	}
	
	
for (int i=0;i<arrayserie.length;i++) {
		
		if (arrayserie[i].compareTo(MAYOR)) {
			
			System.out.println(arrayserie [i].toString());
			
			
		}
	
	}
	
	
	
	

	
for (int i=0;i<arrayvideojuego.length;i++) {
		
	if (arrayvideojuego[i].isEntregado()) {
		
		System.out.println(arrayvideojuego[i].toString());
		
		
	}
	
		
	}



	
	
	
	
}

}


