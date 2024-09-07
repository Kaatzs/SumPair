import java.util.Scanner;

public class Sumpair {

    public static int sumPair0(int[] vector) {
        int count = 0;

        for (int i = 0; i < vector.length; i++) {
            for (int j = i + 1; j < vector.length; j++) {
                if ((vector[i] + vector[j]) % 2 == 0) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Numero de elementos del array: ");
            int n = scanner.nextInt();
            int[] vector = new int[n];
            System.out.println("Elementos del array:");
            for (int i = 0; i < n; i++) {
                System.out.print("Elemento " + (i + 1) + ": ");
                vector[i] = scanner.nextInt();
            }
            int resultado = sumPair0(vector);
            System.out.println("La suma de los numeros pares es: " + resultado);
        }
    }
}

