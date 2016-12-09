
import java.util.*;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;
import java.util.Random;	
import java.util.List;	

public class Controlador extends UnicastRemoteObject implements InterfazRMI{
	
	List<Pokemon> listaPokemon;
	String cadena="";
	public Controlador() throws RemoteException{
		super();
		listaPokemon=new ArrayList<Pokemon>();
	}
	public boolean guardarPoquemon(String nombre, int poder, int vida){
		Pokemon pokemon=new Pokemon(nombre,poder, vida);
		listaPokemon.add(pokemon);
		return true;

	}
	
	public int FuncionAleatoria(){
		Random aleatoria=new Random();
		int NumAleatorio=aleatoria.nextInt(2);
		return  NumAleatorio;
	}

	public String listar(){
		for(int i=0;i<listaPokemon.size();i++){
			cadena=cadena+"\n"+"* "+listaPokemon.get(i).getNombre()+"       "+listaPokemon.get(i).getPoderAtaque()+"      "+ listaPokemon.get(i).getVida()+"*";
		}
				

		return cadena;
	}

	public String [][] listar2(){

		String  listaArray [][]=new String[listaPokemon.size()][3];

		for(int i=0; i<listaPokemon.size();i++){
			listaArray[i][0]=listaPokemon.get(i).getNombre();
			listaArray[i][1]=Integer.toString(listaPokemon.get(i).getPoderAtaque());
			listaArray[i][2]=Integer.toString(listaPokemon.get(i).getVida());
		}

		return listaArray;
	}
} 