public class Ave {
  int plumas;
  boolean volar;
  boolean nadar;
  String nombre;
  String color;

  // CONSTRUCTOR
  // int nPlumas, boolean nVolar, boolean nNadar, String nNombre, String nColor
  public Ave(String aNombre, boolean aVolar, boolean aNadar, int aPlumas, String aColor) {
    System.out.println("Nueva clase AVE");

    plumas = aPlumas;
    volar = aVolar;
    nadar = aNadar;
    nombre = aNombre;
    color = aColor;
  }
}
