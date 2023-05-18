package Lacos;

public class divisiveisPorQuatro {
    public static void main(String[] args) {
        int i = 30;
        while(i >= 1){
            if ((i %4)==0){
                System.out.println("["+i+"]");

            }else{
                System.out.println(i);
            }
            i--;
        }
    }
}
