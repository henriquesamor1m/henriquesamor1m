import java.util.Scanner;

public class Estacionamento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite a hora da chegada: ");
        int hora_chegada = scanner.nextInt();
        System.out.println("digite os minutos da chegada: ");
        int min_chegada = scanner.nextInt();

        System.out.println("digite a hora da partida: ");
        int hora_partida = scanner.nextInt();
        System.out.println("digite os minutos da partida: ");
        int min_partida = scanner.nextInt();

        int minutos_chegadasTotal = hora_chegada * 60 + min_chegada;
        int minutos_SaidaTotal = min_chegada * 60 + min_partida;
        int total = minutos_chegadasTotal - minutos_SaidaTotal;

        int horas = (total + 59) / 60;
        double preco = 0.0;

        if (horas >= 1 && horas <= 2) {
            preco = horas * 1.0;
            System.out.println("TEMPO ESTACIONADO: " + horas + " horas");
            System.out.println("PREÇO COBRADO: " + preco);
        } else if (horas >= 3 && horas <= 4) {
            preco = horas * 1.40;
            System.out.println("TEMPO ESTACIONADO: " + horas + " horas");
            System.out.println("PREÇO COBRADO: " + preco);
        } else {
            preco = horas * 2.0;
            System.out.println("TEMPO ESTACIONADO: " + horas + " horas");
            System.out.println("PREÇO COBRADO: " + preco);
        }
    }
}
