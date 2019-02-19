package controlherencia;

public    class BecaFP extends Beca{
private static int cont;
private int numero;
private String ciudad;
private String sigla;



public BecaFP(String dnialumno, double renta, String ciudad) {
	super(dnialumno, renta);
    cont++;
    numero=cont;
	this.numero=numero;
	this.sigla = "FP"+this.numero;
	this.fp=true;
	this.ciudad=ciudad;
	
}

@Override
public String toString() {
	String s=super.toString()+ "BecaFP [ ciudad=" + ciudad + ", sigla=" + sigla+" Puntuacion: "+puntuacion+ "]";
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





public void darPuntuacion() {
	if(ciudad.equalsIgnoreCase("Madrid"))
		puntuacion++;
		
	if(renta>6000 && renta<10000)
	   puntuacion++;
		
	if(renta<=6000)
		puntuacion=puntuacion+2;
	
		
	

}

public int getpuntuacion() {
	return puntuacion;
}

public boolean isFp() {
	return fp;
}




}
