package com.smu.mscda;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.text.WordUtils;
import org.apache.commons.codec.digest.DigestUtils;
import java.util.Scanner;


public class CaptitalizeAndGenerateMDhex {

    public static void main(String[] args){
        System.out.println("This program will capitalize the input string and generate MD5 Hex\n");
        System.out.println("Enter the input String : ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println("\nCapitalized string is: " + WordUtils.capitalize(input));
        System.out.println("MD5 Hex: " + DigestUtils.md5Hex(input));
    }

    //TestCases
    public static String Capitalize(String input) { return StringUtils.capitalize(input);}
    public static String HexConversion(String input) { return DigestUtils.md5Hex(input); }
}

