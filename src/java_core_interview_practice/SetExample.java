package java_core_interview_practice;
import java.util.HashSet;
 import java.util.Set;

 public class SetExample {
     public static void main(String[] args) {
         // Create a set
         Set<String> set = new HashSet<>();

         // Add elements to the set
         set.add("Apple");
         set.add("Banana");
         set.add("Cherry");

         // Remove an element from the set
         set.remove("Banana");

         // Check if the set contains an element
         boolean containsApple = set.contains("Apple");
         System.out.println("Contains Apple: " + containsApple);

         // Get the size of the set
         int size = set.size();
         System.out.println("Size of the set: " + size);
     }
 }