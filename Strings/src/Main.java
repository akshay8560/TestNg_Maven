import java.util.StringJoiner;

public class Main {
    public static void main(String[] args) {
    /* String s1="name";
     char ch[]={'s','t','r'};
     String s2=new String(ch); // convert into the string
     String s3=new String("str3");
     System.out.println(s1);
     System.out.println(s2);
     System.out.println(s3);*/

     // String concatenation

      // 1st method + operator

      /*String str1="Akshay";
      String str2="Kumar";

      String str=str1.concat(str2);
        System.out.println(str);


*/


        // method 2 + operraor

     /*   String str1="Akshay";
        String str2="Kumar";

        String str3=str1+str2;
        System.out.println(str3);*/


        // append using string builder

     /* StringBuilder str1=new StringBuilder("Akshay");
      StringBuilder str2=new StringBuilder("Kumar");
      StringBuilder str3=new StringBuilder("Doodwal");
     StringBuilder str=str1.append(str2);
     StringBuilder str4=str2.append(str3);
     System.out.println(str4);
     System.out.println(str);*/


        //method 3
        // using formate method

  /*  String s1="Akshay";
    String s2="Kumar";
    String s3=String.format("%s%s",s1,s2);
        System.out.println(s3);
*/




        // method 4 using join
      /*  String s1="Akshay";
        String s2="Kumar";
        String s3=String.join("",s1,s2);
        System.out.println(s3);*/


        // Method 5
        // using string joiner method
    /*    String s1="Akshay";
        String s2="Kumar";
        StringJoiner str=new StringJoiner("",s1,s2);
        System.out.println(str);
        */
}
}
