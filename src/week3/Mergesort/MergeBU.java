package week3.Mergesort;

import edu.princeton.cs.introcs.StdOut;

public class MergeBU {

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
      if      (i > mid)              a[k] = aux[j++];
      else if (j > hi)               a[k] = aux[i++];
      else if (less(aux[j], aux[i])) a[k] = aux[j++];
      else                           a[k] = aux[i++];
    }
    
    assert isSorted(a, lo, hi);
    
  }
    
  public static void sort(Comparable[] a)
  {
    int N = a.length;
    Comparable[] aux = new Comparable[N];
    for(int sz = 1; sz < N; sz = sz+sz ) {
      for(int lo = 0; lo < N-sz; lo += sz*2) {
        merge(a, aux, lo, lo+sz-1, Math.min(lo+sz+sz-1,N-1));
      }
    }
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
