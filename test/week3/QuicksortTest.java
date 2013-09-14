package week3;

import static org.junit.Assert.*;

import org.junit.Test;

import week3.Quicksort.Dijkstra;
import week3.Quicksort.Quick;
import edu.princeton.cs.introcs.StdRandom;

public class QuicksortTest {

  @Test
  public void QuickSortClient()
  {
    int N = 10;
    Double[] a = new Double[N];
    for (int i = 0; i < N; i++) {
      a[i] = StdRandom.uniform();
    }

   Quick.sort(a);
   assertTrue(Quick.isSorted(a));
  }
  
  @Test
  public void DijkstraSortClient()
  {
    int N = 10;
    Double[] a = new Double[N];
    for (int i = 0; i < N; i++) {
      a[i] = StdRandom.uniform();
    }

   Dijkstra.sort(a);
   assertTrue(Dijkstra.isSorted(a));
  }
  
  @Test
  public void QuickSortExcercise()
  {
   Integer[] a = {84, 69, 44, 42, 64, 33, 15, 31, 92, 88, 21, 10 };
    
   Quick.sort(a);
   Quick.show(a);
   assertTrue(Quick.isSorted(a));
  }
  
  @Test
  public void DijcstraSortExcercise()
  {
   Integer[] a = {57, 61, 47, 57, 57, 56, 80, 21, 27, 57 };
    
   Dijkstra.sort(a);
   Dijkstra.show(a);
   assertTrue(Dijkstra.isSorted(a));
  }
}
