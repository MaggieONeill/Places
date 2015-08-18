import org.junit.*;
import static org.junit.Assert.*;


public class PlacesTest{

  @Test
  public void Places_instantiatesCorrectly_true() {
    Places myPlaces = new Places (description);
    assertEquals(true, myPlaces instanceof Places);
  }
}
