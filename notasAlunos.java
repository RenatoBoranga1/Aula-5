public class notasAlunos {
    public static String mediaAproveitamento(double[] input) {

        double a = input[0];
        double b = input[1];
        double c = input[2];
        double media = input[3];

        double m2 = (a + b * 2 + c * 3 + media) / 7;

        if (m2 >= 9.0) {
            return "A";
        } else if (m2 >= 7.5) {
            return "B";
        } else if (m2 >= 6.0) {
            return "C";
        } else {
            return "D";
        }
    }
    public static void main(String[] args) {
        double[] n1 = {8.0, 7.0, 8.0, 8.0};
        double[] n2 = {5.0, 4.3, 8.0, 7.0};

        System.out.println("" + mediaAproveitamento(n1));
        System.out.println("" + mediaAproveitamento(n2));
    }
}
