package edu.cnm.deepdive.inheritance;

public abstract class Canis {
  
  private String name;
  private int weight;
  
  protected Canis(String name, int weight) { //"protected" = can be seen in other subclasses.
    this.name = name;
    this.weight = weight;
  }

  public void hunt() {
    System.out.println(getName() + ": hunt in packs");
  }

  /**
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * @param name the name to set
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * @return the weight
   */
  public int getWeight() {
    return weight;
  }

  /**
   * @param weight the weight to set
   */
  public void setWeight(int weight) {
    this.weight = weight;
  }
}
