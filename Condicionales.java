public class Condicionales {
  public Condicionales() {
    int edad = 20;
    int semestre = 2;
    int edad2 = 21;

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

    if (edad == edad2) {
      System.out.println("SI entro en la codicion");
    } else {
      System.out.println("NO entro en la codicion");
    }

    if (edad >= 20) {
      System.out.println("Adulto");
    } else {
      System.out.println("Joven");
    }

    switch (edad) {
      case 30:
        System.out.println("Adulto");
        break;

      case 20:
        System.out.println("Joven");
        break;

      case 10:
        System.out.println("Niño");
        break;
    }

    // 1 && 1 = 1
    // 1 && 0 = 0
    // 0 && 1 = 0
    // 0 && 0 = 0

    // 1 || 1 = 1
    // 1 || 0 = 1
    // 0 || 1 = 1
    // 0 || 0 = 0

    if (edad >= 20) {
      System.out.println("Adulto");

      if (semestre == 1) {
        System.out.println("Semestre1");
      } else {
        System.out.println("Semestre2");
      }
    }

  }
}
