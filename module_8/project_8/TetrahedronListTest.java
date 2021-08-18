import org.junit.Assert;
import org.junit.Test;

/**
* This is the test class for TetrahedronList.
*
* @author Jared Thacker
* @version March 25, 2021
*/
public class TetrahedronListTest {

/**
* This tests the getName() method.
*/
   @Test public void testGetName() {
      Tetrahedron[] tetraArray = {new Tetrahedron("Small Example", 0.5)};
      TetrahedronList tetraList = new TetrahedronList("My first list",
         tetraArray, 1);
      Assert.assertEquals("My first list", tetraList.getName());
   }

/**
* This tests the numberOfTetrahedrons() method.
*/
   @Test public void testNumberOfTetrahedrons() {
      Tetrahedron[] tetraArray = {new Tetrahedron("Small Example", 0.5)};
      TetrahedronList tetraList = new TetrahedronList("My first list",
         tetraArray, 1);
      Assert.assertEquals(1, tetraList.numberOfTetrahedrons());
   }
   
/**
* This test the addTetrahedron() method.
*/
   @Test public void testAddTetrahedron() {
      Tetrahedron[] tetraArray = {new Tetrahedron("Small Example", 0.5)};
      TetrahedronList tetraList = new TetrahedronList("My first list",
         tetraArray, 1);
      tetraList.addTetrahedron("Large Example", 97.5);
      Assert.assertEquals(2, tetraList.numberOfTetrahedrons());
      
      tetraList.deleteTetrahedron("Small Example");
      Assert.assertEquals(1, tetraList.numberOfTetrahedrons(), 0.00001);
      Assert.assertEquals(2, tetraList.getList().length, 0.0001);
      tetraList.addTetrahedron("Medium Example", 12.8);
      Assert.assertEquals(2, tetraList.numberOfTetrahedrons(), 0.000001);
      Assert.assertEquals("Medium Example", tetraList.getList()[1].getLabel());
   }
   
/**
* This test the findTetrahedron() method.
*/
   @Test public void testFindTetrahedron() {
      Tetrahedron[] tetraArray = {new Tetrahedron("Small Example", 0.5)};
      TetrahedronList tetraList = new TetrahedronList("My first list",
         tetraArray, 1);
      tetraList.addTetrahedron("Large Example", 97.5);
      Tetrahedron foundTetrahedron = tetraList.findTetrahedron("Small Example");
      Assert.assertEquals(foundTetrahedron.getLabel(), "Small Example");
      Assert.assertEquals(foundTetrahedron.getEdge(), 0.5, 0.000001);
      
      foundTetrahedron = tetraList.findTetrahedron("Large Example");
      Assert.assertEquals(foundTetrahedron.getLabel(), "Large Example");
      Tetrahedron notATetrahedron = tetraList.findTetrahedron("I don't exist");
      Assert.assertEquals(notATetrahedron, null);
   }
   
/**
* This tests the totalSurfaceArea() method.
*/
   @Test public void testTotalSurfaceArea() {
      Tetrahedron[] tetraArray = {new Tetrahedron("Small Example", 0.5),
                                  new Tetrahedron("Large Example", 97.5)};
      TetrahedronList tetraList = new TetrahedronList("My first list",
         tetraArray, 2);
      Assert.assertEquals(tetraList.totalSurfaceArea(), 16465.741, 0.000003);
      
      Tetrahedron[] emptyTetraArray = new Tetrahedron[2];
      TetrahedronList emptyList = new TetrahedronList("My Empty List",
         emptyTetraArray, 0);
      Assert.assertEquals(0.0, emptyList.totalSurfaceArea(), 0.000001);
      
            
      Tetrahedron[] halfArray = {new Tetrahedron("Small Example", 0.5),
         null};
      TetrahedronList halfList = new TetrahedronList("My Empty List",
         halfArray, 1);
      Assert.assertEquals(0.433013, halfList.totalSurfaceArea(), 0.0001);
   }
   
/**
* This tests the totalVolume() method.
*/
   @Test public void testTotalVolume() {
      Tetrahedron[] tetraArray = {new Tetrahedron("Small Example", 0.5),
                                  new Tetrahedron("Large Example", 97.5)};
      TetrahedronList tetraList = new TetrahedronList("My first list",
         tetraArray, 2);
      Assert.assertEquals(tetraList.totalVolume(), 109231.4396, 0.00001);
      
      Tetrahedron[] emptyTetraArray = new Tetrahedron[2];
      TetrahedronList emptyList = new TetrahedronList("My Empty List",
         emptyTetraArray, 0);
      Assert.assertEquals(0.0, emptyList.totalVolume(), 0.000001);
      
      Tetrahedron[] halfArray = {new Tetrahedron("Small Example", 0.5),
         null};
      TetrahedronList halfList = new TetrahedronList("My Empty List",
         halfArray, 1);
      Assert.assertEquals(0.01473, halfList.totalVolume(), 0.0001);
   }
   
/**
* This tests the averageSurfaceArea() method.
*/
   @Test public void testAverageSurfaceArea() {
      Tetrahedron[] tetraArray = {new Tetrahedron("Small Example", 0.5),
                                  new Tetrahedron("Large Example", 97.5)};
      TetrahedronList tetraList = new TetrahedronList("My first list",
         tetraArray, 2);
      Assert.assertEquals(8232.8705, tetraList.averageSurfaceArea(), 0.00001); 
      
      Tetrahedron[] emptyTetraArray = new Tetrahedron[1];
      TetrahedronList emptyTetraList = new TetrahedronList("My first list",
         emptyTetraArray, 0);
         
      Assert.assertEquals(0.0, emptyTetraList.averageSurfaceArea(), 0.0001);
   }
   
/**
* This tests the averageVolume() method.
*/
   @Test public void testAverageVolume() {
      Tetrahedron[] tetraArray = {new Tetrahedron("Small Example", 0.5),
                                  new Tetrahedron("Large Example", 97.5)};
      TetrahedronList tetraList = new TetrahedronList("My first list",
         tetraArray, 2);
      Assert.assertEquals(54615.7198, tetraList.averageVolume(), 0.00001);
      
      Tetrahedron[] emptyTetraArray = new Tetrahedron[1];
      TetrahedronList emptyTetraList = new TetrahedronList("My first list",
         emptyTetraArray, 0);
         
      Assert.assertEquals(0.0, emptyTetraList.averageVolume(), 0.0001);
   }
   
/**
* This method tests the toString() method.
*/
   @Test public void testToString() {
      Tetrahedron[] tetraArray = {new Tetrahedron("Small Example", 0.5),
                                  new Tetrahedron("Large Example", 97.36),
                                  new Tetrahedron("Medium Example", 12.8)};
      TetrahedronList tetraList = new TetrahedronList("My first list",
         tetraArray, 3);
      String toStringOutput = tetraList.toString();
      double totalSurfaceArea = tetraList.totalSurfaceArea();
      double totalVolume = tetraList.totalVolume();
      double avgSurfaceArea = tetraList.averageSurfaceArea();
      double avgVolume = tetraList.averageVolume();
      Assert.assertEquals(true,
         toStringOutput.contains("Number of Tetrahedrons: 3"));
      Assert.assertTrue(
         toStringOutput.contains(
            "Total Surface Area: 16,702.269 square units"));
      Assert.assertTrue(
         toStringOutput.contains(
            "Total Volume: 109,008.731 cubic units"));
      Assert.assertTrue(
         toStringOutput.contains(
            "Average Surface Area: 5,567.423 square units"));
      Assert.assertTrue(
         toStringOutput.contains(
            "Average Volume: 36,336.244 cubic units"));
   }

/**
* This method tests the getList() method.
*/
   @Test public void testGetList() {
      Tetrahedron[] tetraArray = {new Tetrahedron("Small Example", 0.5),
                                  new Tetrahedron("Large Example", 97.36),
                                  new Tetrahedron("Medium Example", 12.8)};
      TetrahedronList tetraList = new TetrahedronList("My first list",
         tetraArray, 3);
      
      Tetrahedron[] tetraArray2 = tetraList.getList();
      Assert.assertArrayEquals(tetraArray, tetraArray2);
   }

/**
* This method tests the deleteTetrahedron() method.
*/
   @Test public void testDeleteTetrahedron() {
      Tetrahedron[] tetraArray = {new Tetrahedron("Small Example", 0.5),
                                  new Tetrahedron("Large Example", 97.36),
                                  new Tetrahedron("Medium Example", 12.8)};
      TetrahedronList tetraList = new TetrahedronList("My first list",
         tetraArray, 3);
      
      Tetrahedron deletedTetrahedron =
         tetraList.deleteTetrahedron("Large Example");
      Assert.assertEquals("Large Example", deletedTetrahedron.getLabel());
      Assert.assertEquals(97.36, deletedTetrahedron.getEdge(), 0.000001);
      Assert.assertEquals(2, tetraList.numberOfTetrahedrons(), 0.000001);
      
      deletedTetrahedron = tetraList.deleteTetrahedron("I Don't Exist");
      Assert.assertEquals(null, deletedTetrahedron);
   }
   
/**
* This method tests the editTetrahedron() method.
*/
   @Test public void testEditTetrahedron() {
      Tetrahedron[] tetraArray = {new Tetrahedron("Small Example", 0.5),
                                  new Tetrahedron("Large Example", 97.36),
                                  new Tetrahedron("Medium Example", 12.8)};
      TetrahedronList tetraList = new TetrahedronList("My first list",
         tetraArray, 3);
      
      boolean tetraEdited = tetraList.editTetrahedron("Medium Example", 1.0);
      Tetrahedron editedTetrahedron =
         tetraList.findTetrahedron("Medium Example");
      Assert.assertTrue(tetraEdited);
      Assert.assertEquals(1.0, editedTetrahedron.getEdge(), 0.000001);
      
      tetraEdited = tetraList.editTetrahedron("I Don't Exist", 1.0);
      Assert.assertFalse(tetraEdited);
   }
   
/**
* This method tests the findTetrahedronWithLargestVolume().
*/
   @Test public void testFindTetrahedronWithLargestVolume() {
      Tetrahedron[] tetraArray = {new Tetrahedron("Small Example", 0.5),
                                  new Tetrahedron("Large Example", 97.36),
                                  new Tetrahedron("Medium Example", 12.8)};
      TetrahedronList tetraList = new TetrahedronList("My first list",
         tetraArray, 3);
      
      Tetrahedron largestVolumeTetrahedron =
         tetraList.findTetrahedronWithLargestVolume();
      
      Assert.assertEquals("Large Example", largestVolumeTetrahedron.getLabel());
      Assert.assertEquals(97.36, largestVolumeTetrahedron.getEdge(), 0.000001);
      
      Tetrahedron[] emptyTetraArray = new Tetrahedron[2];
      TetrahedronList emptyList = new TetrahedronList("My Empty List",
         emptyTetraArray, 0);
      largestVolumeTetrahedron = emptyList.findTetrahedronWithLargestVolume();
      Assert.assertEquals(null, largestVolumeTetrahedron);
      
      Tetrahedron[] halfArray = {new Tetrahedron("Small Example", 0.5),
         null};
      TetrahedronList halfList = new TetrahedronList("My Empty List",
         halfArray, 1);
      Assert.assertEquals(null, halfList.findTetrahedron("I don't exist"));
   }
}
