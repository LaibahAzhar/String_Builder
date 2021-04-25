/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task_4;

/**
 * Class MyString contains string manipulative functions.
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
    
    /*
     * This function converts first letter of each word into upper case.
     * @returns String
     */
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
    
    /*
     * This function removes special symbols from the string
     * @returns String
     */
    public String removeSpecialSymbols(){
        String StrwithoutSymbols;
        //Returns size exluding special symbols. 
        int size = this.inputString.length()- this.numberOfSpecialSymbols();

        char[] array = new char[size];
        
        //Exclusion of special symbols from a string
        for(int y=0, x=0; y<this.inputString.length(); y++){
            if ((this.inputString.charAt(y) >= '!' && this.inputString.charAt(y) <= '/') ||
                (this.inputString.charAt(y) >= ':' && this.inputString.charAt(y) <= '@') ||
                (this.inputString.charAt(y) >= '[' && this.inputString.charAt(y) <= '`') || 
                (this.inputString.charAt(y) >= '{' && this.inputString.charAt(y) <= '~')){
                //ignores special symbols
            }
            else{
                array[x] = this.inputString.charAt(y);
                x++;
            }
        }
        
        StrwithoutSymbols = String.copyValueOf(array);
        
        return StrwithoutSymbols;
    }
    
    /*
     * This function returns number of special symbols in a string.
     * @returns int
     */
    public int numberOfSpecialSymbols(){
        int sym = 0;
        for(int i=0; i<this.inputString.length(); i++){
            if ((this.inputString.charAt(i) >= '!' && this.inputString.charAt(i) <= '/') ||
                (this.inputString.charAt(i) >= ':' && this.inputString.charAt(i) <= '@') ||
                (this.inputString.charAt(i) >= '[' && this.inputString.charAt(i) <= '`') || 
                (this.inputString.charAt(i) >= '{' && this.inputString.charAt(i) <= '~')){
                sym++;
            }
        }
        return sym;
    }
    
    /*
     * This function returns number of occurances of specified character in a string.
     * @returns int
     */
    public int numberOfOccurences(char ch){
        int occur = 0;
        for(int i=0; i<this.inputString.length(); i++){
            if (this.inputString.charAt(i) == ch){
                occur++;
            }
        }
        return occur;
    }
    
    /*
     * This function returns string without repeated characters.
     * @returns int
     */
    public String removeRepeatedCharacters(){
        int[] array = new int[inputString.length()];
        int repeated = 0;
        int size;
        String output;
        for(int n=0; n<inputString.length(); n++ ){
            array[n] = -1;

        }
        
        //finds total no. of repeated characters.
        for(int i=0; i<this.inputString.length(); i++){
            for (int y=i+1; y<this.inputString.length(); y++){
                if (this.inputString.charAt(i) == this.inputString.charAt(y)){
                    if (array[y] >= -1) {
                        array[i]++;
                        array[y]--;
                        repeated++;
                    }
                }           
            }
        }
        
        //excludes repeated characters.
        size = inputString.length() - repeated;
        char[] arrayCh = new char [size];
        for(int y=0, x=0; y<this.inputString.length(); y++){
            if (array[y] >= -1){
                arrayCh[x] = inputString.charAt(y);
                x++;
            }
            else{
                //ignores repeated ones
            }
        }
        output = String.copyValueOf(arrayCh);
        return output;
    }
}
