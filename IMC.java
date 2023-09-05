import java.util.Scanner;
import java.lang.Math;

public class IMC {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.println("digite o peso do usuario: ");
        double peso = scan.nextDouble();

        System.out.println("digite a altura do usuario: ");
        double altura = scan.nextDouble();

        Double imc = peso / (Math.pow(altura, 2));

        if (imc < 18.5) {
            System.out.println("ABAIXO DO PESO");
        } else if (imc > 18.5 && imc <= 24.9) {
            System.out.println("SAUDÁVEL");
        } else if (imc > 24.9 && imc <= 29.9) {
            System.out.println("PESO EM EXCESSO");
        } else if (imc > 29.9 && imc <= 34.9) {
            System.out.println("OBESIDADE GRAU 1");
        } else if (imc > 34.9 && imc <= 39.9) {
            System.out.println("OBESIDADE GRAU 2 (SEVERA)");
        } else {
            System.out.println("OBESIDADE GRAU 3 (MORBIDA)");
        }
    }
}
