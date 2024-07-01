public class Prak1WithoutException {
  public static void main(String[] args) {
    String cats[][] = {{"terry", "brown"},
                       {"kitty", "white"},
                       {"toby", "gray"},
                       {"fido", "black"}};
    System.out.println("Nama Kucing\tWarna");

    // tanpa exception handling
    for (int i = 0; i < cats.length; i++) {
      System.out.println(cats[i][0] + "\t\t" + cats[i][1]);
    }
  }
}
