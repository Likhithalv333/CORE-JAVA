import java.io.*;
import java.util.*;

public class revchar {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String rev=" ";
		String temp=A;
        int l= A.length();
        for(int i=l-1;i>=0;i--){
            rev +=A.charAt(i);
        }
		System.out.println(rev);
        if(rev==A){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
