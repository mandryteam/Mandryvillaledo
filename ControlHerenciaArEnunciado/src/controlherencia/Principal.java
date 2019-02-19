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
					
					System.out.println("Indica la beca que tienes\n2.FP\n3.Libro");
					int op=sc.nextInt();
					if(op==2) {
						sc.nextLine();
						System.out.println("Indique su ciudad");
						String ciu=sc.nextLine();
						
						becas.add(new BecaFP(dni, renta, ciu));
						numBecas++;	
						
						
					}
					if(op==3) {
						
						System.out.println("Indique su nota");
						double nota=sc.nextDouble();
						becas.add(new BecaLB(dni,renta,nota));
						numBecas++;
						
					}
					
						
				}
				else
					System.out.println("Este alumno ya ha hecho una solicitud");
				
				if (numBecas==MAXBECAS)
					break;
				System.out.println("Añadir otra solicitud:1. Si\n2. No");
				menu=sc.nextInt();
				sc.nextLine();
		}while(menu==1);
		
		
		System.out.println("Damos puntuación a las becas*************");
		
		for(int cont=0; cont < becas.size(); cont++){
			becas.get(cont).darPuntuacion();
			
				for (int i = 0; i < numBecas; i++) {
					
				
				System.out.println("la informaçao es:");
				System.out.println(becas.get(i).toString());
				}
				
			
		}
		
		
		System.out.println("Ordenamos las becas por puntos, y a puntos iguales por menos renta***********");
		int j,k;
		Beca aux;
		for(j = 1; j < numBecas; j++)
			for(k = 0; k < numBecas-1; k++){
				
				if(becas.get(j).getPuntuacion() < becas.get(k+1).getPuntuacion()  || 
				   becas.get(k).getPuntuacion()== becas.get(k+1).getPuntuacion() && becas.get(k).getRenta() > becas.get(k+1).getRenta()){
					
					aux=becas.get(k);
					becas.set(k,becas.get(k+1));
					becas.set(k+1,aux);				
				}
		
				
			}
		 
		
		
		/* Mostramos las puntuaciones de todas las becas */
		System.out.println("Mostramos las puntuaciones de todas las becas");
		for(int cont=0; cont < becas.size(); cont++)
			System.out.println(becas.get(cont).getPuntuacion());
						
	}

	
	public static int buscarDni(String dni, Vector<Beca> becas,int tam){
		
		for(int cont=0; cont < tam;cont++)
			if(becas.get(cont).getDnialumno().equals(dni))
				return cont;
		return -1;
	}
	
	
	
}
