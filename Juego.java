import java.rmi.Naming;
import java.util.Scanner;
public class Juego{
	
	int opcion;
	public Juego(){
		try{
			InterfazRMI objeto=(InterfazRMI)Naming.lookup("rmi://localhost/juego");
			System.out.println("El numero aleatorio es: " +objeto.FuncionAleatoria());
		
		Scanner entrada=new Scanner(System.in);

	  	do{

	  		

		    System.out.println("           SELECCIONE OPCIÓN"          );
			System.out.println("**************************************");
			System.out.println("* 1-INGRESE NOMBRE DE LOS POKEMONES  *");
			System.out.println("* 2-SIMULAR COMBATE                  *");
			System.out.println("* 3-TERMINAR                         *");
			System.out.println("**************************************");
	        opcion=entrada.nextInt();

	  		switch(opcion){
    		case 1:
    			int vida=100;
    			System.out.println("Nombre del primer pokemon: ");
    			String nombre1=entrada.next();
    			System.out.println("Ataque de primer pokemon: ");
    			int ataque1=entrada.nextInt();

    			objeto.guardarPoquemon(nombre1,ataque1,vida);

    			System.out.println("Nombre del segundo pokemon: ");
    			String nombre2=entrada.next();
    			System.out.println("Ataque del segundo pokemon: ");
    			int ataque2=entrada.nextInt();

    			objeto.guardarPoquemon(nombre2,ataque2,vida);


    		break;
    		case 2:System.out.println("************************");
    			 System.out.println("* NOMBRE     PODER     VIDA *");
				 System.out.println(objeto.listar());
				 System.out.println("***************************");
				 System.out.println("\n");
				 System.out.println("\n");

				 String NuevoArray [][]=objeto.listar2();

				 /*int matriz[][]={{1,2,3},{4,5,6},{7,8,9}};
				 String cadena="";
				 for(int i=0;i<matriz.length;i++){
				 	for(int j=0;j<matriz[0].length;j++){
				 		cadena="    "+cadena+matriz[i][j];

				 	}
				 	System.out.println(cadena+"\n");
				 		cadena="";
				 	
				 }*/

				String cadena="";

				 for(int i=0; i<NuevoArray.length;i++){
					for(int j=0;j<NuevoArray[0].length;j++){
						cadena="   "+cadena+NuevoArray[i][j]+" ";
						
					}				 	
					
					System.out.println(cadena+"\n");
					cadena="";
					
				 }

    		break;
    		case 3:
    		System.out.println("Se ha cerrado el JUEGO");
    		System.exit(0);
    		break;

      	}
	  	}while(opcion!=3);
	  	


		}catch(Exception ex){
			System.out.println("ERROR "+ex);
		}
	}

	public static void main(String[] args){
		new Juego();
	}
}