/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nov26;

/**
 *
 * @author THANVI
 */
class Stack{
    int arr[],top;
    
    Stack(int size){
         arr=new int[size];
         top=-1;
    }
    public void push(int data){
        if(top!=arr.length-1){
            arr[++top]=data;
        }
        else{
            System.out.println("Stack Overflow");
        }
    }
    public void dis(){
        if(top==-1)
            System.out.println("Stack empty");
        else{
            for(int i=0;i<=top;i++){
                System.out.println(arr[i]);
                
            }
        }
    }
    public void peek(){
        if(top==-1)
            System.out.println("Stack empty");
        else{
            System.out.println("Top element:"+arr[top]);
        }
    }
    public void pop(){
        if(top==-1)
            System.out.println("Stack empty");
        else{
            int item=0;
            item=arr[top];
            top--;
            System.out.println("Deleted element:"+item);
        }
    }
    
}
public class Main {
    public static void main(String[] args){
        Stack o=new Stack(3);
        o.push(0);o.push(1);o.push(4);o.push(0);o.push(10);
        o.dis();
        o.pop();
        o.dis();
        o.peek();
    }
    
}
