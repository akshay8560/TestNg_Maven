import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
//        String str="Akshay";
//        int length=str.length();
//        // empty string
//        String str1="";
//        char ch;
//
//        for(int i=0;i<length;i++){
//            ch=str.charAt(i);
//            str1=ch+str1;
//        }
//        System.out.println(str1);
//       String st=30+40+"Akshay"+30+40;
//        System.out.println(st);
//
//        Deque<String> dq=new ArrayDeque<>();
//        dq.add("Akshay");
//        dq.add("Vikas");
//        dq.add("Mohit");
//        for (String str : dq){
//            System.out.println(str);
//        }

        Map<Integer,String> map=new HashMap<Integer,String>();
        map.put(100,"Amit");

        map.put(102,"Rahul");
        map.put(101,"Vijay");
        System.out.println(map);



    }
}