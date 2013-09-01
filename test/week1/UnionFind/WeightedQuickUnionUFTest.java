package week1.UnionFind;

import static org.junit.Assert.*;

import org.junit.Test;

public class WeightedQuickUnionUFTest {

   @Test
   public void tinyUF() {
     WeightedQuickUnionUF WeightedQuickUnionUF = new WeightedQuickUnionUF(10);

     WeightedQuickUnionUF.union(4,3);
     WeightedQuickUnionUF.union(3,8);
     WeightedQuickUnionUF.union(6,5);
     WeightedQuickUnionUF.union(9,4);
     WeightedQuickUnionUF.union(2,1);
     assertTrue(WeightedQuickUnionUF.connected(8,9));
     WeightedQuickUnionUF.union(5,0);
     WeightedQuickUnionUF.union(7,2);
     WeightedQuickUnionUF.union(6,1);
     assertTrue(WeightedQuickUnionUF.connected(1,0));
     assertTrue(WeightedQuickUnionUF.connected(6,7));
   }
}
