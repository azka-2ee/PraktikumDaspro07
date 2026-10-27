import java.util.Scanner;
public class RekapPenjualan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalSemua = 0;
        for (int h = 1; h <= 4; h++) {
            System.out.println("Hari " + h);
            int totalHari = 0;
            for (int p = 1; p <= 3; p++) {
                System.out.print("Produk " + p + ": ");
                int jumlah = sc.nextInt();
                totalHari += jumlah;
            }
            System.out.println("Total " + h + " hari: " + totalHari);
            totalSemua += totalHari;
        }
        System.out.println("Total semua produk: " + totalSemua);
        sc.close();
    }
}