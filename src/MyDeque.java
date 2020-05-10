/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bekirduran
 * @param <T>
 */

public class MyDeque<T> {
     private Node front, rear; 
        private int queueSize; // number of items

        //class to define linked node
        private class Node
        { 
            int data;
            Node next;
        } 
  
        
        
      //initilazing Queue
     public MyDeque()
    {
        front = null;
        rear = null;
        queueSize = 0;
    }
    
     // Checking Size
     public boolean isEmpty()
    {
        return (queueSize == 0);
    }
     
     
     // Removing data from Front of Queue
     public void push(int data)
    {
        Node oldFront = front;
        front = new Node();
        front.data = data;
        front.next = null;
            if (isEmpty()) 
            {
                rear = front;
            }
            else 
            {
                oldFront.next = front;
            }
        queueSize++;  
    }
     
     // Adding data to Front of Queue
     public int pop()
    {
        int data = front.data;
        if (isEmpty()) 
        {
        rear =front = null;
        }
        queueSize--;
        
        return data;
    }
     
     
    // Adding data to Rear of Queue
     public void inject(int data)
    {
        Node oldRear = rear;
        rear = new Node();
        rear.data = data;
        rear.next = null;
            if (isEmpty()) 
            {
                front = rear;
            }
            else 
            {
                oldRear.next = rear;
            }
        queueSize++;
        
        
        
 }
  
    // Removing data from rear Queue 
    public int eject()
    {
        int data = rear.data;
        rear.next = rear;
        if (isEmpty()) 
        {
            rear = null;
        }
        queueSize--;
        
        return data;
    }
    
    
}
