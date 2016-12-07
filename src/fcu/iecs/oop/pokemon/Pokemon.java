package fcu.iecs.oop.pokemon;

public class Pokemon {
	private static String name;
	private int cp;
	public PokemonType type;
	public Pokemon(){
		this.name = name;
		this.type = type;
		this.cp = cp;
	}
	public Pokemon(String name,PokemonType type,int cp){
		this.name = name;
		this.type = type;
		this.cp = cp;
	}
	public void setcp(int cp){
	this.cp = cp;
	}
	public String getName(){
	return name;
	}
	public  PokemonType gettype(){
	return type;
	}
	public int getcp(){
	return cp;
	}

}
