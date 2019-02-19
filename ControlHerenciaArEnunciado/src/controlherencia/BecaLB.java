package controlherencia;

public class BecaLB extends Beca{

private static int cont;
private int numero;
private String sigla;
private static int acumulador;
private static double nota;


public BecaLB(String dnialumno, double renta,double nota) {
	super(dnialumno, renta);
	cont++;
	numero=cont;
	this.numero=numero;
	this.sigla = "LB"+this.numero;
	
	this.nota=nota;
}



public int getCont() {
	return cont;
}

public int getNumero() {
	return numero;
}

public String getSigla() {
	return sigla;
}



public double getNota() {
	return nota;
}

public void darPuntuacion() {
	if(nota>7 || nota<8)
		puntuacion++;
	   
	if(renta < 6000 ) {
		puntuacion++;
		puntuacion++;
	}
	   
	
}




public int getPuntuacion() {
	return puntuacion;
}

@Override
public String toString() {
	String s=super.toString()+ "BecaLB [ sigla=" + sigla + " nota=" + nota +" Puntuacion: "+puntuacion+"]";
	return s ;
}

}



