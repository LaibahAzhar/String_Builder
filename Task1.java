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
public class Task1 {
    
   /*
    method for getting the word count
    @param String type s , enetered by the user
    @return the word count
    */
    int wordCounter(String s){
        int cnt = 1;
        for( int i = 1 ; i < s.length() ; i++)
        {
            //the following ignores the blank space
            if(s.charAt(i)==' ' )
            {
                cnt--;                
            }
            cnt++;
        }
               return cnt;
    }
    
    /*
    method to getting the vowel count
    @param the string type s entered by the user
    @return the vowel count
    */
    int vowelCounter(String s){
        int cnt=0 ;
        for(int i = 0 ; i< s.length() ; i++)
        {
            //the following checks if any vowels exist and adds 1 to the count
            if(s.charAt(i)=='a' || s.charAt(i)=='A'|| s.charAt(i)=='e' || s.charAt(i)=='E'|| s.charAt(i)=='i' || s.charAt(i)=='I' || s.charAt(i)=='o' || s.charAt(i)=='O' || s.charAt(i)=='u' || s.charAt(i)=='U')
            {
                cnt++;
            }
        }
        return cnt;
    }
    
    /*
    method to getting the punctuation count
    @param the string type s entered by the user
    @return the punctuation count
    */
    int puncCounter(String s){
        
        int cnt=0 ;
        for(int i = 0 ; i< s.length() ; i++)
        {
            //the following checks if any punctuation exist and adds 1 to the count
            if(s.charAt(i)==',' || s.charAt(i)==';'|| s.charAt(i)==':' || s.charAt(i)=='.'|| s.charAt(i)=='?' || s.charAt(i)=='!' || s.charAt(i)=='-' || s.charAt(i)=='_' || s.charAt(i)==')' || s.charAt(i)=='(' || s.charAt(i)=='"')
            {
                cnt++;
            }
        }
        return cnt;
        
    }
    
    /*
    method to find a substring thorghout the string
    @param the string type s entered by the user and string type sub the user wants to find in the string
    @return boolean true if sub-string is present else false if not present
    */
    boolean findSubString(String s , String sub)
    {
        for(int i = 0 ; i< s.length() ; i++)
        {
            for(int j = 0 ; j<sub.length() ; j++)
            {
                if(s.charAt(i)!= sub.charAt(j))
                {
                    break;
                }else{
                    return true;
                }
            }
        }
        return false;
    }
    
}
