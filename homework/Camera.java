import java.util.ArrayList;

public class Camera{

  private String name;
  private String noise;
  private String resolution;
  private String details;
  private ArrayList<Storage> rell;


  public Camera(String name, String noise, String resolution){
    this.name = name;
    this.noise = noise;
    this.resolution = resolution;
    this.details = details;
    this.rell = new ArrayList<Storage>();

  }

  public String getName() {
    return this.name;
  }

  public String getNoise() {
    return this.noise;
  }

  public String getResolution() {
    return this.resolution;
  }

  public int photoCount() {
    return this.rell.size();
  }

  public void take(Storage photo) {
   this.rell.add(photo);
 }

 // public String details() {
 //   return name + noise + resolution;
 //  //note: this still doesn't work.
 // }

 // public String printAllCameraDetails() {
 //   String details = "";
 //   for (Printable camera : cameras) {
 //     details += camera.printDetails() + "\n ";
 //   }//note: \n adds a new line within a String.
 //   return details;
 // }//note: printDetails method needs to be added to both DigitalCamera and AnalogCamera classes.


}
