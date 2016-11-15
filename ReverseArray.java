/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reversearray;

import java.util.Scanner;

/**
 *
 * @author Souvik_R
 */
public class ReverseArray {

    static int size,i;
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the number of inputs:");
        size=in.nextInt();
        int[] arr=new int[size];
        for(i=0;i<size;i++)
        {
           arr[i]=in.nextInt();
        }
        System.out.println("The reversed array is:");
        for(int j=size-1;j>=0;j--)
        {
            System.out.print(arr[j]);
        }
            
            
        
            
        
        
            
        
        
        
    
    
}
}
