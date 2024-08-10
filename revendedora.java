public class revendedora {
    public static double valorProdutoFinal(double[] input) {
        double valor = input[0];
        double estado = input[1];
        double imposto;

        if (estado == 1.0) {
            imposto = 0.07;
        } else if (estado == 2.0) {
            imposto = 0.12;
        } else if (estado == 3.0) {
            imposto = 0.15;
        } else {
            return -1.0;
        }

        double valorFinal = valor + (valor * imposto);
        return Math.round(valorFinal * 10000.0) / 10000.0;
    }

    public static void main(String[] args) {
        double[] a = {250.10, 1.0};
        double[] b = {220.50, 3.0};
        double[] c = {150.00, 4.0}; 

        System.out.println(valorProdutoFinal(a)); 
        System.out.println(valorProdutoFinal(b)); 
        System.out.println(valorProdutoFinal(c)); 
    }
}

