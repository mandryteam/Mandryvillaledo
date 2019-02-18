package controlherencia;

public    class BecaFP extends Beca{
private double nota;
private int cont;
private int numero;
private String ciudad;
private String sigla;
private int acumulador;
public BecaFP(String dnialumno, double renta, String ciudad) {
	super(dnialumno, renta);
    cont++;
    numero=cont;
	this.numero=numero;
	this.sigla = "FP"+this.numero;
	this.acumulador=0;
	
}

@Override
public String toString() {
	String s=super.toString()+ "BecaFP [ cont=" + cont + ", numero=" + numero + ", ciudad=" + ciudad + ", sigla=" + sigla
			+ ", acumulador=" + acumulador + "]";
	return s;
}



public int getCont() {
	return cont;
}

public int getNumero() {
	return numero;
}

public String getCiudad() {
	return ciudad;
}

public String getSigla() {
	return sigla;
}

public int getAcumulador() {
	return acumulador;
}

public int darPuntuacion() {
	if(ciudad.equalsIgnoreCase("Madrid"))
		puntuacion=1;
	acumulador+=puntuacion;	
	if(nota>=7 && nota<=8)
		puntuacion=1;
	acumulador+=puntuacion;	
	if(renta>6000 && renta<1000)
	   puntuacion=1;
	acumulador+=puntuacion;	
	if(renta<6000)
		puntuacion=2;
	
	acumulador+=puntuacion;	
	return acumulador;

}
}
