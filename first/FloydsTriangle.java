public class FloydsTriangle {
    public static void main(String[] args) {
        int n = 5;
        int j = 1;
        for (int i = 1; i <=n; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print(j + " ");
                j++;
            }
            System.out.println();
        }
    }
}
