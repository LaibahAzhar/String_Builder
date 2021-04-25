/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task_4;

/**
 * 
 * @author Maryam Ejaz
 */
public class MyString{
    
    public String inputString;
   
    public MyString(String inputString){
        this.inputString = inputString;
    }
    
    /*
     * This function removes spaces from the string
     * @returns String
     */
    public String removeSpaces(){
        String StrwithoutSpaces;
        //Returns size exluding spaces. 
        int size = this.inputString.length()- this.numberOfSpaces();

        char[] array = new char[size];
        
        //Exclusion of spaces from a string
        for(int y=0, x=0; y<this.inputString.length(); y++){
            if (this.inputString.charAt(y) == ' '){
                //ignores space
            }
            else{
                array[x] = this.inputString.charAt(y);
                x++;
            }
        }
        
        StrwithoutSpaces = String.copyValueOf(array);
        
        return StrwithoutSpaces;
    }
    
    /*
     * This function returns number of spaces in a string.
     * @returns int
     */
    public int numberOfSpaces(){
        int space = 0;
        for(int i=0; i<this.inputString.length(); i++){
            if (this.inputString.charAt(i) == ' '){
                space++;
            }
        }
        return space;
    }
    
    public String FirstCharUpperCase(){
        char ch;
        char[] array = new char[inputString.length()];
        array = inputString.toCharArray();
        for(int y=0; y<this.inputString.length(); y++){
            if(y == 0 || inputString.charAt(y-1) == ' '){
                if (this.inputString.charAt(y) >= 'a' && this.inputString.charAt(y) <= 'z') {
                    
                    ch = (char)(this.inputString.charAt(y) - 32);
                    array[y] = ch;
                }
            }
            
        }
        inputString = String.copyValueOf(array);
        return inputString;
    }
    
    
}
