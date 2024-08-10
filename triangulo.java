public class triangulo {
    public static boolean tri(int[] input) {
        if (input.length != 3) {
            return false;
        }

        int a = input[0];
        int b = input[1];
        int c = input[2];

        if (a+b>c && a+c>b && b+c>a) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int[] lados1 = {2, 2, 5};
        int[] lados2 = {3, 3, 5};

        System.out.println(tri(lados1)); 
        System.out.println(tri(lados2));
    }
}
