import java.util.Scanner;

public class aumentoTrabalho {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.println("digite o salario atual do funcionario: ");
        double salario = scan.nextDouble();

        System.out.println("o tempo de serviço do funcionario na empresa (numeros de ano de trabalho na empresa)");
        double tempoServico = scan.nextDouble();

        double aumento;
        double bonus;

        if (salario <= 500 && tempoServico < 1.0) {
            aumento = salario + (salario * 0.25);
            System.out.println("o salario atual agora eh de : " + aumento + " sem bonus");
        } else if (salario <= 1000 && tempoServico > 1 && tempoServico <= 3) {
            aumento = salario + (salario * 0.20);
            bonus = aumento + 100;
            System.out.println("o salario atual agora eh de : " + bonus + " ja com um bonus de 100,00 reais");
        } else if (salario <= 1500 && tempoServico > 4 && tempoServico <= 6) {
            aumento = salario + (salario * 0.15);
            bonus = aumento + 200;
            System.out.println("o salario atual agora eh de : " + bonus + " ja com um bonus de 200,00 reais");
        } else if (salario <= 2000 && tempoServico > 7 && tempoServico <= 10) {
            aumento = salario + (salario * 0.10);
            bonus = aumento + 300;
            System.out.println("o salario atual agora eh de : " + bonus + " ja com um bonus de 300,00 reais");
        } else if (salario>2000 && tempoServico>10){
            bonus = salario + 500;
            System.out.println("o salario atual agora eh de : " + bonus + " ja com um bonus de 500,00 reais");
        }else{
            System.out.println("o funcionario nao tem direito a nenhum aumento");
        }
    }
}