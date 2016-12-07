package fcu.iecs.oop.pokemon;

public class Player {
	public String PlayerName;
	public Pokemon[] pokemons;
	public int level = 1;
	public Player(String PlayerName){
		this.PlayerName = PlayerName;
	}
	public final String getPlayName(){
		return PlayerName;
	}
	public Pokemon[] pokemons(){
		return pokemons;
	}
	public int level(){
		return level;
	}
	
	public void setPokemons(Pokemon[] pokemons){
		this.pokemons = pokemons;
	}
	public void setlevel(int level){
		this.level = level;
	}
}
