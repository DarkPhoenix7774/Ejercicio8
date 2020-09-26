import java.util.*;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] Nombre = new String[5];
        double[] Edad = new double[5];
        String alumnoNombre;
        double alumnoEdad;
        int i = 0;


 System.out.print("Ingrese el nombre alumno: " + (i + 1 ) + ": ");
        Nombre[i] = sc.nextLine();
        System.out.print("Ingrese la edad del alumno ");
        Edad[i] = sc.nextDouble();
        alumnoEdad = Edad[i];
        alumnoNombre = Nombre[i];


        for (i = 1; i < Nombre.length; i++) {
            sc.nextLine();
            System.out.print("Ingrese  el nombre del alumno " + (i + 1) + ": ");
            Nombre[i] = sc.nextLine();
            System.out.print("Ingrese la edad del alumno: ");
            Edad[i] = sc.nextDouble();
            System.out.println("Ingrese * para parar el codigo");

            if (Edad[i] > alumnoEdad ) {
                alumnoEdad = Edad[i];
                alumnoNombre = Nombre[i];
            }
        }

        System.out.println("El alumno con ms edad es: " + alumnoNombre);


        System.out.println("Edad: " + alumnoEdad);

    }


}
