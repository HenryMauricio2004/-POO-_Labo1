import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Menu();
    }

    public static void Menu(){
        String opciones[] = {"sumar", "restar", "multiplicar", "dividir"};
        Scanner scanner = new Scanner(System.in);

        int option;

        do{
            System.out.println("\n--Calculadora--");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("\n5. Salir");

            System.out.print("--------------\n>>");
            option = scanner.nextInt();

            float a = 0, b = 0;
            float result = 0;

            if (option >= 1 && option <= 5){
                System.out.printf("ingrese los dos numeros a %s", opciones[option-1]);
                if (option == 4) System.out.print(" primero el dividendo y despues el divisor");

                System.out.print("\nprimer numero >>");
                a = scanner.nextFloat();

                System.out.print("segundo numero >>");
                b = scanner.nextFloat();
            }


            switch (option) {
                case 1:
                    result = Suma(a, b);
                    break;
                case 2:
                    result = Resta(a, b);
                    break;
                case 3:
                    result = Multiplicacion(a, b);
                    break;
                case 4:

                    if (b != 0) {
                        result = Division(a, b);
                    } else {
                        System.out.println("\nNo se puede dividir entre 0");
                        result = 0;
                    }
                    break;
                default:
                    System.out.println("\n--Opcion no valida--");
                    break;
            }

            System.out.println("========================================");
            System.out.printf("El resultado es: %f\n", result);
            System.out.println("========================================");

        } while(option != 5);

        scanner.close();
    }

    public static float Suma(float a, float b){
        return a + b;
    }

    public static float Resta(float a, float b){
        return a - b;
    }

    public static float Multiplicacion(float a, float b){
        return a * b;
    }

    public static float Division(float a, float b){
        return a/b;
    }

}