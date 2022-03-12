public class Clases {
  public Clases() {
    // INSTANCIA
    Ave cuervo = new Ave("Cuervo", true, false, 200, "Negro");
    Ave pinguino = new Ave("Pinguino", false, true, 10, "Gris");
    Ave pato = new Ave("Pato", true, true, 3000, "Verde");

    System.out.println(cuervo.nombre);
    System.out.println(cuervo.volar);
    System.out.println(cuervo.nadar);
    System.out.println(cuervo.color);
    System.out.println(cuervo.plumas);
  }
}
