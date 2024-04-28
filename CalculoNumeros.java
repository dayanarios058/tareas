import java.util.Scanner;

public class CalculoNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número entero: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número entero: ");
        int num2 = scanner.nextInt();

        System.out.print("Ingrese el tercer número entero: ");
        int num3 = scanner.nextInt();

        // Encuentra el número más grande
        int max = Math.max(Math.max(num1, num2), num3);

        // Encuentra los dos números más pequeños y calcula su suma
        int sumaDeLosDosMasPequenos = num1 + num2 + num3 - max;

        // Encuentra los dos números más grandes y calcula su diferencia
        int diferenciaDeLosDosMasGrandes = max - Math.min(Math.min(num1, num2), num3);

        // Muestra los resultados
        System.out.println("La suma de los dos números más pequeños es: " + sumaDeLosDosMasPequenos);
        System.out.println("La diferencia entre los dos números más grandes es: " + diferenciaDeLosDosMasGrandes);
        System.out.println("El número más grande es: " + max);
    }
}
