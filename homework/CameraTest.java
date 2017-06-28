import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.*;

public class CameraTest{
  Photo photo;
  Camera camera;
  // Camera camera2;

  @Before
  public void before() {
    photo = new Photo();
    camera = new Camera("E.G 1. Nikon 34T", "Noise reduction filter", "Hi-resolution");
    // camera2 = new Camera("Sony ILCE5100L", "No noise reduction", "Lo-resolution");
  }//note:camera1 is just a test camera, camera 2 should be somewere else.

  @Test
  public void cameraHasName() {
    assertEquals("E.G 1. Nikon 34T", camera.getName());
  }

  @Test
  public void cameraHasNoise() {
    assertEquals("Noise reduction filter", camera.getNoise());
  }

  @Test
  public void cameraHasResolution() {
    assertEquals("Hi-resolution", camera.getResolution());
  }

  @Test
  public void canCamera1TakePhoto() {
    camera.take(photo);
    assertEquals(1, camera.photoCount());
  }

  // @Test
  // public void printAllCameraDetails() {
  //   System.out.println(str);
  //
  }
}
