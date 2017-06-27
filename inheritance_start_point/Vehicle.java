class Vehicle {
  protected int numWheels = 4;//protected lets inhereted file have acces but only inhereted files.

  public Vehicle(){
    
  }

  public int getNumWheels(){
    return this.numWheels;
  }
}
