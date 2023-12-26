import java.util.*;

public class HashMap_Set {
    public static void main(String[] args) {
        int[] arr= {2,1,5,6,7,9,1,2};

        HashMap<Integer,Integer> map= new HashMap<>();
        
        // map the element of the array
        /* 
        for(int x: arr){
            if(!map.containsKey(x)){
                map.put(x,0);
            }else{
                map.put(x,map.get(x)+1);
            }  
        }
        */

        // map the element of the array (shortcut)
        for(int x: arr){
            map.put(x,map.getOrDefault(x,0)+1);
        }


        System.out.println(map);    // {1=2, 2=2, 5=1, 6=1, 7=1, 9=1}

        // Display key and value of map
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            // System.out.println(entry.getValue());     // 2 2 1 1 1 1 
            System.out.println(entry.getKey());          // 1 2 5 6 7 9
        }


    }
}
