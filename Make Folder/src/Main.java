import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter your path name folder");
        Scanner scanner=new Scanner(System.in);

        String path=scanner.next();
        System.out.println("Enter your directory name ");
        path=path+scanner.next();
        File file=new File(path);
        boolean bool=file.mkdir();
        if(bool){
            System.out.println("True");
        }
        else {
            System.out.println("Error");
        }

    }
}