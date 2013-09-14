package week3;

import static org.junit.Assert.*;

import org.junit.Test;

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
}
