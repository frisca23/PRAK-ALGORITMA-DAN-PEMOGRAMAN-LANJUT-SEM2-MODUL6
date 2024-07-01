public class Prak2WithException {
  public static void main(String[] args) {
    String cats[][] = {{"terry", "brown"},
                       {"kitty", "white"},
                       {"toby", "gray"},
                       {"fido", "black"}};
    System.out.println("Nama Kucing\tWarna");

    // dengan exception handling
    for (int i = 0; i < cats.length; i++) {
      for (int j = 0; j < cats[i].length; j++) {
        try {
          System.out.print(cats[i][j]);
          System.out.print("\t");
        } catch (ArrayIndexOutOfBoundsException e) {
          System.out.println("Kesalahan: Indeks di luar batas untuk baris " + (i + 1) + ", kolom " + (j + 1));
        }
      }
      System.out.println();
    }
  }
}
