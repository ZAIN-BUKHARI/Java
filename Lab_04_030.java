
package com.mycompany.lab_04_030;
//import java.util.Scanner;

class Node{
    int data;
    Node next;
    public Node(int data)
    {
        this.data=data;
        next=null;
    }
}

class Linklist{
    private Node head;
    public Linklist()
    {
        head=null;
    }
    
    public void insertAtHead(int data)
    {          
          Node node = new Node(data);
          node.next=head.next;
          head = node;
                  
    }
    
    public void insertAtTail(int value)
    {
        Node new_node = new Node(value);
        
        if(head==null) //insertatHead
        {
            head=new_node;
            return;
        }
        
        Node temp = head;
        
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        
            temp.next = new_node;
    }
    
    public void insertAtSpecificPosition(int data, int position)
    {
        Node node = new Node(data);
        if(head==null)
        {
            head = node;
            return;
        }
        Node temp = head;
        if(head.data == position)
        {
            head = node;
            node.next = temp.next;
            return;
        }
        while(temp.next.data!=position)
        {
            temp=temp.next;
        }
        temp.next=temp.next.next;
    }
    
    public void display()
    {
        Node temp = head;
        System.out.print("HEAD ->");
        while(temp!=null)
        {
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println(" NULL");
    }
    
    public void deleteAtHead()
    {
        if(head==null)
        {
            System.out.println("List Empty");
            return;
        }
        head=head.next;
        
    }
    
    public void deleteLastInsertedNode()
    {
         Node temp = head;
         while(temp.next.next!=null)
         {
             temp=temp.next;
         }
         temp.next=temp.next.next;
         
    }
    
    private int listLength()
    {
        Node temp = head;
        int count = 1;
        while(temp.next!=null)
        {
            temp=temp.next;
            count++;
        }
        return count;
    }
    
    public void deleteNodeByIndex(int index)
    {
        if(index > listLength())
        {
            return;
        }
        if(head==null)
        {
            return;
        }
        if(index==0)
        {
            return;
        }
        if(index==1)
        {
            head=head.next;
        }
        Node temp = head;
        int count = 1;
        while(count!=index)
        {
            temp=temp.next;
            count++;
        }
        temp.next=temp.next.next;
        
}
    
    public void deleteNodeByValue(int value)
    {
        if(head==null)
        {
            return;
        }
        if(head.data==value)
        {
            head=head.next;
            return;
        } 
        Node temp = head;
        while(temp.next.data!=value )
        {
            temp=temp.next;
        }
        if(temp.next==null)
        {
            return;
        }
        temp.next=temp.next.next;
    }
    
    public boolean search(int value)
    {
        Node current = head;
        while (current != null) {
            if (current.data == value) {
                return true; // Value found
            }
            current = current.next;
        }
        return false;    
    }
    

}

public class Lab_04_030 {
    

    public static double Task_01_Addition(double a,double b)
    {
        return a + b;
    }
    
    public static double Task_02_Multiplication(double a,double b)
    {
        return a * b;
    }
    
    public static double Task_03_Subtraction(double a,double b)
    {
        return a - b;
    }
    
    public static double Task_04_Division(double a,double b)
    {
        return a / b;
    }
    
    public static void main(String[] args) 
    {
//        double var_1=0,var_2=0;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter value 1 : ");
//        var_1 = sc.nextDouble();
//        System.out.println("Enter value 2  : ");
//        var_2 = sc.nextDouble();
        
         
//        System.out.println(Task_01_Addition(var_1, var_2));
//        System.out.println(Task_02_Multiplication(var_1, var_2));
//        System.out.println(Task_03_Subtraction(var_1, var_2));
//        System.out.println(Task_04_Division(var_1, var_2));
        
        
        Linklist list = new Linklist();
        list.insertAtTail(1);
        list.insertAtTail(2);
        list.insertAtTail(3);
        list.insertAtTail(4);
        list.insertAtTail(5);
        list.insertAtTail(6);
        list.insertAtTail(7);
        list.insertAtTail(8);
        list.insertAtTail(9);
        
        list.display();
        System.out.println();
        //delete methods->
//        list.deleteAtHead();   
//        list.deleteLastInsertedNode();
//        list.deleteNodeByIndex(5);
//        list.deleteNodeByValue(2);
        //Insert methods->
//        list.insertAtHead(10);
//        if(list.search(5))
//        {
//            System.out.println("Found " + list.search(5) );
//        }
//        else{
//            System.out.println("Not Found " + list.search(5) );
//        }
        list.display();
    }
    
}

