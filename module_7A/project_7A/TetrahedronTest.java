import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Test;

/**
* This is the JUnit test class for the Tetrahedron class.
*
* @author Jared Thacker
* @version March 11, 2021 
*/
public class TetrahedronTest {

/**
* This test method tests the height method.
*/   
   @Test public void testHeight() {
      Tetrahedron th = new Tetrahedron("Small Example", 0.5);
      double actualHeight = th.height(), expectedHeight = 0.40824829;
      Assert.assertEquals(expectedHeight, actualHeight, 0.000001);
   }
/**
* This test method tests the surfaceArea() method.
*/   
   @Test public void testSurfaceArea() {
      Tetrahedron th = new Tetrahedron("Small Example", 0.5);
      double actualSurfaceArea = th.surfaceArea();
      double expectedSurfaceArea = 0.433012702;
      Assert.assertEquals(expectedSurfaceArea, actualSurfaceArea, 0.000001); 
   }

/**
* This test method tests the volume() method.
*/   
   @Test public void testVolume() {
      Tetrahedron th = new Tetrahedron("Small Example", 0.5);
      double actualVolume = th.volume(), expectedVolume = 0.014731391;
      Assert.assertEquals(expectedVolume, actualVolume, 0.000001);
   }

/**
* This test method tests the toString() method.
*/   
   @Test public void testToString() {
      Tetrahedron th = new Tetrahedron("Small Example", 0.5);
      String actualString = th.toString();
      String expectedString;
      expectedString = "Tetrahedron \"Small Example\" with six edges of length"
         + " 0.5 has: \n\theight = 0.408 units\n\tsurface area = 0.433 square"
         + " units\n\tvolume = 0.015 cubic units";
      Assert.assertTrue(actualString.contains("Small Example"));
   }
   
/**
* This test method tests the equals() method.
*/   
   @Test public  void testEquals() {
      Tetrahedron th = new Tetrahedron("Small Example", 0.5);
      Tetrahedron th2 = new Tetrahedron("Large Example", 97.36);
      Tetrahedron th3 = th;
      Assert.assertTrue(th.equals(th));
      Assert.assertFalse(th.equals(th2));
      Assert.assertTrue(th.equals(th3));
   }
   
/**
* This test method tests the hashCode() method.
*/   
   @Test public void testHashCode() {
      Tetrahedron th = new Tetrahedron("Small Example", 0.5);
      int expectedHash = th.hashCode(), myCount = th.getCount();
      Assert.assertEquals(expectedHash, 0);
   }
   
/**
* This test method tests the getCount() method.
*/   
   @Test public void testGetCount() {
      Tetrahedron.resetCount();
      Tetrahedron th = new Tetrahedron("Small Example", 0.5);
      int expectedCount = 1, actualCount = th.getCount();
      Assert.assertEquals(1, actualCount);
   }
   
/**
* This test method tests the resetCount() method.
*/   
   @Test public void testResetCount() {
      Tetrahedron th = new Tetrahedron("Small Example", 0.5);
      Tetrahedron.resetCount();
      Assert.assertEquals(0, th.getCount());
   }
}
