package test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class TEST {    
    public static void main(String[] args) throws FileNotFoundException {
        File file2read=new File("C:"+File.separator+"Users"+File.separator+"MisterHyde"+File.separator+"Desktop"+File.separator+"pass.txt");
        Scanner getLines=new Scanner(file2read);
        String fileConcat="";
        while(getLines.hasNext()){
            fileConcat=fileConcat+(getLines.next()+"&&$$&&");
        }
        
        StringTokenizer file2Tokens=new StringTokenizer(fileConcat,"&&$$&&");
        while(file2Tokens.hasMoreTokens()){
            String currentToken=file2Tokens.nextToken();
            System.out.println(currentToken.substring(currentToken.indexOf(":")+1,currentToken.length()));
        }
    }
}
