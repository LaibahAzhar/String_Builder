/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringbuilder.StringBuilder;

import java.util.Scanner;

/**
 *A program that takes input as string and returns each character of the string vertically excluding the spaces.
 * @author Maryam Ejaz
 */
public class Task2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Main function takes input, calls StringDisplayVertical() to display output.
        String input;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a sentence: ");
        input = scanner.nextLine();
        System.out.println("Your sentence printed vertically is: ");
        StringDisplayVertical(input);
        
 
    }
    
    // This function takes input as string and returns vertical output of the characters in a sentence.
    static void StringDisplayVertical(String input){
        
        //To display character in sentence vertically.
        for (int i=0; i<input.length(); i++){
            if(input.charAt(i) == ' '){
                //ignores spaces
            }
            else{
                System.out.println(input.charAt(i));
            }
            
        }
    }
}

    
    
    
    

