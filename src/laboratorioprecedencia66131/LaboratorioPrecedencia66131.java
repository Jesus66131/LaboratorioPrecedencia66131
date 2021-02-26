package laboratorioprecedencia66131;

import java.util.Scanner;
public class LaboratorioPrecedencia66131 {

    public static void main(String[] args) {
        
        //Primera parte: Precedencia de Operaciones
        double x = 9 + 10 / 2 * 6 % 2;
        System.out.println("El valor de x es : " + x);
        
        x = (9 + 10 / 2) * (6 % 2);
        System.out.println("El nuevo valor de x es : " + x);
        
        //Segunda parte - Ejercicios
        Scanner leer = new Scanner(System.in);
        
        x = 9 / 2* 2;
        System.out.println("x = 9 / 2* 2");
        System.out.println("¿Cúál es el valor de x? : ");
        leer.nextLine();
        System.out.println("El valor de x es : " + x);
        
        boolean b = (6 * 6 > (5 + 10) + 20);
        System.out.println(("b = (6 * 6 > (5 + 10) + 20)"));
        System.out.println("¿Cuál es el valor de b? : ");
        leer.nextLine();
        System.out.println("El valor de b es : " + b);
        
        int[] arreglo = {4, 4};
        int i = 1;
        arreglo[i] = 1;
        arreglo[i] = i = 0;
        System.out.println("arreglo = {4, 4}");
        System.out.println("arreglo[i] = 1");
        System.out.println("arreglo[i] = i = 0");
        System.out.println("¿El arreglo quedó asi: {" + arreglo[0] + ", " + arreglo[1] + " }");
        
        b = !(2 * (3 + 3) / 8 - 2 > 0) && (6 + (2 * 2) > (3 * 3));
        System.out.println("!(2 * (3 + 3) / 8 - 2 > (3 * 3))");
        System.out.println("¿Cuál es el valor de b? : ");
        leer.nextLine();
        System.out.println("El valor de b es: " + b);
    }

}
