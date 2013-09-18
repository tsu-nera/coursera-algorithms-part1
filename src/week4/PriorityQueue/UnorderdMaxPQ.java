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
    exch(max, N-1);
    return pq[--N];
  }
  
  private boolean less(int i, int j)
  { return pq[i].compareTo(pq[i]) < 0; }
  
  private void exch(int i, int j)
  { 
    Key t = pq[i];
    pq[i] = pq[j];
    pq[j] = t; 
  }
  
}
