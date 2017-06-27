import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.*;

public class CameraTest{
  Photo photo;
  Camera camera1;
  Camera camera2;

  @Before
  public void before() {
    photo = new Photo();
    camera1 = new Camera("E.G 1. Nikon 34T", "Noise reduction filter", "Hi-resolution");
    camera2 = new Camera("Sony ILCE5100L", "No noise reduction", "Lo-resolution");

  }

  @Test
  public void cameraHasName() {
    assertEquals("E.G 1. Nikon 34T", camera1.getName());
  }

  @Test
  public void cameraHasNoise() {
    assertEquals("Noise reduction filter", camera1.getNoise());
  }

  @Test
  public void cameraHasResolution() {
    assertEquals("Hi-resolution", camera1.getResolution());
  }

  @Test //Note:start-build stage one.
  public void canCamera1TakePhoto(){
    camera1.take(photo);
    assertEquals(1, camera1.photoCount());
  }
}
