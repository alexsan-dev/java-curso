public class Ciclos {
  public Ciclos() {
    // --- CICLOS ---
    int contador2 = 0;
    // FOR

    for (int contador = 0; contador < 5; contador = contador + 1) {
      System.out.println(contador);
      contador2 = contador2 + 1;
    }

    System.out.println("-----");
    System.out.println(contador2);

    // WHILE

    while (contador2 < 5) {
      contador2 = contador2 + 1;
      System.out.println(contador2);
    }

    // DO WHILE
    do {
      contador2 = contador2 + 1;
      System.out.println(contador2);
    } while (contador2 < 5);
  }
}
