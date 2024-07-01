import java.util.Scanner;
public class Mata_Kuliah {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String jenjangPendidikan;
        int totalSks = 0;
        int maksSks;

        System.out.print("Masukkan jenjang (D3/S1) = ");
        jenjangPendidikan = scanner.next();
        if (jenjangPendidikan.equalsIgnoreCase("D3")) {
            maksSks = 3;
        } else if (jenjangPendidikan.equalsIgnoreCase("S1")) {
            maksSks = 5;
        } else {
            System.out.println("Jenjang pendidikan tidak valid. Silahkan masukkan D3 atau S1.");
            return;
        }
        while (true) {
            System.out.print("Masukkan matakuliah = ");
            String namaMatkul = scanner.next();
            if (namaMatkul.equalsIgnoreCase("selesai")) {
                break;
            }
            System.out.print("Masukkan SKS " + namaMatkul + " = ");
            int sksMatkul = scanner.nextInt();
            if (totalSks + sksMatkul > maksSks) {
                System.out.println("Pendaftaran melebihi batas SKS untuk " + jenjangPendidikan + ". Mata kuliah " + namaMatkul + " dilewati.");
                continue;
            }
            totalSks += sksMatkul;
            System.out.println("Terdaftar di " + namaMatkul + ". Total SKS: " + totalSks);
        }
        System.out.println("Pendaftaran selesai. Total SKS yang diambil: " + totalSks);
   }
}