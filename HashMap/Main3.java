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
public class Main3 {
    public static char mostFreq(String str){
        HashMap <Character,Integer> map=new HashMap<>();
        for(char ele:str.toCharArray()){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        int mcount=0;
            char mchar='\0';
        for(Map.Entry<Character,Integer>entry:map.entrySet()){
            
            if(entry.getValue()>mcount){
                mcount=entry.getValue();
                mchar=entry.getKey();
            }
        }
        return mchar;
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String str="abcbb";
        System.out.println(mostFreq(str));
    }
}
