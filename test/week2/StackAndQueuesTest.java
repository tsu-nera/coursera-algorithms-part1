package week2;

import static org.junit.Assert.*;

import org.junit.Test;

import week2.StackAndQueues.FixedCapacityStack;
import week2.StackAndQueues.LinkedStackOfStrings;
import week2.StackAndQueues.ResizingArrayStackOfStrings;
import week2.StackAndQueues.Stack;

public class StackAndQueuesTest {

   @Test
   public void LinkedStackOfStrings() {
     LinkedStackOfStrings stack = new LinkedStackOfStrings();
     
     String expect = "to be not that or be";
     String actual = "";
     
     stack.push("to");
     stack.push("be");
     stack.push("or");
     stack.push("not");
     stack.push("to");
     actual += stack.pop() + " ";
     stack.push("be");
     actual += stack.pop() + " ";
     actual += stack.pop() + " ";
     stack.push("that");
     actual += stack.pop() + " ";
     actual += stack.pop() + " ";
     actual += stack.pop();
     stack.push("is");
     
     assertEquals(expect, actual);
   }
   
   @Test
   public void ResizingArrayStackOfStrings() {
     ResizingArrayStackOfStrings stack = 
         new ResizingArrayStackOfStrings();
     
     String expect = "to be not that or be";
     String actual = "";
     
     stack.push("to");
     stack.push("be");
     stack.push("or");
     stack.push("not");
     stack.push("to");
     actual += stack.pop() + " ";
     stack.push("be");
     actual += stack.pop() + " ";
     actual += stack.pop() + " ";
     stack.push("that");
     actual += stack.pop() + " ";
     actual += stack.pop() + " ";
     actual += stack.pop();
     stack.push("is");
     
     assertEquals(expect, actual);
   }
   
   @Test
   public void Stack() {
     Stack<String> stack = new Stack<String>();
     
     String expect = "to be not that or be";
     String actual = "";
     
     stack.push("to");
     stack.push("be");
     stack.push("or");
     stack.push("not");
     stack.push("to");
     actual += stack.pop() + " ";
     stack.push("be");
     actual += stack.pop() + " ";
     actual += stack.pop() + " ";
     stack.push("that");
     actual += stack.pop() + " ";
     actual += stack.pop() + " ";
     actual += stack.pop();
     stack.push("is");
     
     assertEquals(expect, actual);
   }

   @Test
   public void FixedCapacityStack() {
     FixedCapacityStack<String> stack = new FixedCapacityStack<String>(10);
     
     String expect = "to be not that or be";
     String actual = "";
     
     stack.push("to");
     stack.push("be");
     stack.push("or");
     stack.push("not");
     stack.push("to");
     actual += stack.pop() + " ";
     stack.push("be");
     actual += stack.pop() + " ";
     actual += stack.pop() + " ";
     stack.push("that");
     actual += stack.pop() + " ";
     actual += stack.pop() + " ";
     actual += stack.pop();
     stack.push("is");
     
     assertEquals(expect, actual);
   }


}

