
import java.rmi.Remote;
import java.rmi.RemoteException;
public interface InterfazRMI extends Remote {
	public int FuncionAleatoria() throws RemoteException;
	public boolean guardarPoquemon(String nombre, int poder, int vida)throws RemoteException;
	public String listar()throws RemoteException;
	public String [][] listar2()throws RemoteException;
}