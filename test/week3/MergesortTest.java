package week3;

import static org.junit.Assert.*;

import org.junit.Test;

import week3.Mergesort.Merge;
import edu.princeton.cs.introcs.StdRandom;

public class MergesortTest {

  @Test
  public void MergeSortClient1()
  {
    int N = 4;
    Double[] a = new Double[N];
    for (int i = 0; i < N; i++) {
      a[i] = StdRandom.uniform();
    }

   Merge.sort(a);
   assertTrue(Merge.isSorted(a));
  }

//  @Test
//  public void ExcerciseShell()
//  {
//    int N = 10;
//    Comparable[] a = {92, 74, 26, 52, 71, 38, 33, 11, 77, 35};
//
//   Shell.sort(a);
//  }


}
