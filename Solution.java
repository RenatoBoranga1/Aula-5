import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("");
        int n = input.nextInt();

        int[] fibonacciSequence = geraSequenciaFibonacci(n);
        System.out.print("");
        for (int i = 0; i < fibonacciSequence.length; i++) {
            System.out.print(fibonacciSequence[i]);
            if (i < fibonacciSequence.length - 1) {
                System.out.print(", ");
            }
        }
    }

    public static int[] geraSequenciaFibonacci(int n) {
        if (n == 0) {
            return new int[]{0};
        }
        int[] sequence = new int[n + 2];
        int x = 0, z = 1;
        sequence[0] = x;
        sequence[1] = z;

        int index = 2;
        while (true) {
            int next = x + z;
            if (next > n) {
                break;
            }
            sequence[index] = next;
            x = z;
            z = next;
            index++;
        }

        int[] result = new int[index];
        System.arraycopy(sequence, 0, result, 0, index);

        return result;
    }
}
