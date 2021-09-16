import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Questions01 {
    //bir strigi tersine ceviren method
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Ters cevirebilmek icin ifade giriniz");
        String str=scan.nextLine();

        System.out.println(reverseString(str));//String terse cevrilir


    }
    public static String reverseString(String str){
        //StrinBuilder ile
     /*   StringBuilder strB=new StringBuilder();
        strB.append(str);
        return strB.reverse().toString();
       */


        //Loop kullanarak
       String ters="";

       for(int i=str.length()-1;i>=0;i--) {
           ters = ters + str.charAt(i);
       }
       return ters;




    }
}
