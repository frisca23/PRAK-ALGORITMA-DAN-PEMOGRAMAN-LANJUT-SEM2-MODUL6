import java.util.Scanner;
public class Prak3WithException {
  public static void main(String[] args) {
    String cats[][] = {{"terry", "brown"},
                       {"kitty", "white"},
                       {"toby", "gray"},
                       {"fido", "black"}};
    Scanner input = new Scanner(System.in);
    System.out.println("Nama Kucing\tWarna");
    // data with exception handling (optional)
    for (int i = 0; i < cats.length; i++) {
      try {
        System.out.print(cats[i][0]);
        System.out.print("\t");
        System.out.println(cats[i][1]);
      } 
      catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Kesalahan: Indeks di luar batas untuk baris " + (i + 1));
      }
    }

    System.out.println("Masukkan nama kucing: ");
    String namaKucing = input.nextLine();
    System.out.println("Masukkan warna kucing: ");
    String warnaKucing = input.nextLine();

    String newCat[][] = new String[cats.length + 1][2]; 
    for (int i = 0; i < cats.length; i++) {
      newCat[i][0] = cats[i][0];
      newCat[i][1] = cats[i][1];
    }
    newCat[cats.length][0] = namaKucing;
    newCat[cats.length][1] = warnaKucing;
    cats = newCat; 

    System.out.println("Nama Kucing\tWarna");
    for (int i = 0; i < cats.length; i++) {
      System.out.print(cats[i][0]);
      System.out.print("\t");
      System.out.println(cats[i][1]);
    }
  }
}
