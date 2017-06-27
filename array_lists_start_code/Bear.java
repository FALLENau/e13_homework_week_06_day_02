import java.util.ArrayList;

public class Bear{

  private String name;
  private ArrayList<Edible> belly;

  public Bear(String name){
    this.name = name;
    this.belly = new ArrayList<Edible>();

  }

  public String getName(){
    return this.name;
  }

  public int foodCount(){
    return this.belly.size();
  }

  public void eat(Salmon salmon){
   this.belly.add(salmon);
 }

 // public boolean isBellyFull(){
 //   return foodCount() == belly.size();
 // }

 public void sleep(){
   this.belly.clear();
 }
}
