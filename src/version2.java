import java.util.Scanner;

public class version2 {
public static void main(String[] args) {
    Scanner lectura = new Scanner(System.in);
    int opcion = 0;

    do {
        System.out.println("\n===== SISTEMA DE NOTAS =====");
        System.out.println("BIENVENIDO");
        System.out.println("1. Agregar alumno");
        System.out.println("2. Agregar nota");
        System.out.println("3. Salir");
        System.out.print("Ingrese una opción: ");

        opcion = lectura.nextInt();
        lectura.nextLine();

        switch (opcion) {
            case 1:
                System.out.print("Nombre del alumno: ");
                String nombre = lectura.nextLine();
                System.out.println( nombre + " Alumno agregado correctamente.");
                break;

            case 2:
                System.out.print("Nota del alumno: ");
                double nota = lectura.nextDouble();
                System.out.println( " Nota " + nota + " agregada correctamente.");
                break;

            case 3:
                System.out.println("¡Hasta pronto!");
                break;

            default:
                System.out.println("Opción inválida, intente nuevamente.");
        }

    } while (opcion != 3);




}
}
