package com.vm.training.java.Strings;
 
public class MyCharArrayCopy {
 
    public static void main(String a[]){
     
        String str = "Copy chars from this string";
        char[] ch = new char[5];
        /**
         * The getChars() method accepts 4 parameters
         * first one is the start index from string
         * second one is the end index from string
         * third one is the destination char array
         * forth one is the start index to append in the 
         * char array.
         */
        str.getChars(5, 10, ch, 0);
        System.out.println(ch);
    }
}