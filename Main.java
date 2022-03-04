public class Main {
  public static void main(String[] args) {
    // STRING | INT | BOOLEAN | CHAR | DOUBLE

    // OPERACIONES ALGEBRAICAS -> NUMBER | DECIMAL
    // suma +
    // resta -
    // multiplicacion *
    // division /
    // System.out.println((edad + constante + (edad * constante) - (constante -
    // edad)) * constante);

    // OPERACIONES RELACIONES -> BOOLEAN
    // igual ==
    // no igual !=

    // mayor o igual >=
    // menor o igual <=
    // mayor >
    // menor <
    // AND &&
    // OR ||

    // IF

    // if (edad == constante) {
    // System.out.println("SI entro en la codicion");
    // } else {
    // System.out.println("NO entro en la codicion");
    // }

    // if (edad >= 20) {
    // System.out.println("Adulto");
    // } else {
    // System.out.println("Joven");
    // }

    // switch (edad) {
    // case 30:
    // System.out.println("Adulto");
    // break;

    // case 20:
    // System.out.println("Joven");
    // break;

    // case 10:
    // System.out.println("Niño");
    // break;
    // }

    // int edad = 20;
    // int semestre = 2;

    // 1 && 1 = 1
    // 1 && 0 = 0
    // 0 && 1 = 0
    // 0 && 0 = 0

    // 1 || 1 = 1
    // 1 || 0 = 1
    // 0 || 1 = 1
    // 0 || 0 = 0

    // if (edad >= 20) {
    // System.out.println("Adulto");

    // if (semestre == 1) {
    // System.out.println("Semestre1");
    // } else {
    // System.out.println("Semestre2");
    // }
    // }

    // --- CICLOS ---
    // FOR

    // for (int contador = 0; contador < 5; contador = contador + 1) {
    // System.out.println(contador);
    // contador2 = contador2 + 1;
    // }

    // System.out.println("-----");
    // System.out.println(contador2);

    // WHILE

    int contador2 = 0;
    // while (contador2 < 5) {
    // contador2 = contador2 + 1;
    // System.out.println(contador2);
    // }

    // DO WHILE
    do {
      contador2 = contador2 + 1;
      System.out.println(contador2);
    } while (contador2 < 5);
  }
}
