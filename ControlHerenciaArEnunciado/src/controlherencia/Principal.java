package controlherencia;
import java.util.*;

public class Principal {
    static final int MAXBECAS=20;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		Vector <Beca> becas=new Vector();
		int numBecas=0;
		
		int menu;
		
		// Se añaden tantas solicitudes como desee el usuario
		//y
		
		do{
			
			
				System.out.println("Dni del solicitante: ");
				String dni=sc.nextLine();
				
				int encontrado=buscarDni(dni, becas, numBecas);
				
				if(encontrado == -1){
					System.out.println("Renta percápita del solicitante: ");
					double renta=sc.nextDouble();
					sc.nextLine();
					
					System.out.println("Indica la beca que tienes\n1.Normal\n2.FP\n3.Libro");
					
									
					becas.add(new Beca(dni,renta));
					numBecas++;
						
				}
				else
					System.out.println("Este alumno ya ha hecho una solicitud");
				
				if (numBecas==MAXBECAS)
					break;
				System.out.println("Añadir otra solicitud:1. Si\n2. No");
				menu=sc.nextInt();
			
		}while(menu==1);
		
		System.out.println("Damos puntuación a las becas*************");
		
		for(int cont=0; cont < numBecas; cont++){
			Beca.getPuntuacion();
			System.out.println(becas.toString());	
		}
		
		/*
		System.out.println("Ordenamos las becas por puntos, y a puntos iguales por menos renta***********");
		int j,k;
		Beca aux;
		for(j = 1; j < numBecas; j++)
			for(k = 0; k < numBecas-1; k++){
				
				if(Becas.getPuntuacion() < Beca.getPuntuacion()[k+1]  || 
				   Beca[k].getPuntuacion() == Beca[k+1].getPuntuacion() && Beca[k].getRenta() > Beca[k+1].getRenta()){
					
					aux=Beca[k];
					Beca[k]=Beca[k+1];
					Beca[k+1]= aux;				
				}e
		
				
			}
		 */
		
		becas.sort(Beca.getPuntuacion());
		
		/* Mostramos las puntuaciones de todas las becas */
		for(int cont=0; cont < numBecas; cont++)
			System.out.println(Beca.getPuntuacion());
						
	}

	
	public static int buscarDni(String dni, Vector<Beca> becas,int tam){
		
		for(int cont=0; cont < tam;cont++)
			if(Beca.getDnialumno().equals(dni))
				return cont;
		return -1;
	}
	
	
	
}
