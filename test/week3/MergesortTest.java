package week3;

import static org.junit.Assert.*;

import org.junit.Test;

import week3.Mergesort.Merge;
import week3.Mergesort.MergeBU;
import edu.princeton.cs.introcs.StdRandom;

public class MergesortTest {

  @Test
  public void MergeSortClient1()
  {
    int N = 10;
    Double[] a = new Double[N];
    for (int i = 0; i < N; i++) {
      a[i] = StdRandom.uniform();
    }

   Merge.sort(a);
   assertTrue(Merge.isSorted(a));
  }

  @Test
  public void MergeSortBUClient()
  {
    int N = 10;
    Double[] a = new Double[N];
    for (int i = 0; i < N; i++) {
      a[i] = StdRandom.uniform();
    }

   MergeBU.sort(a);
   assertTrue(MergeBU.isSorted(a));
  }
  
  @Test
  public void MergeSortExcercise1()
  {
    Integer[] a = {81, 65, 18, 39, 32, 59, 70, 28, 25, 69, 64, 57};
    
    Merge.sort(a);
    assertTrue(Merge.isSorted(a));    
  }

  @Test
  public void MergeSortExcercise2()
  {
    Integer[] a = {47, 15, 55, 18, 31, 79, 48, 88, 81, 38};
    
    MergeBU.sort(a);
    assertTrue(MergeBU.isSorted(a));    
  }


}
