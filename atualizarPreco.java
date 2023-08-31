import java.util.Scanner;

public class atualizarPreco {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.println("digite o preco antigo: ");
        double preco= scan.nextDouble();

        if (preco<=50){
            double valor= preco+(preco*0.05);
            System.out.println("preco novo: "+valor);
        } else if (preco>=50 && preco<=100) {
            double valor= preco+(preco*0.10);
            System.out.println("preco novo: "+valor);
        } else if (preco>100) {
            double valor= preco+(preco*0.15);
            System.out.println("preco novo: "+valor);
        }else {
            System.out.println("INVALIDO");
        }
    }
}