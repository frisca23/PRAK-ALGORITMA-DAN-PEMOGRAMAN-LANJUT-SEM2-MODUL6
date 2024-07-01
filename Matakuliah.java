import java.util.Scanner;
public class Matakuliah {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      //inputan jenjang
      System.out.print("Masukkan Jenjang (D3/S1) : ");
      String jenjang = scanner.nextLine();

      //inputan nama mahasiswa
      System.out.print("Masukkan nama mahasiswa : ");
      String namaMahasiswa = scanner.nextLine();

      //inputan jumlah matakuliah
      System.out.print("Masukkan jumlah matakuliah : ");
      int jumlahMatakuliah = scanner.nextInt();

      //deklarasi array untuk menyimpan
      String[] namaMatakuliah = new String[jumlahMatakuliah];
      int[] sks = new int[jumlahMatakuliah];
      int[] nilai = new int[jumlahMatakuliah];

      //input data matakuliah, sks dan nilai
      for (int i = 0; i < jumlahMatakuliah; i++) {
         System.out.print("Masukkan nama matakuliah " + (i + 1) + " : ");
         namaMatakuliah[i] = scanner.nextLine();
         System.out.print("Masukkan sks matakuliah " + namaMatakuliah[i] + " : ");
         sks[i] = scanner.nextInt();
         System.out.print("Masukkan nilai matakuliah " + namaMatakuliah[i] + " : ");
         nilai[i] = scanner.nextInt();
         scanner.nextLine();
      }

      // hitung total sks dan total nilai
      int totalSks = 0;
      int totalNilai = 0;
      for (int i = 0; i < jumlahMatakuliah; i++) {
         totalSks += sks[i];
         totalNilai += nilai[i] * sks[i];
      }

      //hitung rata rata nilai
      double rataRataNilai = (double) totalNilai/totalSks;

      //tampilkan hasil
      System.out.println("\n============================");
      System.out.println("Rata-Rata Nilai Matakuliah");
      System.out.println("==============================");
      System.out.println("Nama Mahasiswa : " + namaMahasiswa);
      System.out.println("Jenjang : " + jenjang);
      System.out.println("\nDetail Matakuliah : ");
      for (int i = 0; i < jumlahMatakuliah; i++) {
         System.out.println("- " + namaMatakuliah[i] + " (" + sks[i] + " sks) - Nilai : " + nilai[i]);
      }
      System.out.println("\nRata-Rata Nilai : " + rataRataNilai);
   }
}