import java.util.*;
// public class SolidRectangle {
//     public static void main(String[] args) {
//         int r = 4; 
//         int c = 5;
//         for (int i = 0; i < r; i++) {
//             for (int j = 0; j < c; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
            
//         }
//     }
// }


public class SolidRectangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("*");
            }
            System.out.println();
            
        }
    }
}