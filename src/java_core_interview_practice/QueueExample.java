package java_core_interview_practice;
import java.util.LinkedList;
 import java.util.Queue;

 public class QueueExample {
     public static void main(String[] args) {
         // Create a queue using LinkedList
         Queue<String> queue = new LinkedList<>();

         // Use add method to insert elements, throws exception if insertion fails
         queue.add("Element1");
         queue.add("Element2");
         queue.add("Element3");

         // Use offer method to insert elements, returns false if insertion fails
         queue.offer("Element4");

         // Display queue
         System.out.println("Queue: " + queue);

         // Peek at the first element (does not remove it)
         String firstElement = queue.peek();
         System.out.println("Peek: " + firstElement); // outputs "Element1"

         // Poll the first element (retrieves and removes it)
         String polledElement = queue.poll();
         System.out.println("Poll: " + polledElement); // outputs "Element1"

         // Display queue after poll
         System.out.println("Queue after poll: " + queue);
     }
 }