package controlherencia;

public class BecaLB extends Beca{
private String ciudad;
private int cont;
private int numero;
private String sigla;
private int acumulador;
private double nota;

public BecaLB(String dnialumno, double renta, String sigla,double nota) {
	super(dnialumno, renta);
	cont++;
	numero=cont;
	this.numero=numero;
	this.sigla = "LB"+this.numero;
	this.acumulador = 0;
	this.nota=nota;
}

public String getCiudad() {
	return ciudad;
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

public int getAcumulador() {
	return acumulador;
}

public double getNota() {
	return nota;
}

public int darPuntuacion() {
	if(nota>7 || nota<8)
		puntuacion=1;
	   acumulador+=puntuacion;
	if(renta < 6000 )
		puntuacion=2;
	   acumulador+=puntuacion;
	return puntuacion;
}
@Override
public String toString() {
	String s=super.toString()+ "BecaLB [ciudad=" + ciudad + ", cont=" + cont + ", numero=" + numero + ", sigla=" + sigla + ", acumulador="
			+ acumulador + ", nota=" + nota + "]";
	return s ;
}

}



