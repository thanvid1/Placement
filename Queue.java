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
class Queue{
    int arr[],top;
    
    Queue(int size){
         arr=new int[size];
         top=-1;
    }
    public void push(int data){
        if(top!=arr.length-1){
            arr[++top]=data;
        }
        else{
            System.out.println("Queue Overflow");
        }
    }
    public void dis(){
        if(top==-1)
            System.out.println("Queue empty");
        else{
            for(int i=0;i<=top;i++){
                System.out.println(arr[i]);
                
            }
        }
    }
    public void peek(){
        if(top==-1)
            System.out.println("Queue empty");
        else{
            System.out.println("Top element:"+arr[0]);
        }
    }
    public void pop(){
        if(top==-1)// i=1
            System.out.println("Queue empty");
        else{
            for(int i=0;i<top;i++)
            {
                arr[i]=arr[++i];
            }
            top--;
        }
    }
    
    
}
public class Mainn {
    public static void main(String[] args){
        Queue o=new Queue(3);
        o.push(10);o.push(20);o.push(30);o.push(0);o.push(10);
        o.pop();
        o.dis();
        o.peek();
    }
    
}

