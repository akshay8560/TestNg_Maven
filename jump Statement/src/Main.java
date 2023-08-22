public class Main {
    public static void main(String[] args) {
        // beak and continue
        // break statement
//        for(int i=0;i<=10;i++){
//            System.out.println(i);
//            if(i==6){
//                break;
//            }
//        }

        for(int i=0;i<=2;i++){
            for (int j=i;j<=5;j++){

                if(j==4){
                   continue;
                }
                System.out.println(j);
            }

        }
    }
}