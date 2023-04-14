package Comida;

public class main {
	public static void main(String[] args) {
		
		Productos listaproductos[]= new Productos[9];
		
		
		listaproductos[0] = new Productos("Arroz", 10);
		listaproductos[1] = new Productos("Tomate", 5);
		listaproductos[2] = new Productos("Pescado", 25);
		listaproductos[3] = new Productos("Marisco", 50);
		listaproductos[4] = new Productos("Pizza", 8);
		
		listaproductos[5] = new NoPerecedero("Arroz", 8, NoPerecedero.Tipos.ARROZ);
		listaproductos[6] = new NoPerecedero("Macarrones", 8, NoPerecedero.Tipos.PASTA);
		listaproductos[7] = new NoPerecedero("Garbanzos", 8, NoPerecedero.Tipos.LEGUMBRES);
		listaproductos[8] = new NoPerecedero("Verdura", 8, NoPerecedero.Tipos.SOPAS);
	
		
		
		
		
		double total=0;
        for(int i=0;i<listaproductos.length;i++){
            total += listaproductos[i].calcular(5);
            
	}
        
        System.out.println("el total es "+total);
	}
}
