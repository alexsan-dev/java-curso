public class Matrices {
  public Matrices() {
    int[][] edades = {
        { 20, 22, 25 },
        { 30, 31, 28 },
    };

    for (int i = 0; i < 2; i = i + 1) {
      for (int j = 0; j < 3; j = j + 1) {
        System.out.println(edades[i][j]);
      }
    }
  }
}
