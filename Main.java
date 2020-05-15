/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Niz2;

import static Niz2.Niz.parniNeparni;
import java.util.Scanner;

/**
 *
 * @author Andjela
 */
public class Main {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
       System.out.println("Unesi m: ");
        
   
       int m = input.nextInt();
      int[] n = new int[m];
      Scanner in = new Scanner(System.in);
      for(int i = 0; i < n.length; i++){
         System.out.println("Unesite elemente:");
          n[i] = in.nextInt();
      }
      
       parniNeparni(n,m);
       
      for (int c =0; c<n.length;c++)
           System.out.print(n[c]+"");
        
        
    } 

    
    }

    
