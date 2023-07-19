import java.util.Scanner;

public class Calculadora {
	
	public static int sumar(int a, int b) {
        return a + b;
    }

    public static int restar(int a, int b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: No se puede dividir por cero.");
            return 0;
        }
    }
	
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();

        System.out.print("Ingrese la operación a realizar (SUM, RES, MUL, DIV): ");
        String operacion = scanner.next();

        int resultado = 0;

        switch (operacion.toUpperCase()) {
            case "SUM":
                resultado = sumar(num1, num2);
                System.out.println("Suma: " + resultado);
                break;
            case "RES":
                resultado = restar(num1, num2);
                System.out.println("Resta: " + resultado);
                break;
            case "MUL":
                resultado = multiplicar(num1, num2);
                System.out.println("Multiplicación: " + resultado);
                break;
            case "DIV":
                double resultadoDivision = dividir(num1, num2);
                System.out.println("División: " + resultadoDivision);
                break;
            default:
                System.out.println("Operación inválida.");
                break;
        }

        scanner.close();
    }
}
