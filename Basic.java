import java.util.*;

public class Basic{
    public static void main(String[] args) {

        String name="Nikku";
        char[]ch= name.toCharArray();
        for(int i=0; i<ch.length; i++){
            System.out.println(ch[i]);
        }


        // Convert :  Integer -> String 
        int n=2024;
        String s=Integer.toString(n);
        String s1=String.valueOf(n); 
        // String s2=new Integer(n).toString();  // give ans with warning 
        System.out.println("String : "+s);


        // Convert:  String -> Integer
        String a="3066";
        int x=Integer.parseInt(a);
        int y=Integer.valueOf(a);
        System.out.println("Integer: "+x);
        System.out.println("Integer: "+y);


        // Convert:  Character -> Integer
        char c = '3';
        int b = c - '0';
        int d = Integer.parseInt(String.valueOf(c));
        int e = Character.getNumericValue(c);
        System.out.println("Character: "+b);
        System.out.println("Character: "+d);
        System.out.println("Character: "+e);

        // StringBuilder
        StringBuilder str= new StringBuilder();
        str.append(4500);
        String str1=str.toString();
        System.out.println(str1);
        
        
        // StringBuffer
        StringBuffer str2= new StringBuffer();
        String str3= str2.append(4566).toString();
        System.out.println(str3);

        // Convert:  Integer -> Binary
        int h = 5; 
        String binaryString = Integer.toBinaryString(h); 
        // Printing the binary number stored in above string 
        System.out.println(binaryString); 
        
    }
}