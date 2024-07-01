public class Prak1WithException {
  public static void main(String[] args) {
    String cats[][] = {{"terry", "brown"},
                       {"kitty", "white"},
                       {"toby", "gray"},
                       {"fido", "black"}};
    System.out.println("Nama Kucing\tWarna");

    // dengan exception handling
    for (int i = 0; i < cats.length; i++) {
      try {
        System.out.println(cats[i][0] + "\t\t" + cats[i][1]);
      } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Error: Index out of bounds for cat " + (i + 1));
      }
    }
  }
}
