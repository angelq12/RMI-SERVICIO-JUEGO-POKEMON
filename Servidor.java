import java.rmi.Naming;

public class Servidor{

	public Servidor(){
		try{

			InterfazRMI objeto = new Controlador();
			Naming.bind("rmi://localhost/juego",objeto);
		}catch(Exception ex){
			System.out.println("ERROR "+ex);
		}
	}

	public static void main(String[] args){
		new Servidor();
	}
}