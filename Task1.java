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
    method for getting the wod count
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
    
  
}
