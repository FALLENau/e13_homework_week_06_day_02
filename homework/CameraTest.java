import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.*;

public class CameraTest{
  Camera camera;
  // Bear bear;

  @Before
  public void before() {
    camera = new Camera("Nicon");

  }

  @Test
  public void cameraHasName() {
    assertEquals("Nicon", camera.getName());
  }

  // @Test
  // public void hasName(){
  //   assertEquals("Baloo", bear.getName());
  // }
}
