/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reversestring;

import java.util.Scanner;

/**
 *
 * @author student
 */
public class Reversestring {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner scanner = new Scanner (System.in);
        String input = scanner.nextLine();
       char[] char1 = input.toCharArray();
       char[] char2;
       
        for(int i = input.length() - 1; i >= 0; i--)
        {
            System.out.print(char1[i]);
        }
            System.out.println();
      
        // TODO code application logic here
    }
    
}
        // TODO code application logic here
    
    
