/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nov14;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
class SLL{
    Node head,tail;
    SLL(){
        head=null;
        tail=null;
    }
    public void insert(int data){
        Node hello=new Node(data);
        if(head==null){
            head=hello;
            tail=hello;
        }
        else{
            tail.next=hello;
            tail=hello;
        }
    }
    public void dis(){
        Node n=head;
        while(n!=null){
            System.out.print(n.data);
            if(n.next!=null){
                System.out.print("->");
            }
            n=n.next;
        }
    }
    public void search(int val){
        Node n=head;
        int p=0;
        while(n!=null){
            
            if(n.data==val){
                p++;break;            }
            n=n.next;
        }
        if(p>0){
            System.out.println("Found");
        }
        else{
            System.out.println("\nNot Found");
        }
    }
    public void del(int tar){
      if (head.data==tar){
          head=head.next;
          
      }else{
          Node n=head;
          while(n.next!=null && n.next.data!=tar){
              n=n.next;
          }
          if(n.next!=null)
              n.next=n.next.next;
      }
    }

}
/**
 *
 * @author THANVI
 */
public class Main {
    public static void main(String[] args){
        SLL o=new SLL();
        o.insert(10);o.insert(20);o.insert(30);o.insert(40);
        
        o.search(5);
        o.del(40);
        o.dis();
    }
}
