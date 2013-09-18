package week4.PriorityQueue;

public class UnorderdMaxPQ<Key extends Comparable<Key>>
{
  private Key[] pq;
  private int N;
  
  public UnorderdMaxPQ(int capacity)
  { pq = (Key[]) new Comparable[capacity]; }
  
  public boolean isEmpty()
  { return N == 0; }
  
  public void insert(Key x)
  { pq[N++] = x; }
  
  public Key delMax()
  {
    int max = 0;
    for (int i = 1; i < N; i++)
      if (less(max, i)) max = i;
    exch(pq, max, N-1);
    return pq[--N];
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
  
}
