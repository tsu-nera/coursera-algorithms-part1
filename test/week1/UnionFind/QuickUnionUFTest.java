package week1.UnionFind;

import static org.junit.Assert.*;

import org.junit.Test;

public class QuickUnionUFTest {

   @Test
   public void tinyUF() {
     QuickUnionUF QuickUnionUF = new QuickUnionUF(10);

     QuickUnionUF.union(4,3);
     QuickUnionUF.union(3,8);
     QuickUnionUF.union(6,5);
     QuickUnionUF.union(9,4);
     QuickUnionUF.union(2,1);
     assertTrue(QuickUnionUF.connected(8,9));
     QuickUnionUF.union(5,0);
     QuickUnionUF.union(7,2);
     QuickUnionUF.union(6,1);
     assertTrue(QuickUnionUF.connected(1,0));
     assertTrue(QuickUnionUF.connected(6,7));
   }
}
