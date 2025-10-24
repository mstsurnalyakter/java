import java.util.*;
public class Sum {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= 10 ; i++){
            System.out.print(i);
            System.out.print("x");
            System.out.print(n);
            System.out.print("=");
            System.out.print(i*n);
            

        }
    }
}