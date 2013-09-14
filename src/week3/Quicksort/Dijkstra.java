package week3.Quicksort;

import edu.princeton.cs.introcs.StdOut;
import edu.princeton.cs.introcs.StdRandom;

public class Dijkstra {
  private static int partition(Comparable[] a, int lo, int hi)
  {
    int i = lo, j = hi+1;
    while(true)
    {
      while (less(a[++i], a[lo]))
        if (i == hi) break;
      
      while (less(a[lo], a[--j]))
        if (j == lo) break;
      
      if (i >= j) break;
      exch(a, i, j);
    }
    
    exch(a, lo, j);
    return j;
  }
  
  public static void sort(Comparable[] a)
  {
    StdRandom.shuffle(a);
    sort(a, 0, a.length-1);
  }
  
  private static void sort(Comparable[] a, int lo, int hi)
  {
    if (hi <= lo) return;
    int lt = lo, gt = hi;
    Comparable v = a[lo];
    int i = lo;
    while(i <= gt)
    {
      int cmp = a[i].compareTo(v);
      if        (cmp < 0) exch(a, lt++, i++);
      else if   (cmp > 0) exch(a, i, gt--);
      else                i++;
    }
    
    sort(a, lo, lt - 1);
    sort(a, gt + 1, hi);
  }
  
  private static boolean less(Comparable v, Comparable w)
  {
    return (v.compareTo(w) < 0); 
  }
  
  private static void exch(Comparable[] a, int i, int j)
  {
    Comparable swap = a[i];
    a[i] = a[j];
    a[j] = swap;
  }
  
  public static boolean isSorted(Comparable[] a)
  {
    for (int i = 1; i < a.length; i++) {
      if(less(a[i], a[i-1])) return false;
    }
    return true;
  }
  
  public static boolean isSorted(Comparable[] a,int lo, int hi)
  {
    for (int i = lo; i < hi; i++) {
      if(less(a[i], a[i-1])) return false;
    }
    return true;
  }
  
  public static void show(Comparable[] a)
  {
    for(int i=0; i < a.length; i++){
      StdOut.print(a[i] + " ");
    }
    StdOut.println();
  }

  public static Comparable select(Comparable[] a, int k)
  {
    StdRandom.shuffle(a);
    int lo = 0, hi = a.length -1;
    while (hi > lo)
    {
      int j = partition(a, lo, hi);
      if      (j < k) lo = j + 1;
      else if (j > k) hi = j - 1;
      else            return a[k];
    }
    
    return a[k];
  }
  
}
