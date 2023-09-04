import java.util.Scanner;

public class venda {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

       /* System.out.println("digite seu nome: ");
        String nome= scan.nextLine(); */

        System.out.println("digite o valor da venda mensal: ");
        double venda = scan.nextDouble();

        double comissao;

        if (venda >= 100000) {
            comissao = 700.00 + (700.00 * 0.16);
            System.out.println(" o valor da comissao eh: " + comissao);
        } else if (venda >= 80000 && venda < 100000) {
            comissao = 650.00 + (650.00 * 0.14);
            System.out.println(" o valor da comissao eh: " + comissao);
        } else if (venda >= 60000 && venda < 80000) {
            comissao = 600.00 + (600.00 * 0.14);
            System.out.println(" o valor da comissao eh: " + comissao);
        } else if (venda >= 40000 && venda < 60000) {
            comissao = 550.00 + (550.00 * 0.14);
            System.out.println(" o valor da comissao eh: " + comissao);
        } else if (venda >= 20000 && venda < 40000) {
            comissao = 500.00 + (500.00 * 0.14);
            System.out.println(" o valor da comissao eh: " + comissao);
        } else {
            comissao = 400.00 + (400.00 * 0.14);
            System.out.println(" o valor da comissao eh: " + comissao);
        }
    }
}
