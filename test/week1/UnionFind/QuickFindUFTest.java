package week1.UnionFind;

import static org.junit.Assert.*;

import org.junit.Test;

public class QuickFindUFTest {

   @Test
   public void tinyUF() {
     QuickFindUF quickFindUF = new QuickFindUF(10);

     quickFindUF.union(4,3);
     quickFindUF.union(3,8);
     quickFindUF.union(6,5);
     quickFindUF.union(9,4);
     quickFindUF.union(2,1);
     assertTrue(quickFindUF.connected(8,9));
     quickFindUF.union(5,0);
     quickFindUF.union(7,2);
     quickFindUF.union(6,1);
     assertTrue(quickFindUF.connected(1,0));
     assertTrue(quickFindUF.connected(6,7));
   }
}
