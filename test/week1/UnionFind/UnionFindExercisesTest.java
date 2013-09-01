package week1.UnionFind;

import org.junit.Test;

public class UnionFindExercisesTest {
  
  @Test
  public void Question1() {
    QuickFindUF QuickFindUF = new QuickFindUF(10);
    
    QuickFindUF.union(9,7);
    QuickFindUF.union(9,5);
    QuickFindUF.union(4,5);
    QuickFindUF.union(8,7);
    QuickFindUF.union(3,8);
    QuickFindUF.union(7,0);
    
    
    // QuickFindUF.showId();
  }
  
  @Test
  public void Question2() {
    WeightedQuickUnionUF WeightedQuickUnionUF = new WeightedQuickUnionUF(10);
    
    WeightedQuickUnionUF.union(7,0);
    WeightedQuickUnionUF.union(2,9);
    WeightedQuickUnionUF.union(7,3);
    WeightedQuickUnionUF.union(3,6);
    WeightedQuickUnionUF.union(4,8);
    WeightedQuickUnionUF.union(2,8);
    WeightedQuickUnionUF.union(0,1);
    WeightedQuickUnionUF.union(7,2);
    WeightedQuickUnionUF.union(5,8);

    //WeightedQuickUnionUF.showId();
  }
  
  

}
