/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package android_dev;

import java.util.Scanner;

/**
 *
 * @author Nabila_Salhi
 */
public class Android_Dev {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
    System.out.print("Enter number 1: ");
    while (!sc.hasNextInt()) sc.next();
    int num1 = sc.nextInt();
    int num2;
    System.out.print("Enter number 2: ");
    //s'assurer que num1 et tjrs < à num2 et il s'agit d'un int
    do {
        while (!sc.hasNextInt()) sc.next();
        num2 = sc.nextInt();
    } while (num2 < num1);
    System.out.println(num1 + " " + num2);
    Android_Dev dev=new Android_Dev();
   dev.displayMagicalNumber(num1,num2); 
    }
 void display(int val){
      
        if(val % 3==0){
            System.out.println("le numero" +val+"est multiple de 3 à son place on affiche H");
        }
        else if(val %5==0){
     System.out.println("le numero" +val+"est multiple de 5 à son place on affiche S");
    
        }
        else   System.out.println("your number is" +val);
    }
  void displayMagicalNumber(int pIMin, int pIMax){
        int i=pIMin;
        while(i<pIMax){
          display (i);  
        i++;
}
 }
    
}
