public class Loop {
    public static void main(String args[]){
        System.out.println("for loop");
        for(int i = 0; i < 10; i++){
            System.out.println(i);
        }

        int j = 0;
        System.out.println("While");
        while (j < 11) {
            System.out.println(j);
            j++;
        }
        int k = 0;
        System.out.println(("Do while"));
        do{
            System.out.println(k);
            k++;
        }while(k < 11);
    }
}
