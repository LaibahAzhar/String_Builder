/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task_4;

import java.util.Scanner;

/**
 * Runs the methods in MyString
 * @author Maryam Ejaz
 */
public class Task4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int option = -1;
        String input;
        
        Scanner scanner = new Scanner(System.in);
        
        do{
            System.out.println("\n\nChoose an option: ");
            System.out.println("1. Display string without spaces.\n" 
                             + "2. Display number of spaces in a string.\n"
                             + "3. Make first letter of each word capital.\n"
                             + "4. Display number of special symbols in the string.\n"
                             + "5. Display string without special symbols\n"
                             + "0. close");
            System.out.println("Enter your option: ");
            option = scanner.nextInt();
            scanner.nextLine();
            
            switch(option){
                case 1:
                    System.out.println("Enter a string: ");
                    input = scanner.nextLine();
                    MyString s = new MyString(input);
                    System.out.println("Given string without spaces: ");
                    System.out.println(s.removeSpaces());
                    break;
                
                case 2:
                    System.out.println("Enter a string: ");
                    input = scanner.nextLine();
                    MyString s1 = new MyString(input);
                    System.out.println("Number of spaces: ");
                    System.out.println(s1.numberOfSpaces());
                    break;
                    
                case 3:
                    System.out.println("Enter a string: ");
                    input = scanner.nextLine();
                    MyString s2 = new MyString(input);
                    System.out.println("String with first letter of each word capital: ");
                    System.out.println(s2.FirstCharUpperCase());
                    break;
                    
                case 4:
                    System.out.println("Enter a string: ");
                    input = scanner.nextLine();
                    MyString s3 = new MyString(input);
                    System.out.println("Number of special symbols: ");
                    System.out.println(s3.numberOfSpecialSymbols());
                    break;
                    
                case 5:
                    System.out.println("Enter a string: ");
                    input = scanner.nextLine();
                    MyString s4 = new MyString(input);
                    System.out.println("String without special symbols: ");
                    System.out.println(s4.removeSpecialSymbols());
                    break;
                    
                case 0:
                    
                    break;
                    
                default:
                    System.out.println("Invalid Input!");
                       
            }
        }while(option != 0);
        
        
    }
    
}
