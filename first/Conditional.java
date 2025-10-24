// import java.util.*;

// public class Conditional {

//     public static void main(String arg[]){
//         Scanner sc = new Scanner(System.in);
//         int age = sc.nextInt();
//         if (age > 18) {
//             System.out.println("Adult");
//         }else{
//             System.out.println("Children1");
//         }
//     }
// }

// import java.util.*;

// public class Conditional {

//     public static void main(String arg[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter your age: ");
//         int age = sc.nextInt();

//         if (age > 18) {
//             System.out.println("Adult");
//         } else {
//             System.out.println("Children");
//         }
//     }
// }

// odd
// import java.util.*;


// public class Conditional {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number: ");
//         int number = sc.nextInt();
//         if (number % 2 == 0) {
//             System.out.println("even");
//         } else {
//             System.err.println("odd");
//         }
//     }
// }

// compare

// import java.util.*;

// public class Conditional {

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("Enter first number a = ");
//         int a = scanner.nextInt();
//         System.out.println("Enter second number b = ");
//         int b = scanner.nextInt();

//         if (a == b) {
//             System.out.println("Equal");
//         } else if(a > b) {
//             System.out.println("a is gather than b");
//         }else{
//             System.out.println("a is less than b2");
//         }

//     }
// }


import java.util.*;

public class Conditional {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        switch (num) {
            case 1:
                System.out.println("hello");
                break;
            case 2:
            System.out.println("hell");
                break;
        
            default:
            System.out.println("k");
                break;
        }
    }
}