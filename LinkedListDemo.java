// This sample code is based on code available from Tutorials Point at
// http://www.tutorialspoint.com/java/java_linkedlist_class.htm

import java.util.*;

public class LinkedListDemo {

   public static void main(String args[]) {
      // create a linked list
      LinkedList llist = new LinkedList();
      // add elements to the linked list
      llist.add("Frank");
      llist.add("Bob");
      llist.add("Debie");
      llist.add("Evan");
      llist.add("Claudia");
      llist.addLast("Zack");
      llist.addFirst("Abe");
      llist.add(1, "Allan");
      System.out.println("Original contents of llist: " + llist);

      // remove elements from the linked list
      llist.remove("Frank");
      llist.remove(2);
      System.out.println("Contents of llist after deletion: "
       + llist);
      
      // remove first and last elements
      llist.removeFirst();
      llist.removeLast();
      System.out.println("llist after deleting first and last: "
       + llist);

      // get and set a value
      Object val = llist.get(2);
      llist.set(2, (String) val + " Changed");
      System.out.println("llist after change: " + llist);
   }
}
