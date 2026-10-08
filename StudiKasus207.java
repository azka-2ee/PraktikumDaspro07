import java.util.Scanner;
public class StudiKasus207 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Variabel
    String nama, jenis;
    byte jumlahDokumen, juara, statusPKM;

    // Input
    System.out.println("Nama Mahasiswa: ");
    nama = sc.nextLine();
    System.out.println("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA): ");
    jenis = sc.nextLine();
    
    // Proses dan output
    if (jenis.equalsIgnoreCase("BELMAWA") || 
        jenis.equalsIgnoreCase("BAKORMA") || 
        jenis.equalsIgnoreCase("MANDIRI")) {
        System.out.println("Jumlah dokumen: ");
        jumlahDokumen = sc.nextByte();
        if (jumlahDokumen == 4) {
            System.out.println("Peringkat juara: ");
            juara = sc.nextByte();
            if (juara >= 1 && juara <= 3) {
                System.out.println("Status: Berhak memperoleh dana penghargaan.");
            } else
                System.out.println("Status: Tidak memperoleh dana penghargaan (hanya untuk Juara 1/2/3).");
        
        } else if (jumlahDokumen == 3) {
            System.out.println("Status: Dokumen tidak lengkap (kurang 1 dokumen). Dana penghargaan tidak diberikan.");
        } else if (jumlahDokumen == 2) {
            System.out.println("Status: Dokumen tidak lengkap (kurang 2 dokumen). Dana penghargaan tidak diberikan.");
        } else {
            System.out.println("Status: Dokumen tidak lengkap (kurang 3 dokumen). Dana penghargaan tidak diberikan.");
        }
    } else if (jenis.equalsIgnoreCase("PKM")) {
        System.out.println("Jumlah dokumen: ");
        jumlahDokumen = sc.nextByte();
        if (jumlahDokumen == 4) {
            System.out.println("Status pendanaan PKM (1 = lolos, 0 = tidak lolos): ");
            statusPKM = sc.nextByte();
            if (statusPKM == 1) {
                System.out.println("Status: Berhak memperoleh dana penghargaan (PKM lolos pendanaan).");
            } else
                System.out.println("Status: Tidak memperoleh dana penghargaan (PKM tidak lolos pendanaan).");
        
        } else if (jumlahDokumen == 3) {
            System.out.println("Status: Dokumen tidak lengkap (kurang 1 dokumen). Dana penghargaan tidak diberikan.");
        } else if (jumlahDokumen == 2) {
            System.out.println("Status: Dokumen tidak lengkap (kurang 2 dokumen). Dana penghargaan tidak diberikan.");
        } else {
            System.out.println("Status: Dokumen tidak lengkap (kurang 3 dokumen). Dana penghargaan tidak diberikan.");
        }
    } else {
        System.out.println("Status: Tidak memperoleh dana penghargaan (jenis kegiatan tidak termasuk ketentuan).");
    }
    
    sc.close();    
    }
    
}
