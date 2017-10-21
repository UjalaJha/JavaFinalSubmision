/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit_2;

import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author prakash
 */
public class Q6U2 {
 public static void main(String[] args) 
     {
         Scanner sc=new Scanner(System.in);
         Vector v= new Vector(5,1); 
         System.out.println("Enter Vector ");
         v.addElement(1);
         v.addElement(2);
         v.addElement(3);
         v.addElement(5);
         v.addElement(1);
         v.addElement(1);
         v.addElement(1);
         
         for(Object i:v)
         System.out.println(i+" ");
         
         int c=0;
         System.out.println("Enter the element to check frequency");
         int num=sc.nextInt();
         
         int n=v.capacity();
         Integer[] a = new Integer[n];
         v.toArray(a);
         
        for (int i = 0; i < n; i++)
        {
            if(a[i]==num)
            {
                c++;
            }
        }
        
        System.out.println("frequency = "+c);
     }
}

