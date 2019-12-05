package com.sample;

import java.util.regex.*;    
public class RegexExample8{    
    public static void main(String[] args){    
            Pattern pattern = Pattern.compile("java");    
          
            Matcher matcher = pattern.matcher("this is java, do you know java");    
            boolean found = false;    
            while (matcher.find()) {    
                System.out.println("I found the text "+matcher.group()+" starting at index "+    
                 matcher.start()+" and ending at index "+matcher.end());    
                found = true;    
            }    
            if(!found){    
                System.out.println("No match found.");    
            }    
        }    
      
}  
