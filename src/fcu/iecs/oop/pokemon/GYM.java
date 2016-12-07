package fcu.iecs.oop.pokemon;

public class GYM {
	public static void fight(Player p1,Player p2){
		int a = p1.level;
		int b = p2.level;
		int x = 0;
		int y = 0; 
		int i = 0;
		while(i<p1.pokemons.length && x < 2 &&
				y < 2){
			if(p1.pokemons[i].type.equals(PokemonType.FIRE) && p2.pokemons[i].type.equals(PokemonType.GRASS)){
				x++;
			}
			else if(p1.pokemons[i].type.equals(PokemonType.GRASS) && p2.pokemons[i].type.equals(PokemonType.WATER)){
				x++;
			}
			else if(p1.pokemons[i].type.equals(PokemonType.WATER) && p2.pokemons[i].type.equals(PokemonType.FIRE)){
				x++;
			}
			else if(p1.pokemons[i].type == p2.pokemons[i].type){
				if(p1.pokemons[i].getcp() > p2.pokemons[i].getcp()){
					x++;
				}
				else if(p1.pokemons[i].getcp() < p2.pokemons[i].getcp()){
					y++;
				}
				else{
					if((int)(Math.random()*8+1)%2 == 0){
						x++;
					}
					else{
						y++;
					}
				}
			}
			else{
				y++;
			}
			i++;
		}
		if(x==2){
			p1.level +=1;
			System.out.println("Winner is "+p1.getPlayName() +",and his/her level becomes "+p1.level);
		}
		else if(y==2){
			p2.level +=1;
			System.out.println("Winner is "+p2.getPlayName() +",and his/her level becomes "+p2.level);
		}
	}	
}
