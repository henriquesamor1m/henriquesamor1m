import java.util.Scanner;

public class categorIdade {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.println("digite a nota do aluno: ");
        double nota = scan.nextDouble();

        System.out.println("digite a quantidade de falta do aluno: ");
        double falta = scan.nextDouble();

        if (nota >= 9.0 && nota <= 10.0 && falta <= 20) {
            System.out.println("A");
        } else if (nota >= 7.5 && nota <= 8.9 && falta <= 20) {
            System.out.println("B");
        } else if (nota >= 5.0 && nota <= 7.4 && falta <= 20) {
            System.out.println("C");
        } else if (nota >= 4.0 && nota <= 4.9 && falta <= 20) {
            System.out.println("D");
        } else if (nota >= 0.0 && nota <= 3.9 && falta <= 20) {
            System.out.println("E");
        } else if (nota >= 9.0 && nota <= 10.0 && falta > 20) {
            System.out.println("B");
        } else if (nota >= 7.5 && nota <= 8.9 && falta > 20) {
            System.out.println("C");
        } else if (nota >= 5.0 && nota <= 7.4 && falta > 20) {
            System.out.println("D");
        } else if (nota >= 4.0 && nota <= 4.9 && falta > 20) {
            System.out.println("E");
        } else if (nota >= 0.0 && nota <= 3.9 && falta > 20) {
            System.out.println("E");
        }
    }
}