/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringbuilder.StringBuilder;

/**
 *
 * @author hp
 */
public class Task3 {
    
    /*
    method to remove extra spaces
    @param string tyoe s entered by user
    @return string without extra spaces
    */
     String ridMultipleBlank(String s)
    {
       return s.replaceAll("\\s+"," ").trim();
    }
    
    
    
    
    /*
    method to remove integer from a string
    @param String type s entered from the user
    @return String type result without any integer
    */
    String removeInteger(String s)
    {
       //Converting string to charArray
        char[] charArray = s.toCharArray();
        String result = "";
  
        for (int i = 0; i < charArray.length; i++) {
 
            //if the character is not a digit it is added to the string
            if (!Character.isDigit(charArray[i])) {
                result = result + charArray[i];
            }
        }
        return result;
    }
    
   
}
