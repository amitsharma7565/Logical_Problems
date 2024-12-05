//Write a code for Iterate hashmap using iterator

import java.util.*;
class IterateHashMap {
    public static void main(String[] args) {
        Map<Integer, Integer> check = new HashMap<>();
        check.put(0,1);
         check.put(1,2);
          check.put(2,5);
           check.put(3,5);
    
    
    //System.out.println(check);
    
    // for(Map.Entry<Integer, Integer> entry: check.entrySet()){
    //     System.out.println("Key ="+ entry.getKey()+" Value is "+ entry.getValue());
    // }
    
    
    // using iterator
    
    Iterator<Map.Entry<Integer, Integer>> itr = check.entrySet().iterator();
    
    while(itr.hasNext()){
        Map.Entry<Integer, Integer> entry = itr.next();
        System.out.println("Key is "+entry.getKey()+ "value is "+ entry.getValue());
    }
    }
}