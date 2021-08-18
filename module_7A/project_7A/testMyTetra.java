
public class testMyTetra {
   public static void main(String args[]) {
      Tetrahedron th = new Tetrahedron("Small Example", 0.5);
      int actualCount = th.getCount(), expectedCount = 1;
      System.out.println("Tetrahedron \"Small Example\" with six edges of length"
         + " 0.5 has: \n\theight = 0.408 units\n\tsurface area = 0.433 square"
         + " units\n\tvolume = 0.015 cubic units");
            }
}