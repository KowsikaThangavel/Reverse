/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reverse;

import java.util.Scanner;
public class Reverse {

    
    public static void main(String[] args) {
        String org,rev="";
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the string:");
        org=s.nextLine();
        int length=org.length();
        for(int i=length-1;i>=0;i--)
            rev=rev+org.charAt(i);
         System.out.println("The reversed String is:"+rev);
    }
}
        
            
        
     
  
    

