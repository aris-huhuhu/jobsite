import java.util.Scanner;
public class Triangle04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan nilai N = ");
        int n = sc.nextint();

        for (int i = 1; i <= n; i++){
            for (int j + 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}