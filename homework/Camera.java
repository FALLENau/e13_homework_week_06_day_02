import java.util.ArrayList;

public class Camera{

  private String name;
  private String noise;
  private String resolution;

  public Camera(String name, String noise, String resolution){
    this.name = name;
    this.noise = noise;
    this.resolution = resolution;

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


}
