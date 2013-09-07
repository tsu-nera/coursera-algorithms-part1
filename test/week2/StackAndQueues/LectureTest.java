package week2.StackAndQueues;

import static org.junit.Assert.*;

import org.junit.Test;

public class LectureTest {

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

}

