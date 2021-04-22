package fcu.oop;

public class Gym {
  /**
   * main.
   */
  public static Player fight(Player...players) {
    Player p1 = players[0];
    Player p2 = players[1];
    Player winner = new Player("Player None");
    int p1win = 0;
    int p2win = 0;
    int rand;

    for (int i = 0;i < 3;i++) {
      if (p1.getPokemons(i).getType() == PokemonType.FIRE 
             && p2.getPokemons(i).getType() == PokemonType.GRASS) {
        p1win++;
      } else if (p1.getPokemons(i).getType() == PokemonType.GRASS 
          && p2.getPokemons(i).getType() == PokemonType.WATER) {
        p1win++;
      } else if (p1.getPokemons(i).type == PokemonType.WATER 
          && p2.getPokemons(i).type == PokemonType.FIRE) {
        p1win++;
      } else if (p2.getPokemons(i).type == PokemonType.FIRE 
          && p1.getPokemons(i).type == PokemonType.GRASS) {
        p2win++;
      } else if (p2.getPokemons(i).type == PokemonType.GRASS 
          && p1.getPokemons(i).type == PokemonType.WATER) {
        p2win++;
      } else if (p2.getPokemons(i).type == PokemonType.WATER 
          && p1.getPokemons(i).type == PokemonType.FIRE) {
        p2win++;
      } else if (p1.getPokemons(i).type == p2.getPokemons(i).type) {
        if (p1.getPokemons(i).cp == p2.getPokemons(i).cp) {
          rand = (int)Math.random() * 1;
          if (rand == 0) {
            p1win++;
          } else if (rand == 1) {
            p2win++;
          }
        } else if (p1.getPokemons(i).cp > p2.getPokemons(i).cp) {
          p1win++;
        } else if (p1.getPokemons(i).cp < p2.getPokemons(i).cp) {
          p2win++;
        }
      }
      if (p1win == 2) {
        winner = p1;
        break;
      } else if (p2win == 2) {
        winner = p2;
        break;
      }
    }
    System.out.print("Winner is [" + winner.getPlayerName() + "]" + ", and his/her level becomes [" 
        + winner.getLevel() + "].");
    return winner;
  }
}