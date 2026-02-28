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
public class Main2 {
    public static void findDuplicate(int arr[]){
        HashMap <Integer,Integer> map=new HashMap<>();
        for(int ele:arr){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            if(entry.getValue()>1){
                System.out.println(entry.getKey());
            }
        }
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int size=in.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=in.nextInt();
        }
        findDuplicate(arr);
    }
}
