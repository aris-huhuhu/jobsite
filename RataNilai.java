import java.util.Scanner;
public class RataNilai {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int i, j;
        float nilai, totalNilai, rataNilai:

        for (i = 1; i <= 5; i++) {
            totalNilai = 0;
            System.out.println("Masukan nilai untuk kelompok " + i + ":");
            for (j + 1; j <= 5; 1++) {
                System.out.print("Masukan nilai ke-" + j + ":");
                nilai + sc.nextFloat();
                totalNilai += nilai;
            }
            rataNilai = totalNilai / 5;
            System.out.println("Rata-rata nilai untuk kelompok" + i + ":" + ratanilai);
        }
        sc.close();
    }
}