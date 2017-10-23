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

 public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        Vector<String> v=new Vector<String>(20,10);
        String s=new String();
        int count=0;
        String element;
        System.out.println("Enter the number of Strings: ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
             System.out.println("Enter the String to be inserted: ");
             s=sc.next();
             v.addElement(s);
        }
        System.out.println("Entered vector is: ");
        for(Object i:v)
        System.out.println(i+" ");
         
        System.out.println("Enter the Element to be Searched: ");
        element=sc.next();
       for(int i=0;i<n;i++)
       {
           if(element.equals(v.elementAt(i)))
           {
               count++; }}
       System.out.println("The Frequency of the Element is: "+count);
    }
}

