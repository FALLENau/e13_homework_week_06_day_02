import java.util.ArrayList;

public class Camera{

  private String name;
  private ArrayList<Types> shelf;

  public Camera(String name){
    this.name = name;
    this.shelf = new ArrayList<Types>();

  }

  public String getName(){
    return this.name;
  }
//   import java.util.ArrayList;
//
// public class Bear{
//
//   private String name;
//   private ArrayList<Edible> belly;
//
//   public Bear(String name){
//     this.name = name;
//     this.belly = new ArrayList<Edible>();
//
//   }
//
//   public String getName(){
//     return this.name;
//   }
}
