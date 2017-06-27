import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;

public class VehicleTest {
  Car car;
  Motorbike motorbike;

  @Before
  public void before(){
    car = new Car();
    motorbike = new Motorbike();
  }

  @Test
  public void motorbikeHasTwoWheels() {
    assertEquals(2, motorbike.getNumWheels());
  }
  
}
