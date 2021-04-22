package fcu.oop;

public class Player {
  private String playerName;
  private Pokemon[] pokemons = new Pokemon[3];
  private int level = 1;

  public Player(String pname) {
    this.playerName = pname;
  }
  
  public void setPokemons(Pokemon[] pkms1) {
    this.pokemons = pkms1;
  }
  
  public void setLevel() {

  }
  
  public int getLevel() {
    this.level++;
    return this.level;
  }
  
  public String getPlayerName() {
    return this.playerName;
  }
  
  public Pokemon getPokemons(int ni) {
    return this.pokemons[ni];
  }
}
