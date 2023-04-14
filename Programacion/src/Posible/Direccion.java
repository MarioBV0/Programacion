package Posible;

public class Direccion {
	
	private String calle;
    private int numero;
    private int piso;
    private String puerta;
    private int cp;
    private String localidad;
    private String provincia;
    
    public Direccion(String calle, int numero, int piso, String puerta, int cp, String localidad, String provincia) {
        this.calle = calle;
        this.numero = numero;
        this.piso = piso;
        this.puerta = puerta;
        this.cp = cp;
        this.localidad = localidad;
        this.provincia = provincia;
    }

    public String getCalle() {
        return calle;
    }

    public int getNumero() {
        return numero;
    }

    public int getPiso() {
        return piso;
    }

    public String getPuerta() {
        return puerta;
    }

    public int getCp() {
        return cp;
    }

    public String getLocalidad() {
        return localidad;
    }

    public String getProvincia() {
        return provincia;
    }

	@Override
	public String toString() {
		return "Direccion [calle=" + calle + ", numero=" + numero + ", piso=" + piso + ", puerta=" + puerta + ", cp="
				+ cp + ", localidad=" + localidad + ", provincia=" + provincia + "]";
	}
    
    

}
