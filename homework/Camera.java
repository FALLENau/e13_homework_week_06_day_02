import java.util.ArrayList;

public class Camera{

  private String name;
  private String noise;
  private String resolution;
  private ArrayList<Storage> rell;


  public Camera(String name, String noise, String resolution){
    this.name = name;
    this.noise = noise;
    this.resolution = resolution;
    this.rell = new ArrayList<Storage>();

  }

  public String getName(){
    return this.name;
  }

  public String getNoise(){
    return this.noise;
  }

  public String getResolution(){
    return this.resolution;
  }

  public int photoCount(){
    return this.rell.size();
  }

  public void take(Storage photo){
   this.rell.add(photo);
 }


}
