
public class fibonacci {
    public static void main(String[] args) {
        int input = 8; 
        String resultado = geraSequenciaFibonacci(input);
        System.out.println("" + resultado);
    }

    public static String geraSequenciaFibonacci(int input) {
        if (input == 0) {
            return "0";
        }

        StringBuilder sequence = new StringBuilder();
        int x = 0, z = 1;

        sequence.append(x).append(", ").append(z);

        while (true) {
            int next = x + z;
            if (next > input) {
                break;
            }
            sequence.append(", ").append(next);
            x = z;
            z = next;
        }

        return sequence.toString();
    }
}