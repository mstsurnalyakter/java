import java.util.*;

public class HellowRectangle {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int r = 4;
    int c = 5;
    for (int i = 1; i <= r; i++) {
        for (int j = 1; j <= c; j++) {
            if (i == 1 || j == 1 || i == r || j == c) {
               System.out.print("*"); 
            }else{
                System.out.print(" "); 
            }
        }
        System.out.println();
    }
    }
}
