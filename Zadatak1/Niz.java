/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Niz2;

/**
 *
 * @author Andjela
 */
public class Niz {
    static void parniNeparni(int n[], int m){
    
    int k = -1,temp;
    for(int i =0; i < n.length; i++){
        if(n[i]%2==0){
            k++;
            
            temp = n[i];
            n[i] = n[k];
            n[k] = temp;
        }
    }
}
}