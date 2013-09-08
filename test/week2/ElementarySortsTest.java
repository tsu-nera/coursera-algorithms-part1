package week2;

import static org.junit.Assert.*;

import org.junit.Test;

import week2.ElementarySorts.Insertion;
import week2.ElementarySorts.Selection;
import week2.ElementarySorts.Shell;
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

  @Test
  public void InsertionClient1()
  {
    int N = 10;
    Double[] a = new Double[N];
    for (int i = 0; i < N; i++) {
      a[i] = StdRandom.uniform();
    }

   Insertion.sort(a);
   assertTrue(Selection.isSorted(a));
  }

  public void ShellClient1()
  {
    int N = 10;
    Double[] a = new Double[N];
    for (int i = 0; i < N; i++) {
      a[i] = StdRandom.uniform();
    }

   Shell.sort(a);
   assertTrue(Selection.isSorted(a));
  }

  @Test
  public void ExcerciseShell()
  {
    int N = 10;
    Comparable[] a = {92, 74, 26, 52, 71, 38, 33, 11, 77, 35};

   Shell.sort(a);
  }


}
