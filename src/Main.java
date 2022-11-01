import java.io.*;
import java.util.Scanner;

class ReverseString {
    public static void main (String[] args){
        String str= "Geeks", nstr="";
        char ch;

        System.out.println("This program prints the reverse of a String that is hardcoded.");
        System.out.print("Original word: ");
        System.out.println("Geeks"); //Example word

        for (int i=0; i<str.length(); i++){
            ch=str.charAt(i); //extracts each character
            nstr=ch+nstr; //adds each character in front of the existing string
        }

        System.out.println("Reverse word: "+ nstr);
    }
}