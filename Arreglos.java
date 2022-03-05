public class Arreglos {
  public Arreglos() {
    // 0 1 2 3 4
    int[] edades = { 20, 22, 25, 23, 18, 27, 35, 28 };
    String[] textos = { "Texto1", "texto 2", "text 3" };

    // LENGTH LENGHT
    System.out.println("FOR NORMAL");
    for (int indice = 0; indice < edades.length; indice = indice + 1) {
      if (indice % 3 == 0) {
        edades[indice] = 100 * indice;
      }

      System.out.println(edades[indice]);
    }

    // System.out.println("FOR EACH");

    // for (int elemento : edades) {
    // System.out.println(elemento);
    // }
  }
}
