/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bryonlisttester;

import java.util.Arrays;

/**
 *
 * @author jeffr
 */
public class ArrayListAlgorithm {
    private int[] dataContainer;
    private int size;
    
   public ArrayListAlgorithm(){
   dataContainer= new int[10];
   size =0;
   }
   public void add(int userInputValue){
       if(size==dataContainer.length){
       int[] temp = new int[dataContainer.length*2];
       //copy values over
       
       for(int i =0; i<size; i++){
       temp[i]= dataContainer[i];
       }
       dataContainer = temp;//Repoint global variable
       size++;//update size
       }else{
   dataContainer[size] = userInputValue;
   size++;
       System.out.println(Arrays.toString(dataContainer));}
   }
   public void clear(){
   dataContainer[0]=0;
   size=0;
   }
   
   public boolean isEmpty(){
       //NEver Ever do this 
       //if(isOpen == false);
       
       // but instead do this .... boolean isOpen= false'
      // if(isOpen){
      // }
      // return size ==0 ? true:false;
   if(size==0){
   return true;}
   else{
   return false;
   }
   }
   
   public int getSize(){
    return size;}//getter for size
   @Override
   public String toString(){
   String result="";
   for (int i=0; i<size; i++){
   result += dataContainer[i] + " ";
   }
   return result;
   }
   
    
}
