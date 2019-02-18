package controlherencia;

public class BecaLB extends Beca{
private String ciudad;

public BecaLB(String dnialumno, double renta, String ciudad) {
	super(dnialumno, renta);
	this.ciudad = ciudad;
}


}
