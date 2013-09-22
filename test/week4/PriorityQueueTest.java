package week4;

import org.junit.Test;

import edu.princeton.cs.algs4.Heap;
import edu.princeton.cs.algs4.MaxPQ;
import edu.princeton.cs.introcs.StdOut;




public class PriorityQueueTest {

  @Test
  public void excersise1()
  {
    Integer[] a = {86, 68, 46, 47, 52, 17, 44, 39, 42, 43};
    Heap heap = new Heap();
    
    
    
    for(int i=0; i<13;i++) 
      StdOut.print(a[i] + " ");
    StdOut.println();
  }
  
  @Test
  public void excercise2()
  {
    Integer[] a = {98 ,90 ,94 ,27 ,74 ,76 ,84 ,18 ,19 ,38 };
    
    MaxPQ pq = new MaxPQ(10);
    
    for(int i=0; i < 10; i++) pq.insert(a[i]);
    pq.delMax();
    pq.delMax();
    pq.delMax();
    
    while( pq.isEmpty()) {
      StdOut.print(pq.delMax() + " ");
    }
    StdOut.println();
  }
}
