public class Funciones {

  public void imprimir() {
    System.out.println("hola1");
    System.out.println("hola2");
  }

  public int sumar(int a, int b) {
    return a + b;
  }

  public Funciones() {
    // imprimir();
    // resultado = 3 + 2
    int resultado = sumar(1, 2) + sumar(1, 1);
    System.out.println(resultado);
  }
}
