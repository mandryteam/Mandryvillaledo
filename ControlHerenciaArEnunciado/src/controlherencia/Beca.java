package controlherencia;

public abstract class Beca {

	private String dnialumno;
	protected double renta;
	protected int puntuacion;
		
	public Beca(String dnialumno, double renta) {
		super();
		this.dnialumno = dnialumno;
		this.renta = renta;
	}

	public String getDnialumno() {
		return dnialumno;
	}

	public double getRenta(){
		return renta;
	}
	
	public void setRenta(double renta) {
		this.renta = renta;
	}

	abstract public void darPuntuacion();
	
	

	public int getPuntuacion() {
		return puntuacion;
	}



	@Override
	public String toString() {
		return "Beca [dnialumno=" + dnialumno + ", renta=" + renta + "]";
	}
	


	
}
