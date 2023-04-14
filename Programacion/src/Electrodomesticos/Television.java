package Electrodomesticos;

public class Television extends Electrodomesticos {
	
	protected  int resolucion;
	protected boolean TDT;
	
	private final static int RESOLUCION_DEF=20;

	public Television() {
		
		this.preciobase=precio_def;
		this.color=color_def;
		this.consumo=consu_def;
		this.peso=peso_def;
		this.resolucion=RESOLUCION_DEF;
		this.TDT=false;
		
	}

	public Television(double preciobase, double peso) {
		super();
		
		this.preciobase=preciobase;
		this.peso=peso;
		this.color=color_def;
		this.consumo=consu_def;
		this.resolucion=RESOLUCION_DEF;
		this.TDT=false;
	}

	public Television(double preciobase, double peso, char consumo, String color, int resolucion, boolean TDT){
        super(preciobase, color, consumo, peso);
        this.resolucion=resolucion;
        this.TDT=TDT;
        

	
	}

	public int getResolucion() {
		return resolucion;
	}

	

	public boolean getTDT() {
		return TDT;
	}
	
	public double precioFinal(){
		
		double dinero=super.precioFinal();
		
		
		if (resolucion>40){
            dinero+=preciobase*0.3;
        }
		
		if (TDT == true){
            dinero+=preciobase+50;
        }
		
		return dinero;
	}
	
	


	
	
	
	
	

}
