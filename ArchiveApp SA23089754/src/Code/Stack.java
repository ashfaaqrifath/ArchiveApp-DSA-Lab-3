/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Code;

/**
 *
 * @author sa23089754
 */

public class Stack {
    private int maxSize;
    private int top;
    private Book stackArray[];
    
    public Stack (int max){
        this.maxSize=20;
        this.stackArray= new Book[max];
        this.top=-1;
    }

    public void push(Book b){
        if(isFull()){
            stackArray[++top] =b;
        }
        else{
            System.out.println("Error.");
        }
    }

    public Book pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return null;
        }
        else{
             return stackArray[top--];
            }
    }

    public Book peek(){
      if(!isEmpty()){
          return stackArray[top];
      }else{
          System.out.println("Stack is empty. Nothing to peek");
          return null;
      }
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public boolean isFull(){
        return (top == maxSize-1);
    }

}
