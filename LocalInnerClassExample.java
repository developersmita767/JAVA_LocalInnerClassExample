//package com.example;
class OuterClass {
    int num=50;
      public void display(){
        
         class Inner{
             int secret = 10;
            public void print() {
               System.out.println("This is method inner class "+(num*secret));
            }
         }
         Inner obj = new Inner();
         obj.print();
      }
      
   }
public class LocalInnerClassExample {
   public static void main(String args[]){
         OuterClass outer = new OuterClass();
         outer.display();
      }
}
