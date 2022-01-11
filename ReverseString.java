import java.io.*;
import java.util.*;
import java.lang.*;

public class ReverseString {
    public static void main(String[] args){
        String str = "Hello World";

        /* Method 1 - Using StringBuffer */

        StringBuffer stbfr = new StringBuffer(str);
        stbfr.reverse();
        System.out.println(stbfr);

        /* Method 2 - String to character array */
        str = "Local Hack Day: Build";
        char[] do1 = str.toCharArray();
        for(int i = do1.length-1; i >= 0; i--)
            System.out.print(do1[i]);

        System.out.println();

        /* Method 3 - Using ArrayList */
        str = "Local Hack Day";
        char[] words = str.toCharArray();
        List<Character> do2 = new ArrayList<>();

        for(char c : words)
            do2.add(c);
        
        Collections.reverse(do2);
        ListIterator li = do2.listIterator();
        while(li.hasNext())
            System.out.print(li.next());

        System.out.println();

        /* Method 4 - Using StringBuilder class */
        str = "Reverse A String";
        StringBuilder str1 = new StringBuilder();
        str1.append(str);
        str1.reverse();
        System.out.println(str1);

    }
}
