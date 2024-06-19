import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n;
        Scanner inp = new Scanner(System.in);

        System.out.print("Sinir Sayisini Giriniz :");
        n = inp.nextInt();
        //4'un katlarini bulan program.
       for (int i = 1; i <=n ; i*=4){
           System.out.println(i);
       }
        System.out.println("--------------------------");
        //5'in katlarini bulan program.
        for (int i = 1; i <=n; i*=5){
            System.out.println(i);
        }
    }
}
