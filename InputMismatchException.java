import java.util.Scanner;
public class InputMismatchException {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int baris = 2;
    int kolom = 3;

    int[][] x = new int[baris][kolom];
    int[][] y = new int[baris][kolom];

    // inputan matriks dengan exception handling
    System.out.println("Masukkan elemen matrix x (baris x kolom):");
    for (int i = 0; i < baris; i++) {
      for (int j = 0; j < kolom; j++) {
        try {
          System.out.print("x[" + (i + 1) + "][" + (j + 1) + "] = ");
          x[i][j] = input.nextInt();
        } catch (inputMismatchException e) {
          System.out.println("Input tidak valid. Masukkan angka integer!");
          input.nextLine(); // Clear invalid input from buffer
        }
      }
    }

    // Input for matrix y with exception handling
    System.out.println("\nMasukkan elemen matrix y (baris x kolom):");
    for (int i = 0; i < baris; i++) {
      for (int j = 0; j < kolom; j++) {
        try {
          System.out.print("y[" + (i + 1) + "][" + (j + 1) + "] = ");
          y[i][j] = input.nextInt();
        } catch (inputMismatchException e) {
          System.out.println("Input tidak valid. Masukkan angka integer!");
          input.nextLine();
        }
      }
    }

    int[][] z = new int[baris][kolom];
    for (int i = 0; i < baris; i++) {
      for (int j = 0; j < kolom; j++) {
        z[i][j] = x[i][j] + y[i][j];
      }
    }

    System.out.println("\nHasil penjumlahan matrix:");
    for (int i = 0; i < baris; i++) {
      for (int j = 0; j < kolom; j++) {
        System.out.print(z[i][j] + " ");
      }
      System.out.println();
    }
  }
}
