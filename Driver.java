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
        
        System.out.println("Enter String");
        String s1 = in.nextLine();
        System.out.println("The word count is "+ t1.wordCounter(s1));
        System.out.println("The vowels count is "+ t1.vowelCounter(s1));
        System.out.println("The punctuation count is "+ t1.puncCounter(s1));
    }
    
}
