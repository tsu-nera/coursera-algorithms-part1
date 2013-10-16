package week6.HashTables;

import edu.princeton.cs.algs4.Date;

public final class Transaction implements Comparable<Transaction>{
  private final String who;
  private final Date   when;
  private final double amount;
  
  @Override
  public int compareTo(Transaction o) {
    // TODO 自動生成されたメソッド・スタブ
    return 0;
  }
  
  public int hashCode()
  {
    int hash = 17;
    hash = 31*hash + who.hashCode();
    hash = 31*hash + when.hashCode();
    hash = 31*hash + ((Double) amount).hashCode();
    return hash;
  }
  
}
