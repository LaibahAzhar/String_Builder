/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringbuilder.StringBuilder;

import java.util.Scanner;
/**
 *
 * @author hp
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        Task1 t1 = new Task1();
        Task3 t3 = new Task3();
        
        //implementation of Task 1
        System.out.println("Enter String");
        String s1 = in.nextLine();
        System.out.println("The word count is "+ t1.wordCounter(s1));
        System.out.println("The vowels count is "+ t1.vowelCounter(s1));
        System.out.println("The punctuation count is "+ t1.puncCounter(s1));
        System.out.println("Enter sub-string to search ");
        String sub = in.nextLine();
        
        if(t1.findSubString(s1,sub)==true)
        {
            System.out.println("The string contains '" + sub + "'");
        }else{
            System.out.println("The string does not contain '" + sub + "'");
        }
        
        //implementation of Task 3
        System.out.println("String is " + t3.removeInteger(s1) );
        System.out.println("String is " + t3.ridMultipleBlank(s1) );
        System.out.println("String is " + t3.stringEncryption(s1) );
        
    }
    
}
