import java.util.Scanner;

public class validData {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.println("digite uma data no formato DD/MM/AAAA");
        String entrada = scan.nextLine();

        if (Validardata(entrada)) {
            System.out.println("a data eh valida");
        } else {
            System.out.println("a data eh iinvalida");
        }
    }


    public static boolean Validardata(String input) {
        String[] parts = input.split("/");
        if (parts.length != 3) {
            return false;
        }
        int dia = Integer.parseInt(parts[0]);
        int mes = Integer.parseInt(parts[1]);
        int ano = Integer.parseInt(parts[2]);

        if (mes < 1 || mes > 12) {
            return false;
        }
        if (dia < 1 || dia > DiasnoMes(mes, ano)) {
            return false;
        }
        return true;
    }

    public static int DiasnoMes(int mes, int ano) {
        if (mes == 2) {
            if (anobissexto(ano)) {
                return 29;
            } else {
                return 28;
            }
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            return 30;
        } else {
            return 31;
        }
    }

    public static boolean anobissexto(int ano) {
        return (ano % 4 == 0 && ano % 100 != 0 || (ano % 400 == 0));
    }
}
