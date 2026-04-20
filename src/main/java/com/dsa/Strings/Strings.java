import java.util.Scanner;
import java.util.*;

public class Strings {
    public static void main(String[] args) {
        // declaration

        // Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // System.out.println("your Name is "+name);

        // concatination
        // String FirstName ="tony";
        // String LastName= "stark";
        // String FullName = FirstName+" "+LastName;
        // System.out.println(FullName.length());

        // //charAt
        // for(int i=0;i<FullName.length();i++){
        // System.out.println(FullName.charAt(i));

        // }

        // }

        // compare string
        // String name1 = "karshkr";
        // String name2 = "warshkr";

        // if (name1.compareTo(name2) == 0) {
        // System.out.println("string are equal");

        // } else {
        // System.out.println("string are not equal");
        // }

        // sub string

        String Sentence = "my name is karshkr";

        String name = Sentence.substring(10, Sentence.length()); // substring is given begindex which is 10 strtas from
                                                                 // "k"and .length() method take the whole string after
                                                                 // the beg index "karshkr"
        System.out.println(name);
    }
}