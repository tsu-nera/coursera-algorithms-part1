package week2;

import static org.junit.Assert.*;

import org.junit.Test;

import week2.ElementarySorts.Selection;
import edu.princeton.cs.introcs.StdRandom;

public class ElementarySortsTest {

  @Test
  public void SelectionClient1()
  {
    int N = 10;
    Double[] a = new Double[N];
    for (int i = 0; i < N; i++) {
      a[i] = StdRandom.uniform();
    }

   Selection.sort(a);
   assertTrue(Selection.isSorted(a));

  }
   

}
