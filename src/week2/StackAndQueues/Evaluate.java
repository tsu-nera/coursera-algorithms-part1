package week2.StackAndQueues;

import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

//(1+((2+3)*(4*5)))
public class Evaluate {

  public static void main(String[] args)
  {
    Stack<String> ops = new Stack<String>();
    Stack<Double> vals = new Stack<Double>();
    
    while(!StdIn.isEmpty()) {
      String s = StdIn.readString();
      if  (s.equals("("));
      else if(s.equals("+")) ops.push(s);
      else if(s.equals("*")) ops.push(s);
      else if(s.equals(")"))
      {
        String op = ops.pop();
        if    (op.equals("+")) vals.push(vals.pop() + vals.pop());
        else if(op.equals("*")) vals.push(vals.pop() * vals.pop());
      }
      else vals.push(Double.parseDouble(s));
    }
    StdOut.println(vals.pop());
  }
}
