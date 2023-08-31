import java.util.Scanner;

public class classificao {
    public static void main(String args[]){
        Scanner scan= new Scanner(System.in);

        System.out.print("digite sua altura: ");
        float altura= scan.nextFloat();

        System.out.print("digite o seu peso: ");
        float peso= scan.nextFloat();

        if (altura<1.20 && peso<=60){
            System.out.println("classificacao A");
        } else if (altura>=1.20 && altura<=1.70 && peso<=60) {
            System.out.println("classificacao B");
        } else if (altura>1.70 && peso<=60) {
            System.out.println("classificacao C");
        } else if (altura<1.20 && peso>=60 && peso<=90) {
            System.out.println("classificao D");
        } else if (altura>=1.20 && altura<=1.70 && peso>=60 && peso<=90) {
            System.out.println("classificao E");
        } else if (altura>1.70 && peso>=60 && peso<=90) {
            System.out.println("classificao F");
        } else if (altura<1.20 && peso>90) {
            System.out.println("classificacao G");
        } else if (altura>=1.20 && altura<=1.70 && peso>90) {
            System.out.println("classificao H");
        } else if (altura>1.70 && peso>90) {
            System.out.println("classificacao I");
        }else {
            System.out.println("INVALIDO");
        }
    }
}
