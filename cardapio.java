import java.util.Scanner;

public class cardapio {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.println();
        System.out.println("cardapio: ");

        System.out.println();
        System.out.println("cachorro quente");
        System.out.println("bauru simples");
        System.out.println("bauru com ovo");
        System.out.println("hamburguer");
        System.out.println("cheeseburguer");
        System.out.println("suco");
        System.out.println("refrigerante");

        System.out.println();
        System.out.print("digite a comida que deseja: ");
        String comida = scan.nextLine();

        System.out.print("digite a quantidade desejada: ");
        double qtd = scan.nextInt();

        if (comida.equals("cachorro quente")) {
            System.out.print("codigo do produto: 100 ");
            double soma = qtd * 1.20;
            System.out.println();
            System.out.println("valor a ser pago: " + soma);
        } else if (comida.equals("bauru simples")) {
            System.out.print("codigo do produto: 101");
            double soma = qtd * 1.30;
            System.out.println("valor a ser pago: " + soma);
        } else if (comida.equals("bauru com ovo")) {
            System.out.print("codigo do produto: 102");
            double soma = qtd * 1.30;
            System.out.println("valor a ser pago: " + soma);
        } else if (comida.equals("hamburguer")) {
            System.out.println("codigo do produto: 103");
            double soma = qtd * 1.50;
            System.out.println("valor a ser pago: " + soma);
        } else if (comida.equals("cheeseburguer")) {
            System.out.println("codigo do produto: 104");
            double soma = qtd * 1.20;
            System.out.println("valor a ser pago: " + soma);
        } else if (comida.equals("suco")){
            System.out.println("codigo do produto: 105");
            double soma = qtd * 2.20;
            System.out.println("valor a ser pago: " + soma);
        } else if (comida.equals("refrigerante")) {
            System.out.println("codigo do produto: 106");
            double soma = qtd * 1.00;
            System.out.println("valor a ser pago: " + soma);
        }else {
            System.out.println("produto invalido");
        }
    }
}