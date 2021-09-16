import java.util.*;
import java.io.*;
public class RemoveElements
{
 public static void main(String[] args) {
 LinkedList<String> l_list = new LinkedList<String>();
 l_list.add("Apple");
 l_list.add("Orange");
 l_list.add("Blueberry");
 l_list.add("Mango");
 l_list.add("Kiwi");
 System.out.println("The Original linked list: " + l_list);
 l_list.clear();
 System.out.println("The New linked list: " + l_list);
 }
}