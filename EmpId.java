import java.util.HashMap;
import java.util.*;

public class EmpId {

    public static void main(String[] args) {

         HashMap<Integer, String> hmap = new HashMap<Integer, String>();
         hmap.put(101, "Jhon");
         hmap.put(110, "Snow");
         hmap.put(106, "Bubble");
         hmap.put(108, "Adam");
         hmap.put(104, "Rachel");
         hmap.put(101, "Chandler");
         hmap.put(102, "Ross");
         hmap.put(103, "Rose");
                  System.out.println("Before Sorting:");
         Set set = hmap.entrySet();
         Iterator iterator = set.iterator();
         while(iterator.hasNext()) {
               Map.Entry me = (Map.Entry)iterator.next();
               System.out.print(me.getKey() + ": ");
               System.out.println(me.getValue());
         }
         Scanner sc=new Scanner(System.in);
         System.out.println("enter value to be search :");
         String s=sc.nextLine();
         if(hmap.containsValue(s)){
             System.out.println("The hashmap contains searched value");
         } else {
             System.out.println("The hashmap does not contains searched value");
         }
         

         Map<Integer, String> map = new TreeMap<Integer, String>(hmap); 
         System.out.println("Ascending Sorting.... By Key:");
         Set set2 = map.entrySet();
         Iterator iterator2 = set2.iterator();
         while(iterator2.hasNext()) {
              Map.Entry me2 = (Map.Entry)iterator2.next();
              System.out.print(me2.getKey() + ": ");
              System.out.println(me2.getValue());
         }
         
         
         System.out.println("Descending sorting......By Key:");
         Map<Integer, String> treeMap = new TreeMap<Integer, String>(
                 new Comparator<Integer>() {

                     @Override
                     public int compare(Integer o1, Integer o2) {
                         return o2.compareTo(o1);
                     }

                 });
         treeMap.putAll(hmap);

         printMap(treeMap);

     }

     public static <K, V> void printMap(Map<K, V> map) {
         for (Map.Entry<K, V> entry : map.entrySet()) {
             System.out.println("Key : " + entry.getKey()
 				+ " Value : " + entry.getValue());
         } 
           }
}
