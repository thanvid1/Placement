/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feb28;

/**
 *
 * @author THANVI
 */
import java.util.*;
public class Main {
    public static void main(String[] args){
        HashMap <String,Integer> map=new HashMap<>();
        map.put("English",95);
        map.put("Math",90 );
        map.put("Science",80 );
        System.out.println(map.containsKey("English"));
        System.out.println(map.containsValue(45));
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.isEmpty());
        System.out.println(map.size());
        for(Map.Entry<String,Integer>entry:map.entrySet()){
            if(entry.getValue()>=90){
                System.out.println(entry.getKey());
            }
        }
    }
}
