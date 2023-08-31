import java.util.Scanner;

public class questionario {
    public static void main(String args[]) {
        Scanner aula = new Scanner(System.in);
        int cont=0;
        int error=0;

        System.out.println("escolha um numero de 1 a 100: ");
        int num1 = aula.nextInt();

        System.out.println("escolha um numero de 1 a 100: ");
        int num2 = aula.nextInt();

        System.out.println();
        System.out.println("qual eh a soma de " + num1 + " + " + num2 + ": ");
        int soma = aula.nextInt();
        int somatoria = num1 + num2;
        if (soma == somatoria) {
            System.out.println("acertou");
            cont++;
        } else {
            System.out.println("errou");
            error++;
        }

        System.out.println();
        System.out.println("qual eh a subtracao de " + num1 + " - " + num2 + ": ");
        int sub = aula.nextInt();
        int subtrair = num1 - num2;
        if (sub == subtrair) {
            System.out.println("acertou");
            cont++;
        } else {
            System.out.println("errou");
            error++;
        }

        System.out.println();
        System.out.println("qual eh a multiplicacao de " + num1 + " * " + num2 + ": ");
        int mult = aula.nextInt();
        int multi = num1 * num2;
        if (mult==multi) {
            System.out.println("acertou");
            cont++;
        } else {
            System.out.println("errou");
            error++;
        }

        System.out.println();
        System.out.println("qual eh a divisao de " + num1 + " / " + num2 + ": ");
        int div = aula.nextInt();
        int divisao = num1 / num2;
        if (div==divisao) {
            System.out.println("acertou");
            cont++;
        } else {
            System.out.println("errou");
            error++;
        }

        System.out.println();
        System.out.println("os numeros " + num1 + " e " + num2 + " qual eh o maior: ");
        int maior = aula.nextInt();
        if (num1>num2){
            System.out.println("acertou");
            cont++;
        } else if (num2>num1) {
            System.out.println("acertou");
            cont++;
        } else if (num1==num2) {
            System.out.println("voce acertou os dois numeros sao iguais");
            cont++;
        }else {
            System.out.println("errou");
            error++;
        }

        System.out.println();
        System.out.println("voce acertou "+cont+" perguntas");
        System.out.println("e errou "+error+" perguntas");
    }
}