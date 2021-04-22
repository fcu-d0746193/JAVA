package fcu.oop;

public class Pokemon {
  final String name;
  final PokemonType type;
  int cp;

  /**
   * initialize.
   */
  public Pokemon(String itsname,PokemonType itstype,int itscp) {
    this.name = itsname;
    this.type = itstype;
    this.cp = itscp;
  }
  
  public String getName() {
    return this.name;
  }
  
  public PokemonType getType() {
    return this.type;
  }
  
  public void setCp() {

  }
  
  public int getCp() {
    return this.cp;
  }
}

