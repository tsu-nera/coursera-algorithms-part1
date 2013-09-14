package week3.Mergesort;

import week2.ElementarySorts.Insertion;
import edu.princeton.cs.introcs.StdOut;

public class Merge {

  private static final int CUTOFF = 7;

  private static void merge(Comparable[] a, Comparable[] aux, int lo, int mid, int hi)
  {
    assert isSorted(a, lo, mid);
    assert isSorted(a, mid+1, hi);
    
    // copy to auxarily array
    for(int k = lo; k <= hi; k++)
      aux[k] = a[k];
    
    int i = lo, j = mid + 1;
    for(int k = lo; k <= hi; k++)
    {
      if      (i > mid)              aux[k] = a[j++];
      else if (j > hi)               aux[k] = a[i++];
      else if (less(aux[j], aux[i])) aux[k] = a[j++];
      else                           aux[k] = a[i++];
    }
    
    assert isSorted(a, lo, hi);
    
  }
  
  private static void sort(Comparable[] a, Comparable[] aux, int lo, int hi)
  {
    if (hi <= lo + CUTOFF - 1) {
      Insertion.sort(a, lo, hi);
      return;
    }
    // if (hi <= lo) return;
    int mid = lo + (hi - lo) / 2;
    sort(aux, a, lo, mid);
    sort(aux, a, mid+1, hi);
    merge(aux, a, lo, mid, hi);
  }
  
  public static void sort(Comparable[] a)
  {
    Comparable[] aux = new Comparable[a.length];
    sort(a, aux, 0, a.length - 1);
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

}
