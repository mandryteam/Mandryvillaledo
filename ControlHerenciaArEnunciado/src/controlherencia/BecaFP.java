package controlherencia;

public class BecaFP extends Beca{
private double nota;

public BecaFP(String dnialumno, double renta, double nota) {
	super(dnialumno, renta);
	this.nota = nota;
}

public int darPuntuacion() {
	if(nota>=7 && nota<=8){
		puntuacion++;
	}
	if(renta<6000){
		
	}
		
	return puntuacion;
}
}
