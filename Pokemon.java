
public class Pokemon{
    private String nombre;
    private int poder;
	private int vida;

	public Pokemon(String nombre, int poder, int vida){
		this.nombre=nombre;
		this.poder=poder;
		this.vida=vida;
	}


	public String getNombre(){
		return nombre;
	}

	public int getPoderAtaque(){
		return poder;
	}

	public int getVida(){
		return vida;
	}

	public void setNombre(String nombre){
		this.nombre= nombre;
	}

	public void setPoderAtaque(int poder ){
		this.poder = poder;
	}

	public void setVida(int vida){
		this.vida = vida;
	}

}