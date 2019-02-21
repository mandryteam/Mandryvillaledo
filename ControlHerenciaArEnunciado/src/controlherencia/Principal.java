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
		
		// Se a�aden tantas solicitudes como desee el usuario
		//y
		
		do{
			
			
				System.out.println("DNI del solicitante: ");//pongo DNI en MAYUSC para que cree un conflicto
				String dni=sc.nextLine();
				
				int encontrado=buscarDni(dni, becas, numBecas);
				
				if(encontrado == -1){
					System.out.println("Renta perc�pita del solicitante: ");
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
				System.out.println("A�adir otra solicitud:1. Si\n2. No");
				menu=sc.nextInt();
				sc.nextLine();
		}while(menu==1);
		
		
		System.out.println("Damos puntuaci�n a las becas*************");
		
		for(int cont=0; cont < becas.size(); cont++){
			becas.get(cont).darPuntuacion();
			
				for (int i = 0; i < numBecas; i++) {
					
				
				System.out.println("la informa�ao es:");
				System.out.println(becas.get(i));
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
			System.out.println(becas.get(cont).getPuntuacion()+": "+becas.get(cont).getDnialumno());
		
		
		/* Ahora buscamos todas las FP y borraremos si tienen puntuacion 0 */
		
		buscarFP(becas, numBecas);
		System.out.println("Las becas han sido borradas");
		
		
		System.out.println("Las becas restantes son estas");
		System.out.println(becas.toString());
		
	}
	
	
		

	
	public static int buscarDni(String dni, Vector<Beca> becas,int tam){
		
		for(int cont=0; cont < tam;cont++)
			if(becas.get(cont).getDnialumno().equals(dni))
				return cont;
		return -1;
	}
	
	
public static void buscarFP(Vector<Beca> becas,int tam){
		
		for(int cont=0; cont < tam;cont++) {
			if(becas.get(cont).isFp()==true) {
				if(becas.get(cont).getPuntuacion()==0) {
					System.out.println("esta beca va a ser borrada"+becas.get(cont));
					becas.remove(cont);
				}
			}
			
			
			
			
			
			/*if(becas.get(cont).isFp()==true) {
				for (int i = 0; i < cont; i++) {
					if(becas.get(i).getPuntuacion()==0){
						System.out.println("esta beca va a ser borrada"+becas.get(i));
						becas.remove(i);
						
					}
					break;
				}
				
			}*/
		}
	
	
}
}